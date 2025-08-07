package structural.facade;

public class Television implements Device {
    @Override
    public String turnOn() {
        return "Television is ON";
    }

    @Override
    public String turnOff() {
        return "Television is OFF";
    }
}