package creational.builder;

// Director class
public class PizzaDirector {
    public Pizza buildVegPizza(PizzaBuilder builder) {
        return builder.setDough("Whole Wheat")
                      .setSauce("Pesto")
                      .setTopping("Paneer & Capsicum")
                      .build();
    }

    public Pizza buildNonVegPizza(PizzaBuilder builder) {
        return builder.setDough("Cheese Burst")
                      .setSauce("Barbecue")
                      .setTopping("Chicken & Jalapeno")
                      .build();
    }
}