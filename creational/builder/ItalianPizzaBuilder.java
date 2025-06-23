package creational.builder;

//Concrete Builder
public class ItalianPizzaBuilder implements PizzaBuilder {
    private String dough;
    private String sauce;
    private String topping;

    @Override
    public PizzaBuilder setDough(String dough) {
        this.dough = dough;
        return this;
    }

    @Override
    public PizzaBuilder setSauce(String sauce) {
        this.sauce = sauce;
        return this;
    }

    @Override
    public PizzaBuilder setTopping(String topping) {
        this.topping = topping;
        return this;
    }

    @Override
    public Pizza build() {
        return new Pizza(dough, sauce, topping);
    }
}