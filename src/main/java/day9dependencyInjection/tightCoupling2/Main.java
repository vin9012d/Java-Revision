package main.java.day9dependencyInjection.tightCoupling2;

public class Main {


    public  static  void main(String[] args){
    Payment payment = new CreditCard();
    PaymentService paymentService = new PaymentService(payment);
    paymentService.pay();
  }
}
