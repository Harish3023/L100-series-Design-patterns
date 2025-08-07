package structural.facade;

public class HomeKeeper {
    private Light light;
    private AirConditioner ac;
    private Television tv;

    public HomeKeeper() {
        light = new Light();
        ac = new AirConditioner();
        tv = new Television();
    }

    public void arriveHome() {
        System.out.println("Arriving Home...");
        System.out.println(light.turnOn());
        System.out.println(ac.turnOn());
        System.out.println(tv.turnOn());
    }

    public void leaveHome() {
        System.out.println("Leaving Home...");
        System.out.println(light.turnOff());
        System.out.println(ac.turnOff());
        System.out.println(tv.turnOff());
    }
}