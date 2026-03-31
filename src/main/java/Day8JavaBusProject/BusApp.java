package main.java.Day8JavaBusProject;

import main.java.Day8JavaBusProject.cli.MainMenu;
import main.java.Day8JavaBusProject.model.Bus;
import main.java.Day8JavaBusProject.service.BusRegistry;

public class BusApp {


 public  static  void  main ( String[] args){
    System.out.println("Welcome to the Bus booking app");
//
//     Bus bs= new Bus("Delhi to Manali","KA 01 FG - 5464");
  BusRegistry bs =BusRegistry.getInstance();
  bs.createBus("Delhi to Manali", new Bus("Delhi to Manali", "GJ01 AH 1119"));
  bs.createBus("Delhi to Chandigarh", new Bus("Delhi to Chandigarh", "GJ01 AH 5555"));


//     bs.showAvailableSeats();
     MainMenu mm =  MainMenu.getInstance();
     mm.displayGreetMessage();
 }

}
