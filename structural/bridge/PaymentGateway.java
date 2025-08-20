package structural.bridge;

// Implementor Interface - bridge interface
public interface PaymentGateway {
    void processPayment(double amount);
}