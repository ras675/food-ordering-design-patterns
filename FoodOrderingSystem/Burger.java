package FoodOrderingSystem;

/**
 * FACTORY PATTERN — Concrete Product
 */
public class Burger implements Food {

    @Override
    public String getDescription() {
        return "Burger";
    }

    @Override
    public double getCost() {
        return 300.0;
    }
}
