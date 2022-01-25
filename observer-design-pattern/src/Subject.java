import java.util.ArrayList;
import java.util.List;

public class Subject {

    private List<Observer> observerList;
    private int state;

    public Subject(){
        this.observerList = new ArrayList();
    }

    public void attach(Observer observer){
        observerList.add(observer);
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
        notifyAllObservers();
    }

    private void notifyAllObservers(){
        for(Observer observer : observerList){
            observer.update(state);
        }
    }
}
