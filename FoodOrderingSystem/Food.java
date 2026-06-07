package FoodOrderingSystem;

/**
 * FACTORY PATTERN — Product Interface
 * All food items implement this interface.
 */
public interface Food {
    String getDescription();
    double getCost();
}
