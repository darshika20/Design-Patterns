/**
 * In Decorator Design Pattern , we can add new feature in an already defined object without changing its structure
 * Here , a new feature of setting a border is added to shape object without modifying the shape interface itself
 * A new decorator abstract class implementing the shape interface is added, and it overrides the draw method of
 * shape interface to add the functionality of setting border
 * */

public class DecoratorPatternDemo {

    public static void main(String[] args) {
        Shape circle = new Circle();
        Shape rectangle = new Rectangle();

        circle.draw();
        rectangle.draw();

        ShapeDecorator circleDecorator = new RedShapeDecorator(circle);
        circleDecorator.draw();

        ShapeDecorator rectangleDecorator = new RedShapeDecorator(rectangle);
        rectangleDecorator.draw();
    }
}
