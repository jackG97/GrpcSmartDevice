package com.jackgallaher.smartprojector;


import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.ServerServiceDefinition;

import io.grpc.stub.StreamObserver;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

import java.io.IOException;

import java.util.logging.Logger;


import com.google.protobuf.Empty;
import com.jackgallaher.smartprojector.Response;
import com.jackgallaher.smartprojector.PowerStatus;
import com.jackgallaher.smartprojector.smartProjectorGrpc.smartProjectorImplBase;

public class SmartProjectorServer extends smartProjectorImplBase {
	
	private boolean projectorActive;
	private static final Logger logger = Logger.getLogger(SmartProjectorServer.class.getName());
	
	
	public static void main(String[] args) throws IOException, InterruptedException{
		SmartProjectorServer projectorserver = new SmartProjectorServer();
		
		int port = 50051;
		Server server = ServerBuilder.forPort(port)
				.addService(projectorserver)
				.build()
				.start();
			    logger.info("Server started, listening on " + port);
	    
	    		server.awaitTermination();
		}
	
	public void switchOn(Empty request,
	        io.grpc.stub.StreamObserver<PowerStatus> response) {
		projectorActive = true;
		System.out.println("Projector is on");
		
		response.onNext(PowerStatus.newBuilder()
				.setStatus(projectorActive)
				.build());
		response.onCompleted();
	}
	
	public void switchOff(Empty request, 
			io.grpc.stub.StreamObserver<PowerStatus> response) {
	           projectorActive = false; 
	           System.out.println("Projector is Off");
	                       
	           response.onNext(PowerStatus.newBuilder()
	                   .setStatus(projectorActive)
	                   .build());
	           response.onCompleted();           
	       }
	
	@Override
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
	
	


