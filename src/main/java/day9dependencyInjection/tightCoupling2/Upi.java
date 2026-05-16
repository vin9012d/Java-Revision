package main.java.day9dependencyInjection.tightCoupling2;

public class Upi implements Payment {

    @Override
    public void makePayment() {
    System.out.println("UPI payment...");
    }
}
