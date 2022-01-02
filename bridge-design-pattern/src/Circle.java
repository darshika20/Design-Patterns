public class Circle extends Shape{

    int radius;
    int x;
    int y;

    public Circle(int radius, int x, int y, DrawApi drawApi) {
        super(drawApi);
        this.radius = radius;
        this.x = x;
        this.y = y;
    }

    @Override
    void draw() {
        drawApi.draw(radius, x, y);
    }
}
