package behavioral.templatemethod;

// Client class
public class TemplateMethodOrderDemo {
    public static void main(String[] args) {

        OrderProcess order1 = new CreditCardOrder();
        System.out.println("Processing Credit Card Order:");
        order1.processOrder();

        System.out.println();

        OrderProcess order2 = new PayPalOrder();
        System.out.println("Processing PayPal Order:");
        order2.processOrder();

        System.out.println();

        OrderProcess order3 = new UPIOrder();
        System.out.println("Processing UPI Order:");
        order3.processOrder();
    }
}
