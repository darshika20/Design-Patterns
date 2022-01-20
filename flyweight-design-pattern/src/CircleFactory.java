import java.util.HashMap;
import java.util.Map;

public class CircleFactory {

    private static final Map<String, Circle> circleList = new HashMap<>();

    public Circle createColoredCircle(String color) {
        if(circleList.containsKey(color)) {
            return circleList.get(color);
        }else {
            return new Circle();
        }
    }
}
