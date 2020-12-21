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

        float r = 0.2f;

        for (int i = 0; i < numberOfRects; i++) //1.2f)
        {
            for (int j = 0; j < numberOfRects; j++) //1.2f)
            {
                translate(i * BLOCK,j * BLOCK);
                rotate(frameCount/30f);
                fill(255);
                rect(0,0, BLOCK, BLOCK);
                resetMatrix();
            }
        }

        r+=0.2;

       // animateRects();

      //  animateRect();
    }

    public static void main(String[] args) {
        PApplet.main("Main09");
    }

     /* float r = 0;

    void setup() {
        size(400, 400);
        background(255);
        noStroke();
        fill(0);
        rectMode(CENTER);
    }
    void draw() {
        background(255);

        translate(100, 100);
        rotate(r);
        rect(0, 0, 80, 80);
        resetMatrix();

        translate(300, 100);
        rotate(r);
        rect(0, 0, 80, 80);
        resetMatrix();

        translate(100, 300);
        rotate(r);
        rect(0, 0, 80, 80);
        resetMatrix();

        translate(300, 300);
        rotate(r);
        rect(0, 0, 80, 80);
        resetMatrix();

        r = r + 0.02;
    }*/

    public void animateRects()
    {
        float r = 0;

        for (int i = 0; i < numberOfRects; i++) //1.2f)
        {
            for (int j = 0; j < numberOfRects; j++) //1.2f)
            {
                translate(i * BLOCK,j * BLOCK);
                rotate(r);
                fill(255);
                rect(0,0, BLOCK, BLOCK);
                resetMatrix();
            }
        }

        r+=0.2;
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