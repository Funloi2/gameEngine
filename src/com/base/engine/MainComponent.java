package com.base.engine;

import com.sun.tools.javac.Main;

public class MainComponent {

    private static final int WIDTH = 800;
    private static final int HEIGHT = 600;
    private static final String TITLE = "Game Engine";

    public MainComponent() {

    }

    public void start() {
        run();
    }

    public void stop() {

    }

    public void run() {
        while(!Window.isCloseRequested()) {
            render();
        }
        if (Window.isCloseRequested()) {
            cleanUp();
        }
    }

    public void render() {
        Window.render();
    }

    public void cleanUp() {
        System.out.println("Cleaning up resources...");
    }

    public static void main(String[] args) {
        Window.createWindow(WIDTH, HEIGHT, TITLE);
        MainComponent game = new MainComponent();
        game.start();
    }
}
