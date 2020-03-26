package com.jackgallaher.smartlaptop;

import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.ServerServiceDefinition;

import io.grpc.stub.StreamObserver;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

import java.io.IOException;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;
import java.util.logging.Logger;

import java.util.ArrayList;
import java.util.List;

import com.google.protobuf.Empty;
import com.jackgallaher.smartlaptop.Status;
import com.jackgallaher.smartlaptop.smartLaptopGrpc.smartLaptopImplBase;


public class SmartLaptopServer extends smartLaptopImplBase {
	
	private boolean laptopActive;
	 private boolean power_status = false;
     private int laptop_batterylife = 0;
	
	private static final Logger logger = Logger.getLogger(SmartLaptopServer.class.getName());

	
	 public static void main(String[] args) throws IOException, InterruptedException {
		 SmartLaptopServer laptopserver = new SmartLaptopServer();
		   
		    int port = 50051;
		    Server server = ServerBuilder.forPort(port)
		        .addService(laptopserver)
		        .build()
		        .start();
		    
		    logger.info("Server started, listening on " + port);
		    		     
		    server.awaitTermination();
	 }
	 
	 public void switchOn(Empty request,
        io.grpc.stub.StreamObserver<Status> response) {
        laptopActive = true;
        System.out.println("laptop is On");
        
        response.onNext(Status.newBuilder()
                .setStatus(laptopActive)
                .build());
        response.onCompleted();
    }
	 
	    public void switchOff(Empty request,
           io.grpc.stub.StreamObserver<Status> response) {
           laptopActive = false; 
           System.out.println("laptop is Off");
                       
           response.onNext(Status.newBuilder()
                   .setStatus(laptopActive)
                   .build());
           response.onCompleted();           
       }
	    
	      @Override
	        public void startCharging(Empty request, io.grpc.stub.StreamObserver<PowerStatus> responseObserver) 
	        {
	            Timer c = new Timer();
	            c.schedule(new Chargeup(responseObserver), 0, 2000);
	        }
	        
	        class Chargeup extends TimerTask {

	            StreamObserver<PowerStatus> streamObserver;

	            public Chargeup(StreamObserver<PowerStatus> status) {
	                streamObserver = status;
	            }
	            
	            @Override
	            public void run() {
	                if (laptop_batterylife < 100) {
	                	laptop_batterylife += 10;
	                    PowerStatus power_status = PowerStatus.newBuilder().setBatterylife(laptop_batterylife).build();
	                    streamObserver.onNext(power_status);
	                } else {
	                    PowerStatus power_status = PowerStatus.newBuilder().setStatusMsg("Laptop is at 100%, Charge Completed").setBatterylife(laptop_batterylife).build();
	                    streamObserver.onNext(power_status);
	                    streamObserver.onCompleted();
	                    this.cancel();
	                }
	            }
	        }
	        
	        public void laptopStatus(Empty request, io.grpc.stub.StreamObserver<PowerStatus> response)
	        {
	        	if(power_status == false) {
	        		response.onNext(PowerStatus.newBuilder().setStatus(power_status).setBatterylife(laptop_batterylife).build());
	        	}
	        	else
	        	{
	        		response.onNext(PowerStatus.newBuilder().setStatus(power_status).setBatterylife(laptop_batterylife).build());
	        	}
	        	response.onCompleted();
	        }
	        

}
