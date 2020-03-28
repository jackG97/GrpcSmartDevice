package com.jackgallaher.smartprojector;
using io.grpc.Server;
using io.grpc.ServerBuilder;
using io.grpc.ServerServiceDefinition;
using io.grpc.stub.StreamObserver;
using static;
io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;
using java.io.IOException;
using java.util.logging.Logger;
using com.google.protobuf.Empty;
using com.jackgallaher.smartprojector.Response;
using com.jackgallaher.smartprojector.PowerStatus;
using com.jackgallaher.smartprojector.smartProjectorGrpc.smartProjectorImplBase;
public class SmartProjectorServer : smartProjectorImplBase {
    
    private bool projectorActive;
    
    private static Logger logger = Logger.getLogger(SmartProjectorServer.class.getName());
    
    public static void main(String[] args) {
        SmartProjectorServer projectorserver = new SmartProjectorServer();
        int port = 50051;
        Server server = ServerBuilder.forPort(port).addService(projectorserver).build().start();
        logger.info(("Server started, listening on " + port));
        server.awaitTermination();
    }
    
    public void switchOn(Empty request, io.grpc.stub.StreamObserver<PowerStatus> response) {
        this.projectorActive = true;
        System.out.println("Projector is on");
        response.onNext(PowerStatus.newBuilder().setStatus(this.projectorActive).build());
        response.onCompleted();
    }
    
    public void switchOff(Empty request, io.grpc.stub.StreamObserver<PowerStatus> response) {
        this.projectorActive = false;
        System.out.println("Projector is Off");
        response.onNext(PowerStatus.newBuilder().setStatus(this.projectorActive).build());
        response.onCompleted();
    }
    
    [Override()]
    public void inputHDMI(Empty request, io.grpc.stub.StreamObserver<Response> responseObserver) {
        StringBuilder builder = new StringBuilder();
        String output = "Now in HDMI Mode";
        Response repsonse = Response.newBuilder().setText(output).build();
        responseObserver.onNext(repsonse);
        responseObserver.onCompleted();
    }
    
    public void inputVGA(Empty request, io.grpc.stub.StreamObserver<Response> responseObserver) {
        StringBuilder builder = new StringBuilder();
        String output = "Now in VGA Mode";
        Response repsonse = Response.newBuilder().setText(output).build();
        responseObserver.onNext(repsonse);
        responseObserver.onCompleted();
    }
}