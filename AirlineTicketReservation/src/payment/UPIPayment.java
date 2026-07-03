package payment;

public class UPIPayment implements Payment {

    private String upiId;

    // ✅ Constructor
    public UPIPayment(String upiId) {
        this.upiId = upiId;
    }

    @Override
    public boolean validate() {
        return upiId != null && upiId.contains("@");
    }

    @Override
    public boolean pay(double amt) {
        System.out.println("UPI Payment ₹" + amt + " via " + upiId);
        return true;
    }

    @Override
    public void refund(double amount) {
        System.out.println("Refunding ₹" + amount + " to UPI: " + upiId);
    }
}

