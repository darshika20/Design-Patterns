public class Authentication implements Filter{
    @Override
    public void execute(String request) {
        System.out.println("Authenticating : " + request);
    }
}
