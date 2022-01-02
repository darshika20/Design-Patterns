import java.util.HashMap;
import java.util.Map;

public class ShapeCache implements Cloneable {
    Map<String,Shape> cachedShapes = new HashMap<>();

    public Shape getShape(String shapeId) {
        return (Shape) cachedShapes.get(shapeId).clone();
    }

    public void loadCache() {

        cachedShapes.put("circle",new Circle());
        cachedShapes.put("square", new Square());
        cachedShapes.put("rectangle", new Rectangle());

    }

    @Override
    protected ShapeCache clone()  {
        ShapeCache shapeCache = null;
        /**
         * shallow copy is made by using clone() method of object class
         * */
//        try {
//            shapeCache = (ShapeCache) super.clone();
//        } catch (CloneNotSupportedException e) {
//            e.printStackTrace();
////       }
        /**
         * creating deep copy of the object
         * */
        shapeCache = new ShapeCache();
        shapeCache.loadCache();
        return shapeCache;
    }
}
