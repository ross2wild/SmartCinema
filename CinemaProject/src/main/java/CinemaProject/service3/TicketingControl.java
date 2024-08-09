package CinemaProject.service3;


import java.io.IOException;
import CinemaProject.service3.TicketingControlGrpc.TicketingControlImplBase;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;





public class TicketingControl extends TicketingControlImplBase {
    //initiate server start up
    public static void main(String[] args) throws InterruptedException, IOException {
        TicketingControl service3 = new TicketingControl();

        int port = 50053;

        Server server = ServerBuilder.forPort(port)
                .addService(service3)
                .build()
                .start();

        System.out.println("TicketingControl started, listening on " + port);

        server.awaitTermination();
    }

    //ticketing counter and array that stores bought ticket information
    private int ticketCounter = 1000; //ticketID starts at 1000
    private TicketInfo[] tickets = new TicketInfo[1000];

    @Override
    public void purchaseTicket(PurchaseTicketRequest request, StreamObserver<PurchaseTicketResponse> responseObserver) {

        String movieId = request.getMovieId();
        int quantity = request.getQuantity();
        String statusMessage;

        //checks that a movie id was entered
        if (movieId == null || movieId.trim().isEmpty()) {
            statusMessage = "Movie ID can not be empty";
            PurchaseTicketResponse response = PurchaseTicketResponse.newBuilder().setStatus(statusMessage).build();
            responseObserver.onNext(response);
            responseObserver.onCompleted();
            return;
        }
        //tickets are limited to a max of 5 per booking
        if (quantity < 1 || quantity > 5) {
            statusMessage = "You can only purchase between 1 and 5 tickets";
        } else {
            int ticketId = ticketCounter++; //ticketID is incremented each purchase
            tickets[ticketId - 1000] = new TicketInfo(movieId, quantity); //ticketID & quantity is stored in array
            statusMessage = "Purchased " + quantity + " tickets for movie " + movieId + ". Your unique ticketId for reserving seats is: " +
                    ticketId;
        }

        PurchaseTicketResponse response = PurchaseTicketResponse.newBuilder().setStatus(statusMessage).build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void reserveSeat(ReserveSeatRequest request, StreamObserver<ReserveSeatResponse> responseObserver) {
        int ticketId = request.getTicketId();
        String statusMessage;
        String seatNumbers = "";

        //if ticket doesnt match or is null
        if (ticketId < 1000 || ticketId >= ticketCounter || tickets[ticketId - 1000] == null) {
            statusMessage = "Invalid ticket";
        } else {
            TicketInfo ticketInfo = tickets[ticketId - 1000];
            int quantity = ticketInfo.quantity; //gets the number of seats needed to book

            // generates a block of contiguous seat numbers
            int startSeat = 1 + (ticketId - 1000) % 100; // starting seat number
            for (int i = 0; i < quantity; i++) { // loops through the quantity of seats and appends each seat number to the seatnumbers string
                seatNumbers += (startSeat + i) + " ";
            }
            statusMessage = "Reserved seats: " + seatNumbers.trim();
        }

            ReserveSeatResponse response = ReserveSeatResponse.newBuilder().setStatus(statusMessage).build();
            responseObserver.onNext(response);
            responseObserver.onCompleted();

    }

        @Override
        public void getMovieSchedule (GetMovieScheduleRequest
        request, StreamObserver < GetMovieScheduleResponse > responseObserver){

        //list of movie schedules
            GetMovieScheduleResponse response = GetMovieScheduleResponse.newBuilder()
                    .addMovieSchedules(MovieSchedule.newBuilder()
                            .setTitle("Toy Story")
                            .setMovieId("1111")
                            .setShowtime("Tonight 19:00")
                            .setScreenId(1)
                            .build())
                    .addMovieSchedules(MovieSchedule.newBuilder()
                            .setTitle("Jaws")
                            .setMovieId("1112")
                            .setShowtime("Tonight 20:00")
                            .setScreenId(2)
                            .build())
                    .addMovieSchedules(MovieSchedule.newBuilder()
                            .setTitle("Halloween")
                            .setMovieId("1113")
                            .setShowtime("Tonight 21:00")
                            .setScreenId(3)
                            .build())
                    .build();

            responseObserver.onNext(response);
            responseObserver.onCompleted();
        }
        class TicketInfo {
            private String movieId;
            private int quantity;

            TicketInfo(String movieId, int quantity) {
                this.movieId = movieId;
                this.quantity = quantity;
            }
        }

    }



