public class ErrorLogger extends AbstractLogger{

    public ErrorLogger() {
        this.level = Constants.ERROR;
    }

    @Override
    protected void write(String message) {
        System.out.println("Error::Logger : " + message);
    }
}
