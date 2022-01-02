public abstract class  ColdDrink implements Item{
    @Override
    public String getName() {
        return "ColdDrink";
    }

    @Override
    public Packing getPacking() {
        return new Bottle();
    }
}
