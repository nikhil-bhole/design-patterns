package patterns.singleton;

public class SingletonLogger {

    public static void main(String[] args) {
        CustomLogger.getInstance().log("This is a log message!");

        CustomLogger logger1 = CustomLogger.getInstance();
        CustomLogger logger2 = CustomLogger.getInstance();

        logger1.log("Singleton logger example");
        System.out.println(logger1 == logger2); // true (Same instance)
    }
}
