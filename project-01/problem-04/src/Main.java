import processing.core.*;
import processing.event.KeyEvent;

import javax.swing.*;
import java.awt.*;

public class Main extends PApplet {

    private float x,y, MAX_R;

    public void settings() {
        fullScreen();
    }

    public void setup() {
        frameRate(30f);

        x = width/2f;
        y = height/2f;

       // fielSize = Integer.getInteger(JOptionPane.showInputDialog("Enter the field's size [10,40]:").trim());
    }

    public void draw() {
        background(0, 0, 0);

        fill(255,0,0);
        circle(x,y, 100f);

        if(key==CODED)
        {
            if(keyCode==UP)
                y -= 10;
            if(keyCode==LEFT)
                x-=10;
            if(keyCode==RIGHT)
                x+=10;
            if(keyCode==DOWN)
                y+=10;
        }

       // drawGrid(width/2f,height/2f);


//        for(int i=0; i<fielSize; i++)
//            for(int j=0; j<fielSize; j++)
//            {
//
//            }
    }

    public void drawGrid(float x, float y)
    {
        line(x,10f,x,height-10f);
    }

    public static void main(String[] args) {
        PApplet.main("Main");
    }

    /*@Override
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
    }*/
}