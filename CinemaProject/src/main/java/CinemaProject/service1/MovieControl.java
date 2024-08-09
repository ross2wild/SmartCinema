package CinemaProject.service1;

import java.io.IOException;
import java.net.InetAddress;

import CinemaProject.service1.MovieControlGrpc.MovieControlImplBase;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;

import javax.jmdns.JmDNS;
import javax.jmdns.ServiceInfo;
import javax.swing.*;

//service 1
public class MovieControl extends MovieControlImplBase {
    // initiate server start-up
    public static void main(String[] args) throws InterruptedException, IOException {


        // Example of JmDNS registration
//        try {
//
//
//            JmDNS jmdns = JmDNS.create(InetAddress.getLocalHost());
//
//            // Register a service
//            ServiceInfo serviceInfo = ServiceInfo.create("_grpc_tcp.local.", "Movie Control Service", 50051, "Movie control service ");
//            jmdns.registerService(serviceInfo);
//            System.out.println("Service registered successfully.");
//
//        } catch (IOException ex) {
//            JOptionPane.showMessageDialog(null, ex.getMessage());
//        }

        MovieControl service1 = new MovieControl();
        int port = 50051;

        Server server = ServerBuilder.forPort(port)
                .addService(service1)
                .build()
                .start();

        System.out.println("MovieControl started, listening on " + port);

        server.awaitTermination();
    }

    //cinema has 3 screens
    //initiating booleans to false
    boolean screen1IsPlaying, screen2IsPlaying, screen3IsPlaying = false;

    @Override
    public void playMovie(PlayMovieRequest request, StreamObserver<PlayMovieResponse> responseObserver) {
        //play movie variables
        int screenId = request.getScreenId();
        String statusMessage;

        //checking if screen inputs are valid
        if (screenId < 1 || screenId > 3) {
            statusMessage = "Please enter a screen from 1-3";
        } else { //changing boolean values
            if (screenId == 1) {
                screen1IsPlaying = true;
            } else if (screenId == 2) {
                screen2IsPlaying = true;
            } else {
                screen3IsPlaying = true;
            }
            //output message
            statusMessage = "Playing movie on screen " + screenId;
        }

        //play movie response message
        PlayMovieResponse response = PlayMovieResponse.newBuilder().setStatus(statusMessage).build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();

    }

    @Override
    public void pauseMovie(PauseMovieRequest request, StreamObserver<PauseMovieResponse> responseObserver) {
        //pause movie value to send back
        int screenId = request.getScreenId();
        String statusMessage;

        //checking if movie and screen inputs are valid
        if (screenId < 1 || screenId > 3) {
            statusMessage = "Please enter a screen from 1-3";
        } else { //changing boolean values
            if (screenId == 1) {
                screen1IsPlaying = false;
            } else if (screenId == 2) {
                screen2IsPlaying = false;
            } else {
                screen3IsPlaying = false;
            }

            statusMessage = "Pausing movie on screen " + screenId;
        }

        //pause movie response message
        PauseMovieResponse response = PauseMovieResponse.newBuilder().setStatus(statusMessage).build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void monitorPlayback(MonitorPlaybackRequest request, StreamObserver<MonitorPlaybackResponse> responseObserver) {
        //get playback information for screen number.
        int screenId = request.getScreenId();
        String statusMessage;

        //validating screenId input
        if (screenId < 1 || screenId > 3) {
            statusMessage = "Please enter a screen from 1-3";
        } else {//if screen ID is correct, message tells user through a boolean if screen is playing
            if (screenId == 1){
                statusMessage = "Is film playing on screen " + screenId + ": " + screen1IsPlaying;
            } else if (screenId == 2) {
                statusMessage = "Is film playing on screen " + screenId + ": " + screen2IsPlaying;
            } else { //if screenId == 3
                statusMessage = "Is film playing on screen " + screenId + ": " + screen3IsPlaying;
            }
        }

        //moviePlayBack response message
        MonitorPlaybackResponse response = MonitorPlaybackResponse.newBuilder().setStatus(statusMessage).build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();

    }



}
