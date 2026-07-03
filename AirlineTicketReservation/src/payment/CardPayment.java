package payment;

public class CardPayment implements Payment {

    private String cardNumber;
    private String cvv;

    // ✅ Constructor
    public CardPayment(String cardNumber, String cvv) {
        this.cardNumber = cardNumber;
        this.cvv = cvv;
    }

    @Override
    public boolean validate() {
        return cardNumber != null && cardNumber.length() == 16
                && cvv != null && cvv.length() == 3;
    }

    @Override
    public boolean pay(double amt) {
        System.out.println("Card Payment ₹" + amt + " using card " + cardNumber);
        return true;
    }

    @Override
    public void refund(double amount) {
        System.out.println("Refunding ₹" + amount + " to card " + cardNumber);
    }
}
