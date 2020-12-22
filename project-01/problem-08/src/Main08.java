import processing.core.*;

import javax.swing.*;

public class Main08 extends PApplet {

    private int starNumber = 4;
    private float angle;

    public void settings() {
        fullScreen();
    }

    public void setup() {
        frameRate(50f);

        starNumber = Integer.parseInt(JOptionPane.showInputDialog("Enter the number of stars [4,10]:").trim());
        angle = TWO_PI/starNumber;
    }

    public void draw() {
        background(0, 0, 0);

        translate(width*.5f, height*.5f);

        pushMatrix();
        rotate(frameCount/30f);
        drawStar(0, 0, 200f, 0, 0, 255);

        for(float a = 0; a < TWO_PI; a+=angle)
        {
            float sx = cos(a)*400;
            float sy = sin(a)*400;

            pushMatrix();
            translate(sx, sy);
            rotate(-frameCount/10f);
            drawStar(0, 0, 50f, 255, 0, 0);
            popMatrix();
        }

        popMatrix();
    }

    public static void main(String[] args) {
        PApplet.main("Main08");
    }

    public void drawStar(float x, float y, float r, float blue, float green, float red)
    {
        stroke(red,green,blue);

        float y1 = y-r;
        float y2 = y+r;
        line(x,y1,x,y2);

        float x3 = x-r;
        float x4 = x+r;
        line(x3,y,x4,y);

        float x5 = x + r/3;
        float y5 = y - r/3;
        float x6 = x - r/3;
        float y6 = y + r/3;
        line(x5,y5,x6,y6);

        float x7 = x + r/3;
        float y7 = y + r/3;
        float x8 = x - r/3;
        float y8 = y - r/3;
        line(x7,y7,x8,y8);

        line(x5,y5,x,y1);
        line(x8,y8,x,y1);
        line(x3,y,x8,y8);
        line(x3,y,x6,y6);
        line(x,y2,x6,y6);
        line(x,y2,x7,y7);
        line(x4,y,x7,y7);
        line(x4,y,x5,y5);
    }

}