public class BuilderPatternDemo {

    public static void main(String[] args){

        Meal vegMeal = MealBuilder.vegMealBuilder();
        System.out.println("Items in veg meal are : ");
        vegMeal.showItems();
        System.out.println("Price of veg meal is " + vegMeal.getPrice());

        Meal nonVegMeal = MealBuilder.nonVegMealBuilder();
        System.out.println("Items in non veg meal are : ");
        nonVegMeal.showItems();
        System.out.println("Price of non veg meal is " + nonVegMeal.getPrice());
    }

}
