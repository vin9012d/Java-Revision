package main.java.Day8JavaBusProject.model;

public class Seat {
    private int row;
   private  int column;
    private boolean booked;
    User user;

    public Seat(int row, int column){
    this.row= row;
    this.column= column;
    }

    public void setUser(User user) {
        this.user = user;
    }
    public  User getUser(){
        return  this.user;
    }

    public int getRow() {
        return row;
    }

    public  int getColumn(){
        return column;
    }

    public boolean isBooked(){
        return booked;
    }
    public void setBooked(){
        this.booked = true;
    }
}
