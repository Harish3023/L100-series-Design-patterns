package creational.prototype;

public class PrototypeDemo {
    public static void main(String[] args) {
        FoodRegistry.loadMenu();

        Food order1 = FoodRegistry.getFood("pizza");
        Food order2 = FoodRegistry.getFood("burger");
        Food order3 = FoodRegistry.getFood("pasta");
        Food order4 = FoodRegistry.getFood("burger");

        System.out.println("Orders placed:");
        order1.serve();
        order2.serve();
        order3.serve();
        order4.serve();
    }
}