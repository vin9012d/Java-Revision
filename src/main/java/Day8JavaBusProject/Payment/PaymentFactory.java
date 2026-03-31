package main.java.Day8JavaBusProject.Payment;

import main.java.Day8JavaBusProject.exception.InvalidPaymentOptionException;

public class PaymentFactory {

    public PaymentStrategy createPayment(int n) {
        switch (n) {
            case 1: return new Upi();
            case 2: return new CreditCard();
            case 3: return new NetBanking();
            default: throw new InvalidPaymentOptionException(n);
        }
    }
}
