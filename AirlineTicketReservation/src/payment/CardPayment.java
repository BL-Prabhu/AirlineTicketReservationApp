package payment;

public class CardPayment implements Payment {

    private String cardNumber;
    private String cvv;

    public CardPayment(String cardNumber, String cvv) {
        this.cardNumber = cardNumber;
        this.cvv = cvv;
    }

    public boolean validate() {
        return cardNumber.length() == 16 && cvv.length() == 3;
    }

    public boolean process(double amount) {
        System.out.println("Processing Card Payment ₹" + amount);
        System.out.println("Card Ending: " + cardNumber.substring(12));
        System.out.println("Payment Successful");
        return true;
    }

    public void refund(double amount) {
        System.out.println("Refund ₹" + amount + " to Card");
    }
}
