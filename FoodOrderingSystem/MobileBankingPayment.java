package FoodOrderingSystem;

/**
 * STRATEGY PATTERN — Concrete Strategy
 */
public class MobileBankingPayment implements PaymentStrategy {

    @Override
    public void pay(double amount) {
        System.out.println("Paid " + amount + " using Mobile Banking");
    }
}
