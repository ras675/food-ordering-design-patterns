package FoodOrderingSystem;

/**
 * TEMPLATE METHOD PATTERN — Abstract Class
 *
 * processOrder() is the template method — it defines the fixed workflow:
 *   1. prepareFood()
 *   2. calculateCost()
 *   3. displayBill()
 *   4. processPayment()
 *   5. generateReceipt()
 *
 * Subclasses override individual steps to customise behaviour.
 */
public abstract class OrderProcessor {

    // Template method — final so the workflow cannot be changed
    public final void processOrder(Food food, PaymentStrategy payment) {
        prepareFood();
        double cost = calculateCost(food);
        displayBill(food, cost);
        processPayment(payment, cost);
        generateReceipt();
    }

    protected abstract void prepareFood();
    protected abstract double calculateCost(Food food);
    protected abstract void displayBill(Food food, double cost);
    protected abstract void processPayment(PaymentStrategy payment, double cost);
    protected abstract void generateReceipt();
}
