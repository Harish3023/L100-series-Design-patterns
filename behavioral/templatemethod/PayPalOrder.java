package behavioral.templatemethod;

// Concrete class
public class PayPalOrder extends OrderProcess {

    @Override
    void doPayment() {
        System.out.println("Payment done using PayPal");
    }
}
