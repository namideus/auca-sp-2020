import processing.core.*;

import javax.swing.*;

public class Main extends PApplet {

    private int starNumber;
    private PShape snow;

    public void settings() {
        fullScreen();
        // size(200, 200, P2D);
    }

   /* public void setup() {
        starNumber = Integer.parseInt(JOptionPane.showInputDialog("Enter the number of stars:").trim());

    }*/

    public void setup() {
    }

    public void draw() {
        background(0, 0, 0);

        drawStar(width/2f, height/2f, 50f,0,0,255);
    }

    public static void main(String[] args) {
        PApplet.main("Main");
    }

    public void drawStar(float x, float y, float r, float blue, float green, float red)
    {
        strokeWeight(3f);
        stroke(red,green,blue);

        float y1 = y-r;
        float y2 = y+r;
        line(x,y1,x,y2);

        float x3 = x-r;
        float x4 = x+r;
        line(x3,y,x4,y);

        float x5 = x + r/1.5f;
        float y5 = y - r/1.5f;
        float x6 = x - r/1.5f;
        float y6 = y + r/1.5f;
        line(x5,y5,x6,y6);

        float x7 = x + r/1.5f;
        float y7 = y + r/1.5f;
        float x8 = x - r/1.5f;
        float y8 = y - r/1.5f;
        line(x7,y7,x8,y8);

//        line(x5,y5,x,y1);
//        line(x8,y8,x,y1);
//        line(x3,y,x8,y8);
//        line(x3,y,x6,y6);
//        line(x,y2,x6,y6);
//        line(x,y2,x7,y7);
//        line(x4,y,x7,y7);
//        line(x4,y,x5,y5);
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