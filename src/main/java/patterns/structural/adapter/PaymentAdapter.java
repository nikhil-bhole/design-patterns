package patterns.structural.adapter;

/**
 * The Adapter Pattern is a structural design pattern used to enable two incompatible interfaces to work together.
 * It acts as a bridge between a
 * client and an existing class, translating requests into a format the existing class can understand.
 *
 * When to Use the Adapter Pattern?
 * When you want to use an existing class but its interface doesn’t match your requirements.
 * When you want to reuse third-party or legacy code without modifying it.
 * When you want to make unrelated classes work together by providing a common interface.
 * <p>
 * Problem Scenario
 * Imagine you are developing an e-commerce application, and your system is designed to use a modern payment
 * gateway (NewPaymentGateway). However, your company acquires a legacy payment system (LegacyPaymentSystem) that
 * has a completely different interface.
 * <p>
 * Instead of modifying the LegacyPaymentSystem, which could be risky and time-consuming, you can use the Adapter Pattern.
 *
 * Benefits of Adapter Pattern
 * ✅ Reusability: Allows using existing classes without modification.
 * ✅ Flexibility: Makes it easy to integrate third-party or legacy code.
 * ✅ Decoupling: Client code depends only on the adapter, not the legacy system.
 *
 *
 */
public class PaymentAdapter implements NewPaymentGateway {

    private final LegacyPaymentSystem legacySystem;

    // Constructor
    public PaymentAdapter(LegacyPaymentSystem legacySystem) {
        this.legacySystem = legacySystem;
    }

    @Override
    public void processPayment(String customerName, double amount) {
        // Adapting the method call
        legacySystem.makePayment(customerName, amount);
    }
}
