import java.util.ArrayList;
import java.util.List;

public class CareTaker {

    private List<Memento> mementoList;

    public CareTaker() {
        this.mementoList = new ArrayList<>();
    }

    public void addMemento(Memento memento){
        mementoList.add(memento);
    }

    public Memento getMemento(int index){
        if(index >= mementoList.size()) {
            System.out.println("No more mementos present!!");
            return null;
        }
        return mementoList.get(index);
    }
}
