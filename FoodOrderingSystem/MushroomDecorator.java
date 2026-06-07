package FoodOrderingSystem;

/**
 * DECORATOR PATTERN — Concrete Decorator
 * Adds Mushroom topping to any Food item.
 */
public class MushroomDecorator extends FoodDecorator {

    public MushroomDecorator(Food food) {
        super(food);
    }

    @Override
    public String getDescription() {
        return food.getDescription() + ", Mushroom";
    }

    @Override
    public double getCost() {
        return food.getCost() + 80.0;
    }
}
