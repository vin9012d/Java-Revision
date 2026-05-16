package main.java.day9dependencyInjection.tightCoupling2;

public class PaymentService {

  // tight coupling
    /*
  private CreditCard payment = new CreditCard();

    public void pay() {
        payment.makePayment();
    }

     */

    private  Payment payment;
    public PaymentService(Payment payment){
        this.payment =payment;
    }

    public  void pay(){
        payment.makePayment();
    }



}
