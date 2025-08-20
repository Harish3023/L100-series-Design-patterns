package structural.bridge;

// Refined Abstraction
public class OnlineOrderPayment extends Payment {
    public OnlineOrderPayment(PaymentGateway gateway) {
        super(gateway);
    }

    @Override
    public void makePayment(double amount) {
        System.out.println("Online order initiated...");
        gateway.processPayment(amount);
    }
}