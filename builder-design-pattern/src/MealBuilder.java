public class MealBuilder {

    private MealBuilder(){}

    public static Meal vegMealBuilder(){
        Meal meal = new Meal();
        meal.addItem(new VegBurger());
        meal.addItem(new Coke());
        return meal;
    }

    public static Meal nonVegMealBuilder(){
        Meal meal = new Meal();
        meal.addItem(new ChickenBurger());
        meal.addItem(new Pepsi());
        return meal;
    }
}
