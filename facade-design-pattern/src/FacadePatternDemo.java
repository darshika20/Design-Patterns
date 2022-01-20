/**
 * In facade design pattern , the simplified methods are exposed to the customer and  all the complex function logic is
 * kept in delegated to different methods and are hidden from the customer
 * Here , the ShapeMaker class is used to draw in the main method to draw the shapes and the actual classes and methods
 * aren't exposed in main method
 * */

public class FacadePatternDemo {

    public static void main(String [] args) {
        ShapeMaker shapeMaker = new ShapeMaker();
        shapeMaker.drawCircle();
        shapeMaker.drawRectangle();
        shapeMaker.drawSquare();
    }
}
