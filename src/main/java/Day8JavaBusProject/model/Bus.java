package main.java.Day8JavaBusProject.model;

import main.java.Day8JavaBusProject.exception.SeatUnavailableException;

public class Bus {
  private   String route;
  private    String numberPlate;
  private  Seat[][] seats;

  public Bus(String route, String numberPlate) {
    this.numberPlate = numberPlate;
    this.route = route;
    this.seats = new Seat[3][12];
    for (int i = 0; i < seats.length; i++) {
      for (int j = 0; j < seats[i].length; j++) {
        seats[i][j] = new Seat(i, j);
      }
    }
  }




  public  void showAvailableSeats() {
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < seats.length; i++) {
      for (int j = 0; j < seats[i].length; j++) {

        if (seats[i][j].isBooked()) {
          sb.append("X ");
        } else {
          sb.append("0 ");
        }
      }
      sb.append("\n");
    }
    System.out.println(sb);
  }

  public void checkSeatAvailability(int row, int col) {
    if (row < 0 || row >= seats.length || col < 0 || col >= seats[0].length) {
      throw new IllegalArgumentException("Invalid seat position: row=" + row + ", col=" + col);
    }
    if (seats[row][col].isBooked()) {
      throw new SeatUnavailableException(row, col);
    }
  }

  public String getNumberPlate(){
    return    numberPlate;
  }

  public  String getRoute(){
    return route;
  }

  public Seat getSeat(int row, int col){
    return seats[row][col];
  }

}
