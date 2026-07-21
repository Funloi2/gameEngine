package com.base.engine;

public class MainComponent {

    private static final int WIDTH = 800;
    private static final int HEIGHT = 600;
    private static final String TITLE = "Game Engine";

    int frames = 0;
    long frameCounter = 0;
    final static double FRAME_CAP = 1000.0;

    private boolean isRunning;

    private Game game;
    public MainComponent() {
        isRunning=false;
        game = new Game();
    }

    public void start() {
        if(isRunning) return;

        run();
    }

    public void stop() {
        if(!isRunning) return;
        isRunning=false;
    }

    private void run() {
        isRunning = true;

        long lastTime = Time.getTime();
        double unprocTime = 0;

        final double frameTime = 1.0/ FRAME_CAP;


        while(isRunning){
            boolean render = false;
            long startTime = Time.getTime();
            long passedTime = startTime - lastTime ;
            lastTime = startTime;

            unprocTime +=passedTime / (double)Time.SECOND;

            while(unprocTime > frameTime){

                render = true;

                unprocTime -= frameTime;
                frameCounter += passedTime;

                if(Window.isCloseRequested()) stop();

                Time.setDelta(frameTime);
                Input.update();

                game.input();
                game.update();
                if(frameCounter >= Time.SECOND){

                    System.out.println(frames);
                    frames = 0;
                    frameCounter = 0;
                }
            }
            if (render){
                render();
                frames++;

            }
            else{
                try{
                    Thread.sleep(1);
                }catch (InterruptedException error){
                    error.printStackTrace();
                }
            }
        }

        cleanUp();
    }

    private void render() {
        Window.render();
        game.render();
    }

    private void cleanUp() {
        Window.dispose();
    }

    public static void main(String[] args) {
        Window.createWindow(WIDTH, HEIGHT, TITLE);
        MainComponent game = new MainComponent();
        game.start();
    }
}
