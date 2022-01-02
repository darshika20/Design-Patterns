public class Bottle implements Packing{
    @Override
    public String getName() {
        return "Bottle";
    }

    @Override
    public float getPrice() {
        return 12.0f;
    }
}
