public class StrategyDesignPatternDemo {

    public static void main(String[] args) {

        Context context = new Context(new AddStrategy());
        System.out.println("5 + 2 : " + context.executeStrategy(5,2));
        context = new Context(new SubtractStrategy());
        System.out.println("5 - 2 : " + context.executeStrategy(5,2));
        context = new Context(new MultiplyStrategy());
        System.out.println("5 * 2 : " + context.executeStrategy(5,2));
    }
}
