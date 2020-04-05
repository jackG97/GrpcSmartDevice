package com.jackgallaher.jmdns;
import java.net.Inet4Address;
import java.util.HashMap;


public class ServiceDescription {
	
	private final String address;
	private final int port;
	private final HashMap<String, String> properties;
		
		public ServiceDescription(String address, int port) {
			this.address = address;
			this.port = port;
			properties = new HashMap<String, String>();
		}
		
		public void addPorperty(String key, String value) {
			properties.put(key, value);
	}
		
		public String getAddress() {
			return address;
		}
		
		public int getPort() {
			return port;
		}
		
		public HashMap<String, String> getPorperties(){
			return properties;
		}

}
