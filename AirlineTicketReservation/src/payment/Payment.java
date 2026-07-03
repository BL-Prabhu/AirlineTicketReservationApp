package payment;

public interface Payment {
    boolean validate();

    boolean pay(double amt);

    void refund(double amount);
}
