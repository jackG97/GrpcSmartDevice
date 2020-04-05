package com.jackgallaher.jmdns;

import java.util.List;
import javax.swing.JPanel;

public interface ServiceObserver {
	
	public boolean interested(String type);
	
	public List<String> serviceInterests();
	
	public void serviceAdded(ServiceDescription service);
	
	public String getName();
	
	public void switchService(String name);
	
	

}
