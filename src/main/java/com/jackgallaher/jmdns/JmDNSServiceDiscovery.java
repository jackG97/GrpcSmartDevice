package com.jackgallaher.jmdns;
import java.io.IOException;
import java.net.InetAddress;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.jmdns.JmDNS;
import javax.jmdns.ServiceEvent;
import javax.jmdns.ServiceListener;


public class JmDNSServiceDiscovery implements ServiceListener {

	private JmDNS jmdns;
	private static JmDNSServiceDiscovery instance;
	ServiceObserver observer;
	
	private JmDNSServiceDiscovery() {
		//error handling using try catch
		try {
			// Register a service
			jmdns = JmDNS.create(InetAddress.getLocalHost());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
	
	//
	public void register(ServiceObserver observer) {
		this.observer = observer;
		for (String s : observer.serviceInterests()) {
			// Add a service listener
			jmdns.addServiceListener(s, this);
		}
	}
	
	

	
	
	@Override
	//service resolution may take a few second to resolve
	public void serviceAdded(ServiceEvent event) {
		// TODO Auto-generated method stub
		System.out.println(event);
		event.getDNS().requestServiceInfo(event.getType(), event.getName(), 0);
		
	}

	@Override
	//service has disappeared
	public void serviceRemoved(ServiceEvent event) {
		// TODO Auto-generated method stub
		
	}

	//A service has been resolved. Its details are now available in the ServiceInfo record
	@Override
	public void serviceResolved(ServiceEvent event) {
		// TODO Auto-generated method stub
		System.out.println(event);
		String address = event.getInfo().getHostAddress();
		int port = event.getInfo().getPort();
		String type = event.getInfo().getType();
		
		
	}
}
