package client;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.InetAddress;
import java.util.concurrent.TimeUnit;
import javax.jmdns.JmDNS;
import javax.swing.*;
import java.net.InetAddress;
import javax.jmdns.JmDNS;
import javax.jmdns.ServiceEvent;
import javax.jmdns.ServiceInfo;
import javax.jmdns.ServiceListener;

import CinemaProject.service1.*;
import CinemaProject.service2.*;
import CinemaProject.service3.*;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.StatusRuntimeException;

public class ClientGUI implements ActionListener {

    //declaring variables for UI
    private final MovieControlGrpc.MovieControlBlockingStub movieControlStub;
    private final EnvironmentControlGrpc.EnvironmentControlBlockingStub environmentControlStub;
    private final TicketingControlGrpc.TicketingControlBlockingStub ticketingControlStub;

    private JFrame frame;
    private JTextField movieIdField, screenIdField, setTemperatureField, setVolumeField, setLightingField,
            quantityField, ticketIdField;
    private JButton playButton, pauseButton, monitorButton, setTemperatureButton, setVolumeButton,
            setLightingButton, purchaseTicketButton, reserveSeatButton, getScheduleButton;


    public ClientGUI() {
        //creating channels for connection to server
        ManagedChannel movieControlChannel = ManagedChannelBuilder.forAddress("localhost", 50051).useTransportSecurity().usePlaintext().build();
        ManagedChannel environmentControlChannel = ManagedChannelBuilder.forAddress("localhost", 50052).useTransportSecurity().usePlaintext().build();
        ManagedChannel ticketingControlChannel = ManagedChannelBuilder.forAddress("localhost", 50053).useTransportSecurity().usePlaintext().build();

        //initialising grpc stubs for each service
        movieControlStub = MovieControlGrpc.newBlockingStub(movieControlChannel);
        environmentControlStub = EnvironmentControlGrpc.newBlockingStub(environmentControlChannel);
        ticketingControlStub = TicketingControlGrpc.newBlockingStub(ticketingControlChannel);

        //cinema control panel
        frame = new JFrame("Smart Cinema Control Panel");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 600);
        frame.setLayout(new BorderLayout());

        String instructions = "Instructions:\n" +
                "1. Enter screen ID from 1-3 to control movie and environmental controls.\n" +
                "2. View the movie schedule to get movie ID information in order to purchase tickets.\n" +
                "3. Once a ticket is purchased, use the ticket ID to reserve seats.";
        JOptionPane.showMessageDialog(frame, instructions, "How to use", JOptionPane.INFORMATION_MESSAGE);

        //screen id panel
        JPanel topPanel = new JPanel();
        topPanel.setLayout(new GridLayout(2, 2));
        topPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 30, 10));

        JLabel screenIdLabel = new JLabel("Screen ID:");
        screenIdField = new JTextField(10);

        topPanel.add(screenIdLabel);
        topPanel.add(screenIdField);

        frame.add(topPanel, BorderLayout.NORTH);

        //main panel
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new GridLayout(3, 1));

        //MovieControl panel
        JPanel moviePanel = new JPanel();
        moviePanel.setLayout(new GridLayout(4, 3));

        playButton = new JButton("Play Movie");
        pauseButton = new JButton("Pause Movie");
        monitorButton = new JButton("Monitor Playback");

        //listeners
        playButton.addActionListener(this);
        pauseButton.addActionListener(this);
        monitorButton.addActionListener(this);

        moviePanel.add(playButton);
        moviePanel.add(pauseButton);
        moviePanel.add(monitorButton);

        //Environment Control Panel
        JPanel environmentPanel = new JPanel();
        environmentPanel.setLayout(new GridLayout(4, 3));

        JLabel temperatureLabel = new JLabel("Enter temperature (15-25):");
        JLabel volumeLabel = new JLabel("Enter volume (0-100):");
        JLabel lightingLabel = new JLabel("Enter lighting level (1-5):");

        setTemperatureField = new JTextField();
        setVolumeField = new JTextField();
        setLightingField = new JTextField();

        setTemperatureButton = new JButton("Set Temperature");
        setVolumeButton = new JButton("Set Volume");
        setLightingButton = new JButton("Set Lighting");

        setTemperatureButton.addActionListener(this);
        setVolumeButton.addActionListener(this);
        setLightingButton.addActionListener(this);

        environmentPanel.add(temperatureLabel);
        environmentPanel.add(setTemperatureField);
        environmentPanel.add(setTemperatureButton);
        environmentPanel.add(volumeLabel);
        environmentPanel.add(setVolumeField);
        environmentPanel.add(setVolumeButton);
        environmentPanel.add(lightingLabel);
        environmentPanel.add(setLightingField);
        environmentPanel.add(setLightingButton);

        //Ticketing Control Panel
        JPanel ticketingPanel = new JPanel();
        ticketingPanel.setLayout(new GridLayout(5, 3));

        JLabel movieIdLabel = new JLabel("Movie ID: ");
        movieIdField = new JTextField();
        JLabel quantityLabel = new JLabel("Ticket Quantity:");
        quantityField = new JTextField();
        purchaseTicketButton = new JButton("Purchase Ticket");

        JLabel ticketIdLabel = new JLabel("Ticket ID: ");
        ticketIdField = new JTextField();
        reserveSeatButton = new JButton("Reserve Seat");

        getScheduleButton = new JButton("Get Movie Schedule");

        purchaseTicketButton.addActionListener(this);
        reserveSeatButton.addActionListener(this);
        getScheduleButton.addActionListener(this);

        ticketingPanel.add(getScheduleButton);
        ticketingPanel.add(new JLabel());
        ticketingPanel.add(new JLabel());
        ticketingPanel.add(movieIdLabel);
        ticketingPanel.add(movieIdField);
        ticketingPanel.add(new JLabel());
        ticketingPanel.add(quantityLabel);
        ticketingPanel.add(quantityField);
        ticketingPanel.add(purchaseTicketButton);
        ticketingPanel.add(ticketIdLabel);
        ticketingPanel.add(ticketIdField);
        ticketingPanel.add(reserveSeatButton);


        // Add panels to frame
        mainPanel.add(moviePanel);
        mainPanel.add(environmentPanel);
        mainPanel.add(ticketingPanel);

        // main panel
        frame.add(mainPanel, BorderLayout.CENTER);

        // Display the frame
        frame.setVisible(true);
    }

    @Override //action handler to respond to the buttons
    public void actionPerformed(ActionEvent e) {

        Object source = e.getSource();
        int screenId = -1;
        String movieId = movieIdField.getText();

        //validating screen ID is entered for corresponding buttons
        if (source == playButton || source == pauseButton || source == monitorButton || source == setTemperatureButton
        || source == setLightingButton || source == setVolumeButton) {
            if (screenIdField.getText().isEmpty()) { //validating screen id is not empty
                JOptionPane.showMessageDialog(frame, "Screen ID must be a number");
                return;
            }
            try { //screen id gets converted to int
                screenId = Integer.parseInt(screenIdField.getText());
            } catch (NumberFormatException ex){
                JOptionPane.showMessageDialog(frame, "Invalid screen ID format");
                return;
            }
        }

        if (source == playButton) { //if play movie is clicked
            PlayMovieRequest request = PlayMovieRequest.newBuilder()
                    .setScreenId(screenId)
                    .build();
            PlayMovieResponse response = movieControlStub
                    .withDeadlineAfter(5, TimeUnit.SECONDS)
                    .playMovie(request);
            JOptionPane.showMessageDialog(frame, response.getStatus());
        } else if (source == pauseButton) { //if pause movie is clicked
            PauseMovieRequest request = PauseMovieRequest.newBuilder()
                    .setScreenId(screenId)
                    .build();
            PauseMovieResponse response = movieControlStub.withDeadlineAfter(5, TimeUnit.SECONDS).pauseMovie(request);
            JOptionPane.showMessageDialog(frame, response.getStatus());
        } else if (source == monitorButton) {
            MonitorPlaybackRequest request = MonitorPlaybackRequest.newBuilder()
                    .setScreenId(screenId)
                    .build();
            MonitorPlaybackResponse response = movieControlStub.withDeadlineAfter(5, TimeUnit.SECONDS).monitorPlayback(request);
            JOptionPane.showMessageDialog(frame, response.getStatus());
        } else if (source == setTemperatureButton) {
            if (setTemperatureField.getText().isEmpty()){
                JOptionPane.showMessageDialog(frame, "Temperature field cannot be empty");
                return;
            }
            int temperature = Integer.parseInt(setTemperatureField.getText());
            SetTemperatureRequest request = SetTemperatureRequest.newBuilder()
                    .setScreenId(screenId)
                    .setTemperature(temperature)
                    .build();
            SetTemperatureResponse response = environmentControlStub.withDeadlineAfter(5, TimeUnit.SECONDS).setTemperature(request);
            JOptionPane.showMessageDialog(frame, response.getStatus());
        } else if (source == setVolumeButton) {
            if (setVolumeField.getText().isEmpty()){
                JOptionPane.showMessageDialog(frame, "Volume field cannot be empty");
                return;
            }
            int volume = Integer.parseInt(setVolumeField.getText());
            SetVolumeRequest request = SetVolumeRequest.newBuilder()
                    .setScreenId(screenId)
                    .setVolumeLevel(volume)
                    .build();
            SetVolumeResponse response = environmentControlStub.withDeadlineAfter(5, TimeUnit.SECONDS).setVolume(request);
            JOptionPane.showMessageDialog(frame, response.getStatus());
        } else if (source == setLightingButton) {
            if (setLightingField.getText().isEmpty()){
                JOptionPane.showMessageDialog(frame, "Lighting field cannot be empty");
                return;
            }
            int lighting = Integer.parseInt(setLightingField.getText());
            SetLightingRequest request = SetLightingRequest.newBuilder()
                    .setScreenId(screenId)
                    .setLightingLevel(lighting)
                    .build();
            SetLightingResponse response = environmentControlStub.withDeadlineAfter(5, TimeUnit.SECONDS).setLighting(request);
            JOptionPane.showMessageDialog(frame, response.getStatus());
        } else if (source == purchaseTicketButton) {
            try { //try catch block
                int quantity = Integer.parseInt(quantityField.getText());


            PurchaseTicketRequest request = PurchaseTicketRequest.newBuilder()
                    .setMovieId(movieId)
                    .setQuantity(quantity)
                    .build();
            PurchaseTicketResponse response = ticketingControlStub.withDeadlineAfter(5, TimeUnit.SECONDS).purchaseTicket(request);
            JOptionPane.showMessageDialog(frame, response.getStatus());
            } catch (StatusRuntimeException ex){
                JOptionPane.showMessageDialog(frame, "RPC failed: " + ex.getStatus());
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(frame, "An unexpected error occurred" + ex.getMessage());
            }
        } else if (source == reserveSeatButton) {
            int ticketId = Integer.parseInt(ticketIdField.getText());
            ReserveSeatRequest request = ReserveSeatRequest.newBuilder()
                    .setTicketId(ticketId)
                    .build();
            ReserveSeatResponse response = ticketingControlStub.withDeadlineAfter(5, TimeUnit.SECONDS).reserveSeat(request);
            JOptionPane.showMessageDialog(frame, response.getStatus());
        } else if (source == getScheduleButton) {
            GetMovieScheduleRequest request = GetMovieScheduleRequest.newBuilder().build();
            GetMovieScheduleResponse response = ticketingControlStub.withDeadlineAfter(5, TimeUnit.SECONDS).getMovieSchedule(request);

            // building the schedule string from the response
            StringBuilder schedule = new StringBuilder("Movie Schedule:\n");
            for (MovieSchedule movieSchedule : response.getMovieSchedulesList()) {
                schedule.append("Screen ").append(movieSchedule.getScreenId()).append(": ")
                        .append(movieSchedule.getTitle()).append(" (ID: ").append(movieSchedule.getMovieId()).append(") - Showtime: ")
                        .append(movieSchedule.getShowtime()).append("\n");
            }
            //outputting schedule in a dialog box
            JOptionPane.showMessageDialog(frame, schedule.toString());
        }
    }


    //main method that launches gui
    public static void main(String[] args) {
        SwingUtilities.invokeLater(ClientGUI::new);
    }
}
