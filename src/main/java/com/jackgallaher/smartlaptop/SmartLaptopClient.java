package com.jackgallaher.smartlaptop;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

import com.jackgallaher.jmdns.ServiceDescription;
import com.jackgallaher.jmdns.ServiceObserver;
import com.jackgallaher.jmdns.JmDNSServiceDiscovery;
import com.jackgallaher.smartdevice.SmartDeviceClient;
import com.jackgallaher.smartlaptop.Empty;
import com.jackgallaher.smartlaptop.PowerStatus;
import com.jackgallaher.smartlaptop.SmartLaptopClient;
import com.jackgallaher.smartlaptop.smartLaptopGrpc;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

public class SmartLaptopClient implements ServiceObserver{
	
	protected ServiceDescription current;
    private final String serviceType;
    private final String name;
    private static final Logger logger = Logger.getLogger(SmartLaptopClient.class.getName());
    
    private ManagedChannel channel;
    private static smartLaptopGrpc.smartLaptopBlockingStub blockstub;
    private static String statusMsg = "";
    
    public SmartLaptopClient() {
    	serviceType = "_laptop._udp.local";
    	name = "Smart Laptop";
    
    	
    	
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
		blockstub = smartLaptopGrpc.newBlockingStub(channel);
	}
	
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}
	
	public void shutdown() throws InterruptedException {
		channel.shutdown().awaitTermination(3, TimeUnit.SECONDS);
	}
	
	
	//client side for switching on laptop
	public static void switchOn() {
		System.out.println("The Laptop is turning on");
		//error handling using try catch
		try {
			Empty request = Empty.newBuilder().build();
			Status power_status = blockstub.switchOn(request);
		} catch (RuntimeException e) {
			logger.log(Level.WARNING, "RPC Failure", e);
			return;
		}
	}
	
	//client side for switching off laptop
	public static void switchOff() {
		System.out.println("The Laptop is turning off");
		//error handling using try catch
		try {
			Empty request = Empty.newBuilder().build();
			Status power_status = blockstub.switchOff(request);
		} catch (RuntimeException e) {
			logger.log(Level.WARNING, "RPC Failure", e);
			return;
		}
	}
	
	//client side for for charging the laptop
	public static void startCharging() {
		System.out.println("Laptop has started charging");
		//error handling using try catch
		try {
			new Thread() {
			public void run() {
				Empty request = Empty.newBuilder().build();
				
				Iterator<PowerStatus> response = blockstub.startCharging(request);
				while (response.hasNext()) {
					System.out.println(response.next().toString());
				}
			}
		}.start();
		
		Empty request = Empty.newBuilder().build();
		PowerStatus status = blockstub.laptopStatus(request);
		//error handling using try catch
	}catch (RuntimeException e) {
		logger.log(Level.WARNING, "Rpc has Failed", e);
		return;
	}
	}
	
	//client side for retrieving the status of the laptop
	public static void laptopStatus() {
		//error handling using try catch
		try {
			Empty request = Empty.newBuilder().build();
			PowerStatus power_status = blockstub.laptopStatus(request);
			if (power_status.getStatus()) {
				statusMsg = "Off";
			}
			else {
				statusMsg = "On";
			}
			System.out.println("The laptop is currently switch on: "+ statusMsg);
			System.out.println("Battery Life: " +power_status.getBatterylife());
			
			//error handling using try catch
		}	catch (RuntimeException e) {
			logger.log(Level.WARNING, "Rpc has failed", e);
			return;
		}
	}
	
	
	
	@Override
	public void switchService(String name) {
		// TODO Auto-generated method stub
		
	}
	
	public static void main (String[] args) throws InterruptedException{
		SmartLaptopClient client = new SmartLaptopClient();
		
		// client method for switching on PDA (for gui)
		// Displayed in the terminal
		client.switchOn();
		
		client.switchOff();
		
		client.startCharging();
		
		client.laptopStatus();
	}

}
