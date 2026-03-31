package main.java.Day8JavaBusProject.cli;

import main.java.Day8JavaBusProject.Payment.PaymentFactory;
import main.java.Day8JavaBusProject.Payment.PaymentStrategy;

import java.util.Scanner;

public class PaymentMenu {

    public PaymentStrategy selectPaymentMethod (){
    System.out.println("select number from the following  available Payment method options");
    System.out.println("1 UPI");
    System.out.println("2 Credit Card");
    System.out.println("3 NetBanking");

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        PaymentStrategy p = new PaymentFactory().createPayment(n);
        return p;
//        p.collectDetails();
//        p.pay();



    }

}
