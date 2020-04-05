package com.jackgallaher.smartpda;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

import com.jackgallaher.jmdns.ServiceDescription;
import com.jackgallaher.jmdns.ServiceObserver;
import com.jackgallaher.jmdns.JmDNSServiceDiscovery;
import com.jackgallaher.smartlaptop.SmartLaptopClient;
import com.jackgallaher.smartpda.Empty;
import com.jackgallaher.smartpda.SmartPdaClient;
import com.jackgallaher.smartpda.PowerStatus;
import com.jackgallaher.smartpda.smartPdaGrpc;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

public class SmartPdaClient implements ServiceObserver {
	
	protected ServiceDescription current;
    private final String serviceType;
    private final String name;
    private static final Logger logger = Logger.getLogger(SmartPdaClient.class.getName());
    
    private ManagedChannel channel;
    private static smartPdaGrpc.smartPdaBlockingStub blockstub;
    
    
    
    public SmartPdaClient() {
    	serviceType = "_pda._udp.local";
    	name = "Smart Pda";
    	
    	
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
		blockstub = smartPdaGrpc.newBlockingStub(channel);
	}
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}
	
	public void shutdown() throws InterruptedException {
		channel.shutdown().awaitTermination(3, TimeUnit.SECONDS);
	}
	
	//client side for switching on pda
	public static void switchOn() {
		System.out.println("The Pda is turning on");
		//error handling using try catch
		try {
			Empty request = Empty.newBuilder().build();
			PowerStatus power_status = blockstub.switchOn(request);
			//error handling using try catch
		} catch (RuntimeException e) {
			logger.log(Level.WARNING, "RPC Failure", e);
			return;
		}
	}
	//client side for switching off pda
	public static void switchOff() {
		System.out.println("The Pda is turning off");
		//error handling using try catch
		try {
			Empty request = Empty.newBuilder().build();
			PowerStatus power_status = blockstub.switchOff(request);
			//error handling using try catch
		} catch (RuntimeException e) {
			logger.log(Level.WARNING, "Rpc has failed", e);
			return;
		}
	}
	
	//client side for retrieving appointements. user requests date and gets backs either nothing today or an appointment
	public static void getAppointments() {
		
		Date request = Date.newBuilder().setDate("23/06/20").build();
		Iterator<Appointment> appointments;	
		//error handling using try catch
		try {
			appointments = blockstub.getAppointments(request);
			for (int i = 1; appointments.hasNext(); i++) {
				Appointment appointment = appointments.next();
				
				System.out.println(appointment);
			}
			//error handling using try catch
		}catch (RuntimeException e) {
			logger.log(Level.WARNING, "Rpc has failed", e);
			return;
		}
	}
	
	//function does not work
/*	public static void getToDoList() {
		Day request = Day.newBuilder().setDay("Monday").build();
		Iterator<ToDoList> todolist;	
		
		try {
			todolist = blockstub.getToDoList(request);
			for (int i = 1; todolist.hasNext(); i++) {
				ToDoList todolists = todolist.next();
				
				System.out.println(todolist);
			}
		}catch (RuntimeException e) {
			logger.log(Level.WARNING, "Rpc has failed", e);
			return;
		}
	}*/
	
	//client side for retrieving playable files. user requests type (.i.e mp3) and gets backs the file and that file type
	public static void getMP3AndMP4Files() {
		Type request = Type.newBuilder().setType("mp3").build();
		Type request1 = Type.newBuilder().setType("mp4").build();
		Iterator<PlayableFiles> playablefiles;	
		//error handling using try catch
		try {
			playablefiles = blockstub.getMP3AndMP4Files(request);
			playablefiles = blockstub.getMP3AndMP4Files(request1);
			for (int i = 1; playablefiles.hasNext(); i++) {
				PlayableFiles playable = playablefiles.next();
				
				System.out.println(playablefiles);
			}
			//error handling using try catch
		}catch (RuntimeException e) {
			logger.log(Level.WARNING, "Rpc has failed", e);
			return;
		}
	}
	
	
	
	
	@Override
	public void switchService(String name) {
		// TODO Auto-generated method stub
		
	}
	
	public static void main (String[] args) throws InterruptedException{
		SmartPdaClient client = new SmartPdaClient();
		
		// client method for switching on PDA (for gui)
		// Displayed in the terminal
		client.switchOn();
		
		client.switchOff();
		
		client.getAppointments();
		
		client.getMP3AndMP4Files();
		
		//client.getToDoList(); not functioning
	}
	
	

}
