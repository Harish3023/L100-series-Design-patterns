package behavioral.templatemethod;

// Abstract class
public abstract class OrderProcess {

    // Template method
    public final void processOrder() {
        selectItems();
        doPayment();
        deliver();
    }

    void selectItems() {
        System.out.println("Items selected and added to cart");
    }

    // Abstract step for subclasses
    abstract void doPayment();

    void deliver() {
        System.out.println("Order delivered");
    }
}
