package patterns.behavioral.strategy;

/**
 * Client Code
 * 🔹 Encapsulation – Different payment strategies are in separate classes.
 * 🔹 Open-Closed Principle – Adding a new payment method doesn't modify existing code.
 * 🔹 Flexible & Maintainable – Switching strategies is easy without changing client code.
 *
 * Strategy Pattern in Real Life 🌍
 * ✔ Payment Methods (Credit Card, PayPal, Bitcoin)
 * ✔ Sorting Algorithms (Bubble Sort, Quick Sort, Merge Sort)
 * ✔ Compression Formats (ZIP, RAR, 7z)
 * ✔ Travel Modes (Car, Bike, Bus)
 *
 * The Strategy Pattern is a behavioral design pattern that allows you to define a family of algorithms,
 * put each one in a separate class, and make their objects interchangeable.
 *
 *Use the strategy pattern when:
 * ✅ You have multiple algorithms for a specific task, and you want to switch between them dynamically.
 * ✅ You want to decouple the algorithm from the client using it.
 * ✅ You want to avoid if-else or switch-case statements for selecting different behaviors.
 *
 * 1️⃣ Create a Strategy Interface (defines the common behavior for all strategies).
 * 2️⃣ Create Concrete Strategies (implement different variations of the behavior).
 * 3️⃣ Create a Context Class (uses the strategy dynamically).
 * 4️⃣ Client Chooses the Strategy at runtime.
 */
public class StrategyExample {

    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        // Pay using Credit Card
        cart.setPaymentStrategy(new CreditCardPayment());
        cart.checkout(100);

        // Pay using PayPal
        cart.setPaymentStrategy(new PayPalPayment());
        cart.checkout(200);
    }
}


