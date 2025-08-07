package structural.facade;

public class AirConditioner implements Device {
    public String turnOn() {
        return "Air Conditioner is ON";
    }

    public String turnOff() {
        return "Air Conditioner is OFF";
    }
}