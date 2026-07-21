package com.base.engine;

import org.lwjgl.input.Keyboard;

public class Game {

    public Game(){

    }

    public void input(){
        if (Input.getKeyDown(Keyboard.KEY_UP)){
            System.out.println("Up pressed");
        }
        if (Input.getKeyUp(Keyboard.KEY_UP)){
            System.out.println("Up release");
        }
//MOUSE TEST
        if (Input.getMouseDown(1)){
            System.out.println("right clicked");
        }
        if (Input.getMouseUp(1)){
            System.out.println("right clicked released");
        }
    }

    public void update(){}

    public void render(){}
}
