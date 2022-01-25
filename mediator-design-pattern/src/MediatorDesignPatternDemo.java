public class MediatorDesignPatternDemo {

    public static void main(String[] args) {
        User robert = new User("Robert");
        User julia = new User("Julia");
        robert.sendMessage("Hi ! I am Robert");
        julia.sendMessage("Hello everyone , Julia this side");
    }
}
