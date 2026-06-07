package FoodOrderingSystem;

/**
 * STRATEGY PATTERN — Strategy Interface
 * Defines the interchangeable payment algorithm.
 * Payment methods can be changed at runtime.
 */
public interface PaymentStrategy {
    void pay(double amount);
}
