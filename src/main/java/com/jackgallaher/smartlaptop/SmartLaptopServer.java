package com.jackgallaher.smartlaptop;

import java.io.IOException;
import java.util.logging.Logger;

import com.google.protobuf.Empty;
import com.jackgallaher.smartdevice.PowerStatus;
import com.jackgallaher.smartdevice.SmartDeviceServer;

import io.grpc.Server;
import io.grpc.ServerBuilder;

public class SmartLaptopServer {
	
	private boolean laptopActive;
	
	private static final Logger logger = Logger.getLogger(SmartDeviceServer.class.getName());

	
	 public static void main(String[] args) throws IOException, InterruptedException {
		 SmartDeviceServer stringserver = new SmartDeviceServer();
		   
		    int port = 50051;
		    Server server = ServerBuilder.forPort(port)
		        .addService(stringserver)
		        .build()
		        .start();
		    
		    logger.info("Server started, listening on " + port);
		    		    
		    server.awaitTermination();
	 }
	 
	 public void switchOn(Empty request,
        io.grpc.stub.StreamObserver<PowerStatus> response) {
        laptopActive = true;
        System.out.println("laptop is On");
        
        response.onNext(PowerStatus.newBuilder()
                .setStatus(laptopActive)
                .build());
        response.onCompleted();
    }
	 
	    public void switchOff(Empty request,
           io.grpc.stub.StreamObserver<PowerStatus> response) {
           laptopActive = false; 
           System.out.println("laptop is Off");
                       
           response.onNext(PowerStatus.newBuilder()
                   .setStatus(laptopActive)
                   .build());
           response.onCompleted();           
       }

}
