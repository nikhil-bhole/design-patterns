package patterns.behavioral.strategy;

/**
 * The Strategy Pattern is a behavioral design pattern that allows you to define a family of algorithms,
 * put each one in a separate class, and make their objects interchangeable.
 */
public class ShoppingCart {

    private PaymentStrategy paymentStrategy;

    // Set strategy at runtime
    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    // Use the strategy
    public void checkout(int amount) {
        paymentStrategy.pay(amount);
    }
}
