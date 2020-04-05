
package com.jackgallaher.jmdns;

import java.io.IOException;
import java.net.InetAddress;
import java.net.ServerSocket;
import javax.jmdns.JmDNS;
import javax.jmdns.ServiceInfo;


public class JmDNSRegistrationService {
	
	private JmDNS jmdns;
    private ServiceInfo information;
    public JmDNSRegistrationService(String name, String type, String location, int port) {
    	//error handling using try catch
    	try {
    		// Create a JmDNS instance
    		jmdns = JmDNS.create(InetAddress.getLocalHost());
    		// Register a service
    		ServiceInfo phone = ServiceInfo.create("_http._tcp.local.", "phone", 50055, "phone control");
            jmdns.registerService(phone);
            ServiceInfo laptop = ServiceInfo.create("_http._tcp.local.", "laptop", 50052, "laptop control");
            jmdns.registerService(laptop);
            ServiceInfo pda = ServiceInfo.create("_http._tcp.local.", "pda", 50053, "pda control");
            jmdns.registerService(pda);

    		//prints the information
    		System.out.println("ServiceInfo: "+phone.toString() +"\nJMDNS: "+jmdns.toString());
    		System.out.println("ServiceInfo: "+laptop.toString() +"\nJMDNS: "+jmdns.toString());
    		System.out.println("ServiceInfo: "+pda.toString() +"\nJMDNS: "+jmdns.toString());
    	} catch (IOException e) {
    		e.printStackTrace();
    	}
    }
    
    
    // Unregisters services
    public void Register() {
    	jmdns.unregisterService(information);
    }
    
    public ServiceInfo getInfo() {
    	return information;
    }

}
