public class Cricket extends Game{

    @Override
    protected void initialize() {
        System.out.println("Cricket Game has been initialized. Players be ready !!");
    }

    @Override
    protected void startGame() {
        System.out.println("Cricket Game has been started. Players start playing !!");

    }

    @Override
    protected void endGame() {
        System.out.println("Cricket Game has been ended. Players please stop playing !!");

    }
}
