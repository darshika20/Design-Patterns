public class BinaryObserver extends Observer{

    public BinaryObserver(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update(int state) {
        System.out.println("Updating Binary Observer with state " + state + " to " + Integer.toBinaryString(state));
    }
}
