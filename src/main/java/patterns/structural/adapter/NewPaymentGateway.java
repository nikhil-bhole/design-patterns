package patterns.structural.adapter;


// Target interface expected by the new system
public interface NewPaymentGateway {
    void processPayment(String customerName, double amount);
}
