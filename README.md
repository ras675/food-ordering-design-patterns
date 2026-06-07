# Online Food Ordering System — Design Patterns

A Java implementation of an **Online Food Ordering System** demonstrating four Gang of Four (GoF) design patterns working together in a single cohesive scenario.

## Design Patterns Used

### 1. Factory Pattern
Creates food objects without exposing creation logic to the client.
**Classes:** `FoodFactory`, `Pizza`, `Burger`, `Pasta`

### 2. Decorator Pattern
Dynamically adds toppings to food items without changing existing classes.
**Classes:** `FoodDecorator`, `CheeseDecorator`, `MushroomDecorator`

### 3. Strategy Pattern
Supports multiple payment methods switchable at runtime.
**Classes:** `PaymentStrategy`, `CardPayment`, `PayPalPayment`, `MobileBankingPayment`

### 4. Template Method Pattern
Defines a fixed order processing workflow while allowing step-level customisation.
**Classes:** `OrderProcessor`, `OnlineOrderProcessor`
**Workflow:** Prepare Food → Calculate Cost → Display Bill → Process Payment → Generate Receipt

---

## Project Structure

```
FoodOrderingSystem/
├── Food.java
├── Pizza.java
├── Burger.java
├── Pasta.java
├── FoodFactory.java
├── FoodDecorator.java
├── CheeseDecorator.java
├── MushroomDecorator.java
├── PaymentStrategy.java
├── CardPayment.java
├── PayPalPayment.java
├── MobileBankingPayment.java
├── OrderProcessor.java
├── OnlineOrderProcessor.java
└── Main.java
```

---

## System Workflow

```
Customer → FoodFactory → Food Item → Decorators → OrderProcessor → PaymentStrategy → Receipt
```

---

## How to Compile

```bash
javac FoodOrderingSystem/*.java
```

## How to Run

```bash
java FoodOrderingSystem.Main
```

---

## Sample Output

```
Preparing Online Order...

----- BILL -----
Pizza, Extra Cheese, Mushroom
Total = 680.0

Paid 680.0 using Mobile Banking
Receipt Generated
```

---

## GitHub

https://github.com/ras675/food-ordering-design-patterns

## Author
**Rashikh Ahmad** — Design Patterns Assignment, IUT
# food-ordering-java
