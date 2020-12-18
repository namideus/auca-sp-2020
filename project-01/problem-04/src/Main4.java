import processing.core.*;
import processing.event.KeyEvent;

import javax.swing.*;
import java.awt.*;

public class Main4 extends PApplet {

    private float x,y,dx,dy,limX1,limX2,limY1,limY2;
    private int BLOCK, size;
    private final int WIDTH = 1000;
    private String text;

    public void settings() {
        fullScreen();
    }

    public void setup() {
        frameRate(20f);

        size = Integer.parseInt(JOptionPane.showInputDialog("Enter the field's size [10,40]:").trim());

        BLOCK = WIDTH/size;

        text = "Press Arrow buttons";

        x = (width*.5f-WIDTH*.5f)+BLOCK*.5f;
        y = 50f+BLOCK*.5f;

        limX1 = width*.5f-WIDTH*.5f;
        limX2 = width*.5f-WIDTH*.5f+(float)WIDTH;
        limY1 = 50f;
        limY2 = 50f+(float)WIDTH;

        dx = 0;
        dy = 0;
    }

    public void draw() {
        fill(0, 0, 0,20);
        rect(0,0,width-1,height-1);

        for (int i = 0; i < size; i++)
        {
            for (int j = 0; j < size; j ++)
            {
                stroke(0, 0, 255, 10);
                rect(i * BLOCK+(width*.5f-WIDTH*.5f), j * BLOCK+50f, BLOCK, BLOCK);
            }
        }

        fill(255,0,0);
        textAlign(CENTER);
        textSize(30f);
        text(text,width/2f,30f);

        circle(x,y,BLOCK);

        if(key==CODED)
        {
            if(keyCode==UP)
            {
                text = "You pressed button: UP";
                dx = 0;
                dy = -BLOCK;
            } else if(keyCode==LEFT)
            {
                text = "You pressed button: LEFT";
                dx = -BLOCK;
                dy = 0;
            } else if(keyCode==RIGHT)
            {
                text = "You pressed button: RIGHT";
                dx = BLOCK;
                dy = 0;
            } else if(keyCode==DOWN)
            {
                text = "You pressed button: DOWN";
                dx = 0;
                dy = BLOCK;
            }
        }

        if(limX1<x && limX2>x && limY1<y && limY2>y) {
            x += dx;
            y += dy;
        } else
        {
            dx = 0;
            dy = 0;
        }
    }

    public static void main(String[] args) {
        PApplet.main("Main4");
    }
}