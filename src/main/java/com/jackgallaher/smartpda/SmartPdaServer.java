package com.jackgallaher.smartpda;


import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.ServerServiceDefinition;
import io.grpc.stub.StreamObserver;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

import javax.print.attribute.standard.Media;

import com.jackgallaher.smartpda.DayOrBuilder;
import com.jackgallaher.jmdns.JmDNSRegistrationHelper;
import com.jackgallaher.smartpda.PowerStatus;

import com.jackgallaher.smartpda.smartPdaGrpc.smartPdaImplBase;
import com.jackgallaher.smartpda.ToDoList;

public class SmartPdaServer {
	
	private int port = 50051;
	private Server server;

	private static final Logger logger = Logger.getLogger(SmartPdaServer.class.getName());
	
	//The launches on the port 50051 and will listen out for any requests and will await termination
	private void start() throws Exception {
		Server server = ServerBuilder.forPort(port)
				.addService(new SmartPdaImpl())
				.build()
				.start();
		JmDNSRegistrationHelper helper = new JmDNSRegistrationHelper("SmartPda", "_pda._udp.local", "",port);
			    logger.info("Server started, listening on " + port);
			    Runtime.getRuntime().addShutdownHook(new Thread(){
			    	// Use stderr here because the logger may have been reset by the JVM shutdown hook
			    public void run () {
			    	System.err.println("Grpc server is shutting down");
			    	SmartPdaServer.this.stop();
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
			public void blockUntilShutdown() throws InterruptedException{
				if (server != null) {
	    		server.awaitTermination();
				}
			}
			
	private class SmartPdaImpl extends smartPdaGrpc.smartPdaImplBase{
	
	//varibles
	private List<Appointment> appointments;
	private List<ToDoList> todolist;
	private List<PlayableFiles> playablefiles;
    private String title;
    private String note;
    private String date;
    private String time;
    private String day;
	private String todo;
	private String type;
	private String filename;
	private boolean pdaActive;
	
	//This method is based on a boolean statement stating that the pda being switched on is true
	public void switchOn(Empty request,
	        io.grpc.stub.StreamObserver<PowerStatus> response) {
		pdaActive = true;
		System.out.println("PDA is on");
		
		response.onNext(PowerStatus.newBuilder()
				.setStatus(pdaActive)
				.build());
		response.onCompleted();
	}
	
	//This method is based on a boolean statement stating that the pda being switched off is false
	public void switchOff(Empty request, 
			io.grpc.stub.StreamObserver<PowerStatus> response) {
	           pdaActive = false; 
	           System.out.println("PDA is Off");
	                       
	           response.onNext(PowerStatus.newBuilder()
	                   .setStatus(pdaActive)
	                   .build());
	           response.onCompleted();           
	       }
	
	//this method uses server streaming. the user requests a date and the server responds with either an appointment for that date or nothing on that date
	public void getAppointments(Date request, io.grpc.stub.StreamObserver<Appointment> responseObserver) {
		appointments = new ArrayList<Appointment>();
		Appointment facebookmeeting = Appointment.newBuilder().setTitle("Mark meeting").setNote("New application features meeting").setTime("12:00pm").setDate("23/02/20").build();
		Appointment teamsetup = Appointment.newBuilder().setTitle("Team setup meeting").setNote("orgainising new team for level 2 office").setTime("1:00pm").setDate("12/03/20").build();
		Appointment teamlunch = Appointment.newBuilder().setTitle("Team lunch").setNote("Lunch at Nandos").setTime("11:30am").setDate("28/02/20").build();
		Appointment linkedinmeeting = Appointment.newBuilder().setTitle("CEO Linkedin meeting").setNote("work togther program with facebook and linkedin").setTime("4:00pm").setDate("21/04/20").build();
		
		appointments.add(facebookmeeting);
		appointments.add(teamsetup);
		appointments.add(teamlunch);
		appointments.add(linkedinmeeting);
		
		System.out.println(request.getDate());
		
		for (Appointment APPOINTMENT : appointments) {
			if (!APPOINTMENT.getDate().equals(request.getDate())){
				System.out.println("Nothing today");
				continue;
			}
			title = APPOINTMENT.getTitle();
			note = APPOINTMENT.getNote();
			time = APPOINTMENT.getTime();
			date = APPOINTMENT.getDate();
			responseObserver.onNext(APPOINTMENT);
			
			System.out.println(APPOINTMENT);
		}
		responseObserver.onCompleted();
		
	}
	
	//this method is used as Bidirectional streaming where the user can request multiple days and get back multiple to do list activities on those days selected.
	public void getToDoList(StreamObserver<Day> request, io.grpc.stub.StreamObserver<ToDoList> responseObserver) {
		
			todolist = new ArrayList<ToDoList>();
			
			ToDoList pickupcar = ToDoList.newBuilder().setDay("Monday").setTodo("Pick up car from gargage").build();
			ToDoList getshoppping = ToDoList.newBuilder().setDay("Wednesday").setTodo("pick up shopping today").build();
			ToDoList finishwork = ToDoList.newBuilder().setDay("Thursday").setTodo("finish paperwork tonight").build();
			ToDoList organisetrip= ToDoList.newBuilder().setDay("Saturday").setTodo("organise family holiday for the summer").build();
			ToDoList fixtv = ToDoList.newBuilder().setDay("Saturday").setTodo("fix the tv set before before 9pm").build();
			ToDoList speaktowork= ToDoList.newBuilder().setDay("Monday").setTodo("Speak to work about bonus pay").build();
			ToDoList speaktomanager= ToDoList.newBuilder().setDay("Friday").setTodo("speak to manager about upcoming plans").build();
			ToDoList organisefund = ToDoList.newBuilder().setDay("Wednesday").setTodo("organise fund raiser for work").build();
			
			
			todolist.add(pickupcar);
			todolist.add(getshoppping);
			todolist.add(finishwork);
			todolist.add(organisetrip);
			todolist.add(fixtv);
			todolist.add(speaktowork);
			todolist.add(speaktomanager);
			todolist.add(organisefund);
			
			for (ToDoList TODO : todolist) {
				if (TODO.getDay().equals(((DayOrBuilder) request).getDay())){
					continue;
				}
				day = TODO.getDay();
				todo = TODO.getTodo();
				
				responseObserver.onNext(TODO);
				
				System.out.println(TODO);
			}
			responseObserver.onCompleted();
			
			}
	
	//this method uses server streaming. the user requests an MP type (mp3 or mp4) and the server responds with either the playable files for that type requested.
	public void getMP3AndMP4Files(Type request, io.grpc.stub.StreamObserver<PlayableFiles> responseObserver) {
		playablefiles = new ArrayList<PlayableFiles>();
		
		PlayableFiles mp3one = PlayableFiles.newBuilder().setFilename("audio 1").setType("mp3").build();
		PlayableFiles mp3two = PlayableFiles.newBuilder().setFilename("audio 2").setType("mp3").build();
		PlayableFiles mp4one = PlayableFiles.newBuilder().setFilename("video 1").setType("mp4").build();
		PlayableFiles mp4two = PlayableFiles.newBuilder().setFilename("video 2").setType("mp4").build();
		PlayableFiles mp3three = PlayableFiles.newBuilder().setFilename("audio 3").setType("mp3").build();
		PlayableFiles mp3four = PlayableFiles.newBuilder().setFilename("audio 4").setType("mp3").build();
		PlayableFiles mp4three = PlayableFiles.newBuilder().setFilename("video 3").setType("mp4").build();
		PlayableFiles mp4four = PlayableFiles.newBuilder().setFilename("video 4").setType("mp4").build();
		
		
		playablefiles.add(mp3one);
		playablefiles.add(mp3two);
		playablefiles.add(mp3three);
		playablefiles.add(mp3four);
		playablefiles.add(mp4one);
		playablefiles.add(mp4two);
		playablefiles.add(mp4three);
		playablefiles.add(mp4four);
		
		for (PlayableFiles PLAY : playablefiles) {
			if (!PLAY.getType().equals(request.getType())){
				continue;
			}
			filename = PLAY.getFilename();
			type = PLAY.getType();
		
			responseObserver.onNext(PLAY);
			
			System.out.println(PLAY);
		}
		responseObserver.onCompleted();
		
		
	}
	
	
}
	
	// Main launches the server from the command line
 	public static void main(String []args) throws Exception{
		final SmartPdaServer pda_server = new SmartPdaServer();
		pda_server.start();
		pda_server.blockUntilShutdown();
	}
}
	

