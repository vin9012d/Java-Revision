package main.java.Day8JavaBusProject.cli;

import java.util.Scanner;

public class MainMenu {
    public static MainMenu mainMenu;

    public  static MainMenu getInstance(){
        if(mainMenu == null){
             mainMenu =new MainMenu();
        }

        return mainMenu;
    }


    public  void displayGreetMessage(){
    System.out.println("Hello User  do you want to book ticket");
        Scanner sc = new Scanner(System.in);
        if(sc.nextBoolean()){
      System.out.println("Moving to Booking Menu ....");
            try {
                Thread.sleep(3000);
                BookingMenu bm = new BookingMenu();
                bm.bookingMenu();

            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }
    }


}
