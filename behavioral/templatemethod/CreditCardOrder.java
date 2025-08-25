package behavioral.templatemethod;

// Concrete class
public class CreditCardOrder extends OrderProcess {

    @Override
    void doPayment() {
        System.out.println("Payment done using Credit Card");
    }
}
