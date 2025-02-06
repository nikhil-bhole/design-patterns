package patterns.structural.adapter;

// Legacy class with an incompatible interface
public class LegacyPaymentSystem {

    void makePayment(String customer, double money) {
        System.out.println("Processing payment of $" + money + " for " + customer + " using Legacy System.");
    }
}
