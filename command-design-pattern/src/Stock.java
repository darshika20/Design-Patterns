public class Stock {

    private String name;
    private int quantity;

    public Stock(String name, int quantity) {
        this.name = name;
        this.quantity = quantity;
    }

    public void buyStock(){
        System.out.println("Stock is bought");
    }

    public void sellStock() {
        System.out.println("Stock is sold");
    }
}
