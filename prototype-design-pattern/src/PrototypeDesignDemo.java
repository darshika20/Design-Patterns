public class PrototypeDesignDemo {

    public static void main(String[] args) {

        ShapeCache shapeCache = new ShapeCache();
        shapeCache.loadCache();
        shapeCache.getShape("circle").draw();
        shapeCache.getShape("rectangle").draw();
        shapeCache.getShape("square").draw();

        shapeCache.cachedShapes.remove("circle");

        ShapeCache clonedCache = shapeCache.clone();

        System.out.println("Cached shapes in cloned object");
        for(String shape : clonedCache.cachedShapes.keySet()) {
            clonedCache.getShape(shape).draw();
        }

    }
}
