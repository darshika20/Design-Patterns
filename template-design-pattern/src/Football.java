public class Football extends Game{

    @Override
    protected void initialize() {
        System.out.println("Football Game has been initialized. Players be ready !!");
    }

    @Override
    protected void startGame() {
        System.out.println("Football Game has been started. Players start playing !!");

    }

    @Override
    protected void endGame() {
        System.out.println("Football Game has been ended. Players please stop playing !!");

    }
}
