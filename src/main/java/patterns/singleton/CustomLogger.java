package patterns.singleton;

/**
 * Private constructor: Prevents external instantiation.
 * Volatile instance variable: Ensures proper visibility across threads.
 * Double-checked locking: Ensures thread safety while reducing synchronization overhead.
 */
public class CustomLogger {

    private static volatile CustomLogger instance;

    private CustomLogger() {
        if (instance != null) {
            throw new RuntimeException("Use getInstance() method to create instance.");
        }
    }

    public static CustomLogger getInstance() {
        if (instance == null) { // First check
            synchronized (CustomLogger.class) {
                if (instance == null) { // Second check inside synchronized block
                    instance = new CustomLogger();
                }
            }
        }
        return instance;
    }

    public void log(String message) {
        System.out.println("[Log] " + message);
    }
}
