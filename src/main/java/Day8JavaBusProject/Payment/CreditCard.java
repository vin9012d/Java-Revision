package main.java.Day8JavaBusProject.Payment;

import java.util.Scanner;

public class CreditCard implements PaymentStrategy{
   int retryCount =0;
    public void collectDetails(){
    System.out.println("Please enter your 10 digit credit card number");
        Scanner sc = new Scanner(System.in);
        if(sc.next().length() == 10){
            try {
        System.out.println("Please wait till the time your payment is successfullyDone");
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }else{
            if(retryCount ==0 ){
                System.out.println("Invalid credit card number please retry");
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                retryCount++;
                collectDetails();
      } else {
        throw new IllegalArgumentException("Invalid credit  number please retry booking");
            }
        }
    }

    @Override
    public boolean pay(){
        collectDetails();
        return true;
    }

}
