package FoodOrderingSystem;

/**
 * FACTORY PATTERN — Factory Class
 * Creates food objects without exposing creation logic to the client.
 * New food items can be added without modifying client code.
 */
public class FoodFactory {

    public static Food createFood(String type) {
        switch (type.toLowerCase()) {
            case "pizza":  return new Pizza();
            case "burger": return new Burger();
            case "pasta":  return new Pasta();
            default: throw new IllegalArgumentException("Unknown food type: " + type);
        }
    }
}
