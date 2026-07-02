package payment;

public interface Payment {
    boolean validate();
    boolean process(double amount);
    void refund(double amount);
}
