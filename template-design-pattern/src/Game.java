public abstract class Game {

    protected abstract void initialize();
    protected abstract void startGame();
    protected abstract void endGame();

    public final void play(){
        initialize();
        startGame();
        endGame();
    }
}
