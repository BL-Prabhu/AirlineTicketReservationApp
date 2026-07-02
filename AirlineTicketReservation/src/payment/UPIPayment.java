package payment;

public class UPIPayment implements Payment {

    private String upiId;

    public UPIPayment(String upiId) {
        this.upiId = upiId;
    }

    public boolean validate() {
        return upiId != null && upiId.contains("@");
    }

    public boolean process(double amount) {
        System.out.println("Processing UPI Payment ₹" + amount);
        System.out.println("UPI ID: " + upiId);
        System.out.println("Payment Successful");
        return true;
    }

    public void refund(double amount) {
        System.out.println("Refund ₹" + amount + " to UPI: " + upiId);
    }
}
