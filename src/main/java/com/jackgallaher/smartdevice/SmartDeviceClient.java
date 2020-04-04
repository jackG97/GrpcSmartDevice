package com.jackgallaher.smartdevice;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

import com.jackgallaher.jmdns.jmDNSServiceTracker;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

import io.grpc.stub.StreamObserver;

import com.jackgallaher.jmdns.ServiceDescription;
import com.jackgallaher.jmdns.ServiceObserver;


public class SmartDeviceClient implements ServiceObserver {
	
	  	protected ServiceDescription current;
	    private final String serviceType;
	    private final String name;
	    private static final Logger logger = Logger.getLogger(SmartDeviceClient.class.getName());
	    
	    private ManagedChannel channel;
	    private static smartPhoneGrpc.smartPhoneBlockingStub blockstub;
	   
	   public SmartDeviceClient() {
		   serviceType = "_phone._udp.local.";
		   name = "Smart Phone";
		   jmDNSServiceTracker clientmanager = jmDNSServiceTracker.getInstance();
		   
		   serviceAdded(new ServiceDescription("localhost", 50051));
		   
	   }
	   
	   String getServiceType() {
		   return serviceType;
	   }
	    
	    
		@Override
		public boolean interested(String type) {
			// TODO Auto-generated method stub
			return serviceType.equals(type);
		}
		@Override
		public List<String> serviceInterests() {
			// TODO Auto-generated method stub
			List<String> interests = new ArrayList<String>();
			interests.add(serviceType);
			return interests;
		}
		@Override
		public void serviceAdded(ServiceDescription service) {
			// TODO Auto-generated method stub
			System.out.println("Address: " +service.getAddress());
			current = service;
			channel = ManagedChannelBuilder.forAddress(service.getAddress(), service.getPort()).usePlaintext(true).build();
			blockstub = smartPhoneGrpc.newBlockingStub(channel);
			
		}
		@Override
		public String getName() {
			// TODO Auto-generated method stub
			return name;
		}
		
		
		public void shutdown() throws InterruptedException {
			channel.shutdown().awaitTermination(3, TimeUnit.SECONDS);
		}
		
		
		
		public static void switchOn() {
			System.out.println("The Phone is turning on");
			try {
				Empty request = Empty.newBuilder().build();
				PowerStatus power_status = blockstub.switchOn(request);
			} catch (RuntimeException e) {
				logger.log(Level.WARNING, "RPC Failure", e);
				return;
			}
		}
		
		public static void switchOff() {
			System.out.println("The Phone is turning off");
			try {
				Empty request = Empty.newBuilder().build();
				PowerStatus power_status = blockstub.switchOff(request);
			} catch (RuntimeException e) {
				logger.log(Level.WARNING, "RPC Failure", e);
				return;
			}
		}
		
		
		public static void findContacts() {
			Empty request = Empty.newBuilder().build();
			
			StreamObserver<Contacts> responseObserver = new StreamObserver<Contacts>() {

				@Override
				public void onNext(Contacts value) {
					// TODO Auto-generated method stub
					System.out.println("receiving " + value.getName());
					System.out.println("receiving " + value.getNumber());
					System.out.println("receiving " + value.getNetwork());
				}

				@Override
				public void onError(Throwable t) {
					// TODO Auto-generated method stub
					
				}

				@Override
				public void onCompleted() {
					// TODO Auto-generated method stub
					
				}
				
			};
		}
		
		public static void addcontact() {
			Contacts request = Contacts.newBuilder().setName("Phil").setNumber("0875643652").setNetwork("Vodafone").build();
			
			Response contacts = blockstub.addContact(request);
			
			System.out.println(contacts.getText());
			
		}
		
		
		
		@Override
		public void switchService(String name) {
			// TODO Auto-generated method stub
			
		}
		
		
		public static void main (String[] args) throws InterruptedException{
			SmartDeviceClient client = new SmartDeviceClient();
			
			client.switchOn();
			
			client.switchOff();
			
			client.findContacts();
			
			client.addcontact();
		}

}
