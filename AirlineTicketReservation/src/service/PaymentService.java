package service;

import payment.Payment;

public class PaymentService {

    public boolean processPayment(Payment payment, double amount) {

        System.out.println("Total Amount: ₹" + amount);

        if (!payment.validate()) {
            System.out.println("Invalid Payment Details");
            return false;
        }

        boolean success = payment.process(amount);

        if (success) {
            System.out.println("Payment Success");
        } else {
            System.out.println("Payment Failed");
        }

        return success;
    }

    public void refund(Payment payment, double amount) {
        payment.refund(amount);
    }
}

