package service;

import payment.Payment;

public class PaymentService {

    // ✅ Renamed to match BookingService
    public boolean processPayment(Payment payment, double amount) {

        if (payment == null) {
            System.out.println("Invalid payment method");
            return false;
        }

        return payment.pay(amount);
    }
}
