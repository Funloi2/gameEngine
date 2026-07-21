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
    }

    public void update(){}

    public void render(){}
}
