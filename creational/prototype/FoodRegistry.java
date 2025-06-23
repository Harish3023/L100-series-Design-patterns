package creational.prototype;

import java.util.HashMap;
import java.util.Map;

public class FoodRegistry {
    private static Map<String, Food> foodMap = new HashMap<>();

    public static void loadMenu() {
        foodMap.put("pizza", new Pizza());
        foodMap.put("burger", new Burger());
        foodMap.put("pasta", new Pasta());
    }

    public static Food getFood(String type) {
        Food prototype = foodMap.get(type);
        return prototype != null ? prototype.clone() : null;
    }
}