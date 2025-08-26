package behavioral.state;

public class StatePatternDemo {
    public static void main(String[] args) {
        VendingMachine machine = new VendingMachine();

        machine.insertCoin();
        machine.pressButton();
        machine.dispense();
        System.out.println("---Trying without coin---");
        machine.pressButton();  
    }
}
