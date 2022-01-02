public abstract class Shape {
    DrawApi drawApi;
    Shape(DrawApi drawApi) {
        this.drawApi = drawApi;
    }

    abstract void draw();
}
