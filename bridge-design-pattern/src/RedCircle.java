public class RedCircle implements DrawApi{

    @Override
    public void draw(int radius, int x, int y) {
        System.out.println("Drawing red circle of radius " + radius + " at (" + x + "," + y + ")");
    }
}
