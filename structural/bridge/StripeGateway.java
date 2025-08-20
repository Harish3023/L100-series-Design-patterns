package structural.bridge;

// Concrete Implementor 
public class StripeGateway implements PaymentGateway {
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing " + amount + " through Stripe.");
    }
}