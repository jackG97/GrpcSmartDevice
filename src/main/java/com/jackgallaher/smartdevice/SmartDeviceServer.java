package com.jackgallaher.smartdevice;

import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.ServerServiceDefinition;

import io.grpc.stub.StreamObserver;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

import java.io.IOException;
import java.util.List;

import java.util.logging.Logger;

import java.util.ArrayList;
import java.util.List;

import com.jackgallaher.smartdevice.Empty;
import com.jackgallaher.jmdns.JmDNSRegistrationHelper;
import com.jackgallaher.smartdevice.smartPhoneGrpc.smartPhoneImplBase;


public class SmartDeviceServer  {

	//variables for server and port being used
	private int port = 50051;
	private Server server;

	private static final Logger logger = Logger.getLogger(SmartDeviceServer.class.getName());

	//The launches on the port 50051 and will listen out for any requests and will await termination
	private void start() throws Exception {
		    Server server = ServerBuilder.forPort(port)
		        .addService(new SmartPhoneImpl())
		        .build()
		        .start();
		    JmDNSRegistrationHelper helper = new JmDNSRegistrationHelper("SmartDevice", "_phone._udp.local.", "",port);
		    logger.info("Server started, listening on " + port);
		    Runtime.getRuntime().addShutdownHook(new Thread() {	
		    	
		   // Use stderr here since the logger may have been reset by its JVM shutdown hook
		    public void run() {
		    	System.err.println("Grpc server is shutting down");
		    	SmartDeviceServer.this.stop();
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
	
	private class SmartPhoneImpl extends smartPhoneGrpc.smartPhoneImplBase {
		
		//variables
		private List <Contacts> contacts;
		private String name;
		private Integer number;
		private String network;
		private boolean phoneActive;
	
	 
	 //This method is based on a boolean statement stating that the phone being switched on is true
	 public void switchOn(Empty request,
         io.grpc.stub.StreamObserver<PowerStatus> response) {
         phoneActive = true;
         System.out.println("Phone is On");
         
         response.onNext(PowerStatus.newBuilder()
                 .setStatus(phoneActive)
                 .build());
         response.onCompleted();
     }
	 
	//This method is based on a boolean statement stating that the phone being switched off is false
	    public void switchOff(Empty request,
            io.grpc.stub.StreamObserver<PowerStatus> response) {
            phoneActive = false; 
            System.out.println("Phone is Off");
                        
            response.onNext(PowerStatus.newBuilder()
                    .setStatus(phoneActive) 
                    .build());
            response.onCompleted();           
        }
	    
	    //method is used to retrieve contacts on phone from the arraylist
	    public void findContacts(Empty request, io.grpc.stub.StreamObserver<Contacts> responseObserver) {
	    	//arraylist of contacts
	    	 contacts = new ArrayList<Contacts>();
	            Contacts first = Contacts.newBuilder().setName("James").setNumber("0878923456").setNetwork("Three").build();
	            Contacts second = Contacts.newBuilder().setName("Ray").setNumber("0867864563").setNetwork("Three").build();
	            Contacts third = Contacts.newBuilder().setName("Rachel").setNumber("0896753487").setNetwork("Virgin Media").build();
	            Contacts fourth = Contacts.newBuilder().setName("Sarah").setNumber("0857834569").setNetwork("Vodafone").build();
	            
	            contacts.add(first);
	            contacts.add(second);
	            contacts.add(third);
	            contacts.add(fourth);
	           
	           
	           responseObserver.onNext(first);
	           responseObserver.onNext(second);
	           responseObserver.onNext(third);
	           responseObserver.onNext(fourth);
	           
	           
	            
		System.out.println(contacts);
    
   responseObserver.onCompleted();
	             
	    
	    }
	    
	    //this method is used to add a contact to a phone
	    public void addContact(Contacts request, io.grpc.stub.StreamObserver<Response> responseObserver) {
	    	StringBuilder builder = new StringBuilder(request.getNumber());
			String output = "Contact Successfully Addded";
			
			Response contacts = Response.newBuilder().setText(output).build();
			responseObserver.onNext(contacts);
			
			
			responseObserver.onCompleted();
			System.out.println("Contact successfully added");
		}
	   
	    
	    }
	
	// Main launches the server from the command line
	public static void main(String []args) throws Exception{
		final SmartDeviceServer phone_server = new SmartDeviceServer();
		phone_server.start();
		phone_server.blockUntilShutdown();
	}
	
}



