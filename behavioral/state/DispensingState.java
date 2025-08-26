package behavioral.state;
//Concrete States
public class DispensingState implements State {
    private VendingMachine machine;

    public DispensingState(VendingMachine machine) {
        this.machine = machine;
    }

    @Override
    public void insertCoin() {
        System.out.println("Please wait, dispensing...");
    }

    @Override
    public void pressButton() {
        System.out.println("Already pressed button");
    }

    @Override
    public void dispense() {
        System.out.println("Item dispensed");
        machine.setState(machine.getNoCoinState());
    }
}
