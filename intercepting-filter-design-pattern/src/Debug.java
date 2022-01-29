public class Debug implements Filter{

    @Override
    public void execute(String request) {
        System.out.println("Debugging : " + request);
    }
}
