public class MementoDesignPatternDemo {

    public static void main(String[] args) {
        Originator originator = new Originator("state #1");
        originator.setState("state #2");
        CareTaker careTaker = new CareTaker();
        careTaker.addMemento(originator.saveStateToMemento());
        originator.setState("state #3");
        careTaker.addMemento(originator.saveStateToMemento());
        System.out.println("Fetching all saved states : ");
        int index = 0;
        while (careTaker.getMemento(index)!=null){
            System.out.println(originator.getStateFromMemento(careTaker.getMemento(index++)));
        }
    }
}
