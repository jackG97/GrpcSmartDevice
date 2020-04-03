
package com.jackgallaher.jmdns;

import java.io.IOException;
import java.net.InetAddress;
import java.net.ServerSocket;
import javax.jmdns.JmDNS;
import javax.jmdns.ServiceInfo;


public class JmDNSRegistrationHelper {
	
	private JmDNS jmdns;
    private ServiceInfo information;
    
    public JmDNSRegistrationHelper(String name, String type, String location, int port) {
    	try {
    		// Create a JmDNS instance
    		jmdns = JmDNS.create(InetAddress.getLocalHost());
    		// Register a service
    		information = ServiceInfo.create(type, name, port, "Params=" +location);
    		jmdns.registerService(information);
    		System.out.println("ServiceInfo: "+information.toString() +"\nJMDNS: "+jmdns.toString());
    	} catch (IOException e) {
    		e.printStackTrace();
    	}
    }
    
    public static int findFreePort() throws IOException {
    	ServerSocket server = new ServerSocket(0);
    	int port = server.getLocalPort();
    	server.close();
    	return port;
    }
    
    // Unregister services
    public void Register() {
    	jmdns.unregisterService(information);
    }
    
    public ServiceInfo getInfo() {
    	return information;
    }

}
