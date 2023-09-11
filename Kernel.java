import java.lang.Thread;

class Kernel{

    final Window window;
    boolean gameRunning = false;
    Game game;
    

    Kernel(Window window){
        this.window = window;
        this.game = new Game(window);
    }

    void oneGame(){
        gameRunning = true;
        game.init();
        while(gameRunning){
            game.loop(this);
            window.paint(game);
            try {Thread.sleep(1000/60);} catch (Exception e) {e.printStackTrace();}
        }
    }

    void endGame(){
        gameRunning = false;
    }

}