package FoodOrderingSystem;

/**
 * Main — Online Food Ordering System Demo
 *
 * Demonstrates all four design patterns working together:
 *   Factory   → FoodFactory creates food objects
 *   Decorator → CheeseDecorator, MushroomDecorator add toppings
 *   Strategy  → MobileBankingPayment / CardPayment / PayPalPayment
 *   Template  → OnlineOrderProcessor defines the order workflow
 *
 * Expected output (matching report):
 *   Preparing Online Order...
 *   ----- BILL -----
 *   Pizza, Extra Cheese, Mushroom
 *   Total = 680.0
 *   Paid 680.0 using Mobile Banking
 *   Receipt Generated
 */
public class Main {

    public static void main(String[] args) {

        // ── FACTORY PATTERN: create food object ──────────────
        Food food = FoodFactory.createFood("pizza");

        // ── DECORATOR PATTERN: add toppings dynamically ──────
        food = new CheeseDecorator(food);     // +100 = 600
        food = new MushroomDecorator(food);   // +80  = 680

        // ── STRATEGY PATTERN: choose payment method ──────────
        PaymentStrategy payment = new MobileBankingPayment();

        // ── TEMPLATE METHOD PATTERN: process the order ───────
        OrderProcessor processor = new OnlineOrderProcessor();
        processor.processOrder(food, payment);

        // ── Additional demos with other channels ─────────────
        System.out.println();
        System.out.println("========================================");
        System.out.println("  Demo 2 — Burger + Cheese, Card Payment");
        System.out.println("========================================");

        Food food2 = FoodFactory.createFood("burger");
        food2 = new CheeseDecorator(food2);   // 300 + 100 = 400

        OrderProcessor processor2 = new OnlineOrderProcessor();
        processor2.processOrder(food2, new CardPayment());

        System.out.println();
        System.out.println("========================================");
        System.out.println("  Demo 3 — Pasta + Mushroom, PayPal");
        System.out.println("========================================");

        Food food3 = FoodFactory.createFood("pasta");
        food3 = new MushroomDecorator(food3); // 350 + 80 = 430

        OrderProcessor processor3 = new OnlineOrderProcessor();
        processor3.processOrder(food3, new PayPalPayment());
    }
}
