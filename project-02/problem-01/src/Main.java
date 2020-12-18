import processing.core.*;

import javax.swing.*;

public class Main extends PApplet {

    private int starNumber;
    private float[] coordsX;
    private float[] coordsY;

    public void settings() {
        fullScreen();
        noLoop();
    }

    public void setup() {
        starNumber = Integer.parseInt(JOptionPane.showInputDialog("Enter the number of stars:").trim());

        coordsX = new float[starNumber];
        coordsY = new float[starNumber];

        for(int i=0; i<starNumber; i++)
        {
            coordsX[i] = random(width);
            coordsY[i] = random(height);
        }
    }

    public void draw() {
        background(0, 0, 0);

        for(int i=0; i<starNumber; i++)
        {
            drawStar(coordsX[i], coordsY[i],
                    random(30),random(255), random(255),random(255),
                    random(30f));
        }
    }

    public void drawStar(float x, float y, float r, float blue, float green, float red, float angle)
    {
        strokeWeight(4f);
        stroke(red,green,blue);

        float y1 = y-r;
        float y2 = y+r;
        line(x,y1,x,y2);
        line(x-30f,y1,x+30f,y2);
        line(x+30f,y1,x-30f,y2);

        float x3 = x-r;
        float x4 = x+r;
        line(x3,y,x4,y);
        line(x3,y-30f,x4,y+30f);
        line(x3,y+30f,x4,y-30f);
    }

    public static void main(String[] args) {
        PApplet.main("Main");
    }

/*    public void animateCircle3()
    {
        fill(0,255,255);
        ellipse(x3,y3, MAX_R, MAX_R);

        if(fx3) {
            x3-=10;
            if(x3<=MAX_R)
                fx3 = false;
        } else {
            x3+=10;
            if(x3>=width-MAX_R)
                fx3 = true;
        }

        if(fy3) {
            y3-=10;
            if(y3<=MAX_R)
                fy3 = false;
        } else {
            y3+=10;
            if(y3>=height-MAX_R)
                fy3 = true;
        }
    }*/
}