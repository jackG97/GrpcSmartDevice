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

import com.google.protobuf.Empty;
import com.jackgallaher.smartdevice.smartPhoneGrpc.smartPhoneImplBase;


public class SmartDeviceServer extends smartPhoneImplBase  {
	
	private boolean phoneActive;
	
	//variables
	private List <Contacts> contacts;
	private String name;
	private Integer number;
	private String network;

	private static final Logger logger = Logger.getLogger(SmartDeviceServer.class.getName());

	//The lanuches on the port 50051 and will listen out for any requests and will await termination
	 public static void main(String[] args) throws IOException, InterruptedException {
		 SmartDeviceServer phoneserver = new SmartDeviceServer();
		   
		    int port = 50051;
		    Server server = ServerBuilder.forPort(port)
		        .addService(phoneserver)
		        .build()
		        .start();
		    
		    logger.info("Server started, listening on " + port);
		    		    
		    server.awaitTermination();
	 }
	 
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



