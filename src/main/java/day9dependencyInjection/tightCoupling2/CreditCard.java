package main.java.day9dependencyInjection.tightCoupling2;

public class CreditCard implements  Payment {


    @Override
    public void makePayment() {
    System.out.println("CreditCard Payment....");
    }
}
