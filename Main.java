
class Main{

    final Window window;
    final Kernel kernel;

    public static void main(String[] args){
        Main main = new Main();
        main.start();
    }

    Main(){
        this.window = new Window();
        this.kernel = new Kernel(window);
        System.out.println("todo operativo SIUUUUUUUUUUUUU");
    }

    private void start(){
        kernel.oneGame();
    }

}