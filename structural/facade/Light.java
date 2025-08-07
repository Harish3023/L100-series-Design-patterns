package structural.facade;

public class Light implements Device {
    @Override
    public String turnOn() {
        return "Lights are ON";
    }

    @Override
    public String turnOff() {
        return "Lights are OFF";
    }
}