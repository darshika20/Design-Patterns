import java.util.ArrayList;
import java.util.List;

public class Broker { //invoker

    List<Order> orders;

    public Broker() {
        orders = new ArrayList<>();
    }

    public void takeOrder(Order order) {
        orders.add(order);
    }

    public void placeOrder() {
        for(Order order : orders){
            order.execute();
        }
    }
}
