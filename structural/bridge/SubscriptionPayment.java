package structural.bridge;

// Refined Abstraction 
public class SubscriptionPayment extends Payment {
    public SubscriptionPayment(PaymentGateway gateway) {
        super(gateway);
    }

    @Override
    public void makePayment(double amount) {
        System.out.println("Subscription renewal initiated...");
        gateway.processPayment(amount); // Delegating to implementor
    }
}