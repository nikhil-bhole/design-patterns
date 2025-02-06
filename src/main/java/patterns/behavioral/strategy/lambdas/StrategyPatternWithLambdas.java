package patterns.behavioral.strategy.lambdas;

import patterns.behavioral.strategy.PaymentStrategy;

public class StrategyPatternWithLambdas {

    public static void main(String[] args) {
        // Using Lambda Expressions instead of separate classes
        PaymentStrategy creditCardPayment = amount ->
                System.out.println("Paid $" + amount + " using Credit Card.");

        PaymentStrategy payPalPayment = amount ->
                System.out.println("Paid $" + amount + " using PayPal.");

        // Using strategies dynamically
        creditCardPayment.pay(100);
        payPalPayment.pay(200);
    }
}
