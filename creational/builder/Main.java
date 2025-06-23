package creational.builder;

public class Main {
    public static void main(String[] args) {
        PizzaBuilder builder = new ItalianPizzaBuilder();
        PizzaDirector director = new PizzaDirector();

        Pizza vegPizza = director.buildVegPizza(builder);
        Pizza nonVegPizza = director.buildNonVegPizza(new ItalianPizzaBuilder());

        System.out.println("Veg Pizza: " + vegPizza);
        System.out.println("Non-Veg Pizza: " + nonVegPizza);
    }
}