package creational.builder;

//Builder interface 
public interface PizzaBuilder {
    PizzaBuilder setDough(String dough);
    PizzaBuilder setSauce(String sauce);
    PizzaBuilder setTopping(String topping);
    Pizza build();
}