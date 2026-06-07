package FoodOrderingSystem;

/**
 * FACTORY PATTERN — Concrete Product
 */
public class Pasta implements Food {

    @Override
    public String getDescription() {
        return "Pasta";
    }

    @Override
    public double getCost() {
        return 350.0;
    }
}
