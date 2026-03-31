package main.java.Day8JavaBusProject.model;

import java.util.ArrayList;
import java.util.List;

public class User {
    private String name;
    private String emailId;
    private List<Seat> seats;

    public  User (String name, String emailId){
        this.name = name;
        this .emailId = emailId;
        this.seats = new ArrayList<>();
    }

    public void setSeats(Seat seat) {
        this.seats.add(seat);
    }

    public void updateFromNotification(boolean isBooked, Ticket ticket){
         if(isBooked){
      System.out.println("Ticket is successfully boooked!!");
      System.out.println("Here is your ticket details");
      System.out.println("User name "+ticket.getUser().getName());
      System.out.println("seeat numbe is "+ ticket.getSeat().getRow() +","+ ticket.getSeat().getColumn());
         }else{
      System.out.println("Your ticke has not Confirmed, Please try again");
         }

    }

    public List<Seat> getUserSeat(){
        return this.seats;
    }

    public  String getName(){
        return name;
    }
    public  String getEmailId(){
        return emailId;
    }
    public List<Seat> getSeats(){
        return seats;
    }

}
