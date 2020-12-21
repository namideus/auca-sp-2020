import processing.core.*;

import javax.swing.*;

public class Main09 extends PApplet {

    private final int MAX_EXTEND = 100;
    private float x1,y1;
    private boolean fx,fy;
    private float angle = 0,BLOCK;
    private int WIDTH = 300,HEIGHT = 300;
    private float dangle = .1f;
    private int numberOfRects;
    private float pointsXY[][];

    public void settings() {
        fullScreen();
    }

    public void setup() {
        noStroke();
        frameRate(30f);

        x1 = width/2f;
        y1 = height/2f;

        numberOfRects = Integer.parseInt(
                JOptionPane.showInputDialog(
                        "Enter the number of rectangles in a row [2, 8]:"
                ).trim());

        pointsXY = new float[numberOfRects][2];

        BLOCK = (float)WIDTH/numberOfRects;
    }

    public void draw() {
        fill(0,0,0,60);
        rect(0,0,width-1,height-1);

        animateRects();

        // animateRect();
    }

    public static void main(String[] args) {
        PApplet.main("Main09");
    }

    public void animateRects()
    {
        for (int i = 0; i < numberOfRects; i++)
        {
            for (int j = 0; j < numberOfRects; j++)
            {
                translate(i * BLOCK,j * BLOCK);
                rotate(frameCount/20f);
                fill(255);
                rect(-BLOCK*.5f,-BLOCK*.5f, BLOCK, BLOCK);
                resetMatrix();
            }
        }
    }

    public void updateXY()
    {

    }

    public void animateRect()
    {

        translate(x1,y1);
        rotate(angle);
        fill(255);
        rect(-50,-50,100,100);

        if(fx) {
            x1-=10;
            if(x1<=MAX_EXTEND)
                fx = false;
        } else {
            x1+=10;
            if(x1>=width-MAX_EXTEND)
                fx = true;
        }

        if(fy) {
            y1-=10;
            if(y1<=MAX_EXTEND)
                fy = false;
        } else {
            y1+=10;
            if(y1>=height-MAX_EXTEND)
                fy = true;
        }

        angle+=dangle;
    }

}