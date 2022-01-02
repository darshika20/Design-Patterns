public class GreenCircle implements DrawApi{

    @Override
    public void draw(int radius, int x, int y) {
        System.out.println("Drawing green circle of radius " + radius + " at (" + x + "," + y + ")");
    }
}
