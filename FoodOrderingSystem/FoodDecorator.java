package FoodOrderingSystem;

/**
 * DECORATOR PATTERN — Abstract Decorator
 * Wraps a Food object and delegates to it.
 * Concrete decorators extend this to add toppings dynamically.
 */
public abstract class FoodDecorator implements Food {

    protected Food food;

    public FoodDecorator(Food food) {
        this.food = food;
    }

    @Override
    public String getDescription() {
        return food.getDescription();
    }

    @Override
    public double getCost() {
        return food.getCost();
    }
}
