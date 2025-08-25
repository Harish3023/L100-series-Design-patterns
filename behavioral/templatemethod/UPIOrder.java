package behavioral.templatemethod;

// Concrete class
public class UPIOrder extends OrderProcess {

    @Override
    void doPayment() {
        System.out.println("Payment done using UPI");
    }
}
