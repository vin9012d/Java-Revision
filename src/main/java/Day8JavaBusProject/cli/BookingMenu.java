package main.java.Day8JavaBusProject.cli;

import main.java.Day8JavaBusProject.Payment.PaymentStrategy;
import main.java.Day8JavaBusProject.exception.BusNotFoundException;
import main.java.Day8JavaBusProject.exception.InvalidPaymentOptionException;
import main.java.Day8JavaBusProject.exception.SeatUnavailableException;
import main.java.Day8JavaBusProject.model.Bus;
import main.java.Day8JavaBusProject.model.Seat;
import main.java.Day8JavaBusProject.model.Ticket;
import main.java.Day8JavaBusProject.model.User;
import main.java.Day8JavaBusProject.service.BusRegistry;
import main.java.Day8JavaBusProject.service.UserRegistry;

import java.util.Scanner;

public class BookingMenu {

  public void bookingMenu() {
    Scanner sc = new Scanner(System.in);
    try {
      BusRegistry bsr = BusRegistry.getInstance();
      bsr.printAllBuses();

      System.out.println("Choose your bus");
      String name = sc.nextLine();

      Bus bus = bsr.getBus(name);

      System.out.println("Select the available seat (enter row then col)");
      bus.showAvailableSeats();

      int row = sc.nextInt();
      int col = sc.nextInt();

      bus.checkSeatAvailability(row, col);

      System.out.println("Please enter your name");
      sc.nextLine();
      String userName = sc.nextLine();
      System.out.println("Please enter your email");
      String userEmail = sc.nextLine();

      UserRegistry userRegistry = UserRegistry.getInstance();
      userRegistry.createUser(userName, userEmail);
      User user = userRegistry.getUser(userEmail);

      PaymentMenu pm = new PaymentMenu();
      PaymentStrategy psg = pm.selectPaymentMethod();
      boolean isPaymentDone = psg.pay();

      Ticket ticket;
      if (isPaymentDone) {
        Seat seat = bus.getSeat(row, col);
        seat.setUser(user);
        user.setSeats(seat);
        ticket = new Ticket(user, seat);
        seat.setBooked();
      } else {
        ticket = null;
      }

      user.updateFromNotification(isPaymentDone, ticket);
      MainMenu.getInstance().displayGreetMessage();

    } catch (BusNotFoundException e) {
      System.out.println("Booking failed: " + e.getMessage());
    } catch (SeatUnavailableException e) {
      System.out.println("Booking failed: " + e.getMessage());
    } catch (InvalidPaymentOptionException e) {
      System.out.println("Payment failed: " + e.getMessage());
    } catch (IllegalArgumentException e) {
      System.out.println("Invalid input: " + e.getMessage());
    }
  }
}
