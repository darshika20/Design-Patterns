/**
 * In this design pattern , a chain of receivers is created , so that if one receiver is not able to handle the
 * request , then it passes the request to the next receiver
 * In this example , AbstractLogger object uses the method logMessage to delegate responsibility to the appropriate
 * receiver for logging message
 * */

public class ChainOfResponsibilityDesignPatternDemo {

    private static AbstractLogger createLogger() {
        AbstractLogger logger = new ErrorLogger();
        logger.setNextLogger(new ConsoleLogger());
        logger.nextLogger.setNextLogger(new FileLogger());
        return logger;
    }

    public static void main(String [] args) {
        try {
            AbstractLogger logger = createLogger();
            logger.logMessage(Constants.INFO,"this is an information message");
            logger.logMessage(Constants.DEBUG,"this is a debug message");
            logger.logMessage(Constants.ERROR,"this is an error message");

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

    }
}
