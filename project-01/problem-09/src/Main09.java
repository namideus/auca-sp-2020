import processing.core.*;

import javax.swing.*;

public class Main09 extends PApplet {

    private final int MAX_EXTEND = 100;
    private float x1,y1;
    private boolean fx,fy;
    private float angle = 0,BLOCK;
    private int WIDTH = 300,HEIGHT = 300;
    private int numberOfRects;
    private float pointX[][];
    private float pointY[][];


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

        if(numberOfRects<2 || numberOfRects>8) {
            JOptionPane.showMessageDialog(
                    null,
                    "Wrong number of rectangles entered!",
                    "Error",
                    JOptionPane.INFORMATION_MESSAGE);
            exit();
        }

        pointX = new float[numberOfRects][numberOfRects];
        pointY = new float[numberOfRects][numberOfRects];

        BLOCK = (float)WIDTH/numberOfRects;

        initXY();
    }

    public void draw() {
        fill(0,0,0,40);
        rect(0,0,width-1,height-1);

        animateRects();
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
                translate(pointX[i][j], pointY[i][j]);
                rotate(frameCount/30f);
                fill(255);
                rect(-BLOCK*.5f,-BLOCK*.5f, BLOCK-BLOCK/4f, BLOCK-BLOCK/4F);
                resetMatrix();
            }
        }

        updateXY();
    }

    public void initXY()
    {
        for (int i = 0; i < numberOfRects; i++)
        {
            for (int j = 0; j < numberOfRects; j++)
            {
                pointX[i][j] = i*BLOCK;
                pointY[i][j] = j*BLOCK;
            }
        }
    }

    public void updateXY()
    {
        for (int i = 0; i < numberOfRects; i++)
        {
            for (int j = 0; j < numberOfRects; j++)
            {
                float x =  pointX[i][j];
                float y =  pointY[i][j];

                if(fx) {
                    x-=5;

                    if(x<=BLOCK)
                        fx = false;
                } else {
                    x+=5;

                    if(x>=width-BLOCK)
                        fx = true;
                }

                if(fy) {
                    y-=5;

                    if(y<=BLOCK)
                        fy = false;
                } else {
                    y+=5;

                    if(y>=height-BLOCK)
                        fy = true;
                }

                pointX[i][j] = x;
                pointY[i][j] = y;
            }
        }
    }
}