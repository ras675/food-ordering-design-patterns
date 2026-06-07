package FoodOrderingSystem;

/**
 * DECORATOR PATTERN — Concrete Decorator
 * Adds Extra Cheese topping to any Food item.
 */
public class CheeseDecorator extends FoodDecorator {

    public CheeseDecorator(Food food) {
        super(food);
    }

    @Override
    public String getDescription() {
        return food.getDescription() + ", Extra Cheese";
    }

    @Override
    public double getCost() {
        return food.getCost() + 100.0;
    }
}
