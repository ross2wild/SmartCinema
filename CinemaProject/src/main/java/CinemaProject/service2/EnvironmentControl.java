package CinemaProject.service2;

import java.io.IOException;

import CinemaProject.service2.EnvironmentControlGrpc.EnvironmentControlImplBase;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;

public class EnvironmentControl extends EnvironmentControlImplBase {
    // initiate server start-up
    public static void main(String[] args) throws InterruptedException, IOException {

        EnvironmentControl service2 = new EnvironmentControl();

        int port = 50052;

        Server server = ServerBuilder.forPort(port)
                .addService(service2)
                .build()
                .start();

        System.out.println("EnvironmentControl started, listening on " + port);

        server.awaitTermination();
    }

    @Override
    public void setTemperature(SetTemperatureRequest request, StreamObserver<SetTemperatureResponse> responseObserver) {
        //set variables
        float temperature = request.getTemperature();
        int screenId = request.getScreenId();
        String statusMessage;

        //code instructions
        //if statement checks screen ID entered is correct
        if (screenId < 1 || screenId > 3) {
            statusMessage = "Please enter a screen from 1-3";
        } else if (temperature < 14 || temperature > 25){ //validate if int entered is between 14 and 25
            statusMessage = "Invalid temperature. Please enter a value between 15 and 25";
        } else {
            statusMessage = "Temperature has been set to " + temperature + " for screen " + screenId;
        }

        //response message
        SetTemperatureResponse response = SetTemperatureResponse.newBuilder().setStatus(statusMessage).build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();

    }

    @Override
    public void setVolume(SetVolumeRequest request, StreamObserver<SetVolumeResponse> responseObserver) {
        //set variables
        int volumeLevel = request.getVolumeLevel();
        int screenId = request.getScreenId();
        String statusMessage;

        //code instructions
        if (screenId < 1 || screenId > 3) {
            statusMessage = "Please enter a screen from 1-3";
        } else if (volumeLevel < 0 || volumeLevel > 100){ //validate if int entered is between 0 - 100
            statusMessage = "Invalid volume level. Please enter a value between 0 and 100";
        } else {
            statusMessage = "Volume has been set to " + volumeLevel + " for screen " + screenId;
        }

        //response message
        SetVolumeResponse response = SetVolumeResponse.newBuilder().setStatus(statusMessage).build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void setLighting(SetLightingRequest request, StreamObserver<SetLightingResponse> responseObserver) {
        //set variables
        int lightingLevel = request.getLightingLevel();
        int screenId = request.getScreenId();
        String statusMessage;

        //code instructions
        if (screenId < 1 || screenId > 3) {
            statusMessage = "Please enter a screen from 1-3";
        } else if (lightingLevel < 0 || lightingLevel > 5){ //validate if int entered is between 0 - 5
            statusMessage = "Invalid light level. Please enter a value between 0 and 5";
        } else {
            statusMessage = "lighting has been set to " + lightingLevel + " for screen " + screenId;
        }

        //response message
        SetLightingResponse response = SetLightingResponse.newBuilder().setStatus(statusMessage).build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }
}


