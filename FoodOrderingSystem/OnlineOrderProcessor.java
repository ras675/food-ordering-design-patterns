package FoodOrderingSystem;

/**
 * TEMPLATE METHOD PATTERN — Concrete Class
 * Implements each step of the order processing workflow for online orders.
 */
public class OnlineOrderProcessor extends OrderProcessor {

    @Override
    protected void prepareFood() {
        System.out.println("Preparing Online Order...");
    }

    @Override
    protected double calculateCost(Food food) {
        return food.getCost();
    }

    @Override
    protected void displayBill(Food food, double cost) {
        System.out.println();
        System.out.println("----- BILL -----");
        System.out.println(food.getDescription());
        System.out.println("Total = " + cost);
        System.out.println();
    }

    @Override
    protected void processPayment(PaymentStrategy payment, double cost) {
        payment.pay(cost);
    }

    @Override
    protected void generateReceipt() {
        System.out.println("Receipt Generated");
    }
}
