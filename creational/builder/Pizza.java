package creational.builder;

//Product class
public class Pizza {
    private final String dough;
    private final String sauce;
    private final String topping;

    public Pizza(String dough, String sauce, String topping) {
        this.dough = dough;
        this.sauce = sauce;
        this.topping = topping;
    }

    @Override
    public String toString() {
        return "Pizza with " + dough + " dough, " + sauce + " sauce, topped with " + topping;
    }
}