public abstract class Burger implements Item {
    @Override
    public String getName() {
        return "Burger";
    }

    @Override
    public Packing getPacking() {
        return new Wrapper();
    }
}
