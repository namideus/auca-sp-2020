import processing.core.*;
import processing.event.KeyEvent;

import javax.swing.*;
import java.awt.*;

public class Main extends PApplet {

    public void settings() {
        fullScreen();
    }

    public void setup() {
        frameRate(30f);
    }

    public void draw() {
        background(0, 0, 0);


    }

    public static void main(String[] args) {
        PApplet.main("Main");
    }

    @Override
    public void keyPressed() {
        super.keyPressed();

        if(key==CODED)
        {
            if(keyCode==UP)
                System.out.println("UP");
            if(keyCode==LEFT)
                System.out.println("LEFT");
            if(keyCode==RIGHT)
                System.out.println("RIGHT");
            if(keyCode==DOWN)
                System.out.println("DOWN");
        }
    }
}