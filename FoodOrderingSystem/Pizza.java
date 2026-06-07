package FoodOrderingSystem;

/**
 * FACTORY PATTERN — Concrete Product
 */
public class Pizza implements Food {

    @Override
    public String getDescription() {
        return "Pizza";
    }

    @Override
    public double getCost() {
        return 500.0;
    }
}
