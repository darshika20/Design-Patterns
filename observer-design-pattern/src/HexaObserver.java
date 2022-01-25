public class HexaObserver extends Observer{

    public HexaObserver(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);

    }

    @Override
    public void update(int state) {
        System.out.println("Updating Hexa Observer with state " + state + " to " + Integer.toHexString(state));
    }
}
