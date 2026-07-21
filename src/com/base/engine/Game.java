package com.base.engine;

import org.lwjgl.input.Keyboard;
import org.lwjgl.input.Mouse;

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
            System.out.println("right clicked at :" + Input.getMousePosition());
        }
        if (Input.getMouseUp(1)){
            System.out.println("right clicked released at :" + Input.getMousePosition());
        }
    }

    public void update(){}

    public void render(){}
}
