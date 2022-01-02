/**
 * In bridge pattern, the implementation class is decoupled from abstract class by using bridge interface
 * Here, the abstract class shape has a method draw , but this method can be implemented in different ways in the
 * concrete class Circle , as it can either be a redCircle or a greenCircle depending on what implementation is
 * used for the bridge interface DrawApi
 * */

public class BridgeDesignPatternDemo {
    public static void main(String [] args) {
        Shape shape= new Circle(10,0,0,new RedCircle());
        shape.draw();
        shape = new Circle(10,5,5,new GreenCircle());
        shape.draw();
    }
}
