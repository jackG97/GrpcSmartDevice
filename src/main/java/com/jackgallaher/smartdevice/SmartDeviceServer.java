package com.jackgallaher.smartdevice;

import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.ServerServiceDefinition;

import io.grpc.stub.StreamObserver;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

import java.io.IOException;
import java.util.Timer;
import java.util.TimerTask;
import java.util.logging.Logger;

import com.jackgallaher.smartdevice.smartPhoneGrpc.smartPhoneImplBase;




public class SmartDeviceServer extends smartPhoneImplBase  {
	
	private boolean phoneActive;

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
	 
	 @Override
     public void switchOn(com.google.protobuf.Empty request,
         io.grpc.stub.StreamObserver<PowerStatus> response) {
         phoneActive = true;
         
         response.onNext(PowerStatus.newBuilder()
                 .setStatus(phoneActive)
                 .build());
         response.onCompleted();
     }
	 
	    @Override
        public void switchOff(com.google.protobuf.Empty request,
            io.grpc.stub.StreamObserver<PowerStatus> response) {
            phoneActive = false; 
                        
            response.onNext(PowerStatus.newBuilder()
                    .setStatus(phoneActive)
                    .build());
            response.onCompleted();           
        }

}
