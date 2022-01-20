public class FileLogger extends AbstractLogger{

    public FileLogger() {
        this.level = Constants.INFO;
    }

    @Override
    protected void write(String message) {
        System.out.println("File::Logger : " + message);
    }
}
