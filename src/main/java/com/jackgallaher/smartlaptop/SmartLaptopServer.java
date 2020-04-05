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

import com.jackgallaher.smartlaptop.Empty;
import com.jackgallaher.smartdevice.SmartDeviceServer;
import com.jackgallaher.smartdevice.smartPhoneGrpc;
import com.jackgallaher.smartlaptop.Status;
import com.jackgallaher.smartlaptop.smartLaptopGrpc.smartLaptopImplBase;
import com.jackgallaher.jmdns.JmDNSRegistrationHelper;


public class SmartLaptopServer {
	
	//varibles
	private int port = 50051;
	private Server server;
	
	private static final Logger logger = Logger.getLogger(SmartLaptopServer.class.getName());

	//The lanuches on the port 50051 and will listen out for any requests and will await termination
	 private void start() throws Exception {
		    Server server = ServerBuilder.forPort(port)
		        .addService(new SmartLaptopImpl())
		        .build()
		        .start();
		    JmDNSRegistrationHelper helper = new JmDNSRegistrationHelper("SmartLaptop", "_laptop._udp.local.", "",port);
		    logger.info("Server started, listening on " + port);
		    Runtime.getRuntime().addShutdownHook(new Thread() {
		    	// Use stderr here since the logger may have been reset by its JVM shutdown hook
		    	public void run() {
		    		System.err.println("Grpc server is shutting down");
		    		SmartLaptopServer.this.stop();
		    		System.err.println("Shutdown");
		    	}
		    });
	 }
	 
	 public void stop() {
		 if (server != null) {
			 server.shutdown();
		 }
	 }
		    	
	// Await termination on the main thread since the grpc library uses daemon threads
	 public void blockUntilShutdown() throws InterruptedException {
		 if (server != null) {
			 server.awaitTermination();
		}
		
	 }
	 
	 private class SmartLaptopImpl extends smartLaptopGrpc.smartLaptopImplBase {
	 
	
	 private boolean power_status = false;
	 private boolean power_status1 = true;
     private int laptop_batterylife = 0;
	 
	 //This method is based on a boolean statement stating that the laptop being switched on is true
	 public void switchOn(Empty request,
        io.grpc.stub.StreamObserver<Status> response) {
		 power_status1 = true;
        System.out.println("laptop is On");
        
        response.onNext(Status.newBuilder()
                .setStatus(power_status1)
                .build());
        response.onCompleted();
    }
	 
		//This method is based on a boolean statement stating that the laptop being switched off is false
	    public void switchOff(Empty request,
           io.grpc.stub.StreamObserver<Status> response) {
	    	power_status = false; 
           System.out.println("laptop is Off");
                       
           response.onNext(Status.newBuilder()
                   .setStatus(power_status)
                   .build());
           response.onCompleted();           
       }
	    
	    //this method is used to charge laptop. it uses server streaming where each stream represents the battery life of the laptop increaseing by 10%
	    //the final stream is the output stating the laptop is fully charged.
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
	                    PowerStatus power_status = PowerStatus.newBuilder().setStatusMsg("Charging").setBatterylife(laptop_batterylife).build();
	                    streamObserver.onNext(power_status);
	                } else {
	                    PowerStatus power_status = PowerStatus.newBuilder().setStatusMsg("Laptop is at 100%, Charge Completed").setBatterylife(laptop_batterylife).build();
	                    streamObserver.onNext(power_status);
	                    streamObserver.onCompleted();
	                    this.cancel();
	                }
	            }
	        }
	        
	        //this method returns the status of the lap such off whether its off or charged.
	        public void laptopStatus(Empty request, io.grpc.stub.StreamObserver<PowerStatus> response)
	        {
	        	if(power_status == false) {
	        		response.onNext(PowerStatus.newBuilder().setStatus(power_status).setBatterylife(laptop_batterylife).build());
	        	}
	        	else
	        	{
	        		response.onNext(PowerStatus.newBuilder().setStatus(power_status1).setBatterylife(laptop_batterylife).build());
	        	}
	        	response.onCompleted();
	        }
	        
	        
	 }
	        
	// Main launches the server from the command line
	    	public static void main(String []args) throws Exception{
	    		final SmartLaptopServer laptop_server = new SmartLaptopServer();
	    		laptop_server.start();
	    		laptop_server.blockUntilShutdown();
	    	}
	    }

