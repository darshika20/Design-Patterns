/**
 * Command design pattern belongs to behavioural design pattern as it is applied to designing how the behaviour of an
 * object is invoked , here a request is wrapped under an object as a command (in this example , order class is the
 * command) which is then passed to the invoker and then the invoker has the responsibility to pass the request to the
 * appropriate command , here invoker is the Broker class and the requests are the buyStock and sellStock which
 * have to be executed
 * */

public class CommandDesignPatternDemo {

    public static void main(String[] args) {
        Broker broker = new Broker();
        Stock stock = new Stock("abc",100);
        broker.takeOrder(new BuyStock(stock));
        broker.takeOrder(new SellStock(stock));
        broker.placeOrder();
    }
}
