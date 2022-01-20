public abstract class AbstractLogger {
    protected int level;
    protected AbstractLogger nextLogger;

    protected void setNextLogger(AbstractLogger nextLogger) {
        this.nextLogger = nextLogger;
    }

    protected void logMessage (int level, String message) throws NotFoundException {
        if(this.level <= level){
            write(message);
        }else{
            if(nextLogger != null){
                nextLogger.logMessage(level, message);
            } else {
                throw new NotFoundException("Logger Not Found");
            }
        }
    }

    protected abstract void write(String message);
}
