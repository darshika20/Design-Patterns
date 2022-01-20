public class ConsoleLogger extends AbstractLogger{

    public ConsoleLogger() {
        this.level = Constants.DEBUG;
    }

    @Override
    protected void write(String message) {
        System.out.println("Console::Logger : " + message);
    }
}
