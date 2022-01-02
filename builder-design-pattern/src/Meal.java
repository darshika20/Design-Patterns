import java.util.ArrayList;
import java.util.List;

public class Meal {
    private List<Item> items = new ArrayList<>();
    private double price;
    public void addItem(Item item) {
        items.add(item);
    }

    public void showItems() {
        for(Item item : items){
            System.out.println("Item name: " + item.getName());
            System.out.println("Item packaging: " + item.getPacking().getName());
            System.out.println("Item price: " + item.getPrice() );
            System.out.println("Price of packaging: " + item.getPacking().getPrice());
        }
    }

    private void calculatePrice(){
        for(Item item : items){
            price += item.getPrice() + item.getPacking().getPrice();
        }
    }

    public double getPrice(){
        calculatePrice();
        return price;
    }
}
