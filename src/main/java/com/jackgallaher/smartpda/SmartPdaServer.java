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

import com.google.protobuf.Empty;
import com.jackgallaher.smartpda.PowerStatus;

import com.jackgallaher.smartpda.smartPdaGrpc.smartPdaImplBase;
import com.jackgallaher.smartpda.ToDoList;

public class SmartPdaServer extends smartPdaImplBase {
	
	//varibles
	private List<Appointment> appointments;
	private List<ToDoList> todolist;
    private String title;
    private String note;
    private String date;
    private String time;
    private String day;
	private String todo;
	private boolean pdaActive;
	private static final Logger logger = Logger.getLogger(SmartPdaServer.class.getName());
	
	//The launches on the port 50051 and will listen out for any requests and will await termination
	public static void main(String[] args) throws IOException, InterruptedException{
		SmartPdaServer pdaserver = new SmartPdaServer();
		
		int port = 50051;
		Server server = ServerBuilder.forPort(port)
				.addService(pdaserver)
				.build()
				.start();
			    logger.info("Server started, listening on " + port);
	    
	    		server.awaitTermination();
		}
	
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
	
	//this method is used as Bidirectional streaming where the user can request multiple days and get back multiple to do list activities on those days selects.
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
		}
	

