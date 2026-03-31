package main.java.Day8JavaBusProject.model;

public class Ticket {

  private  User user;
  private  Seat seat;

  public  Ticket(User user, Seat seat){
    this.user = user;
    this.seat = seat;
  }

  public User getUser(){
    return user;
  }
  public  Seat getSeat(){
    return seat;
  }



}
