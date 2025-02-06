package patterns.structural.adapter;

public class AdapterPatternExample {

    public static void main(String[] args) {
        // Create instance of legacy system
        LegacyPaymentSystem legacySystem = new LegacyPaymentSystem();

        // Use adapter to make it compatible
        NewPaymentGateway paymentGateway = new PaymentAdapter(legacySystem);

        // Process payment using the adapted system
        paymentGateway.processPayment("John Doe", 150.75);
    }
}
