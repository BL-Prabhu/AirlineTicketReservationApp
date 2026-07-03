package payment;

public class EMIPayment implements Payment {

    private String cardNumber;
    private int months;

    public EMIPayment(String cardNumber, int months) {
        this.cardNumber = cardNumber;
        this.months = months;
    }

    @Override
    public boolean validate() {
        return cardNumber.length() == 16 && months > 0;
    }

    @Override
    public boolean pay(double amount) {
        double emi = amount / months;
        System.out.println("EMI Payment Selected");
        System.out.println("Monthly EMI: ₹" + emi);
        return true;
    }

    @Override
    public void refund(double amount) {
        System.out.println("Refund EMI ₹" + amount);
    }
}
