public class ObserverDesignPatternDemo {

    public static void main(String[] args) {
        Subject subject = new Subject();
        Observer binaryObserver = new BinaryObserver(subject);
        Observer octalObserver = new OctalObserver(subject);
        Observer hexaObserver = new HexaObserver(subject);

        int state = 15;
        System.out.println("First state : " + state);
        subject.setState(state);
        state = 10;
        System.out.println("Second state : " + state);
        subject.setState(state);
    }
}
