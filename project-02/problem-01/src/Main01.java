import processing.core.*;

import javax.swing.*;

public class Main01 extends PApplet {

    private int starNumber;
    private float[] coordsX;
    private float[] coordsY;
    private float[] rad1;
    private float[] rad2;
    private float[] red;
    private float[] green;
    private float[] blue;


    public void settings() {
        fullScreen();
    }

    public void setup() {
        starNumber = Integer.parseInt(JOptionPane.showInputDialog("Enter the number of stars:").trim());

        coordsX = new float[starNumber];
        coordsY = new float[starNumber];
        rad1 = new float[starNumber];
        rad2 = new float[starNumber];
        red = new float[starNumber];
        green = new float[starNumber];
        blue = new float[starNumber];

        for(int i=0; i<starNumber; i++)
        {
            coordsX[i] = random(10f,width-40f);
            coordsY[i] = random(10f,height-40f);
            rad1[i] = random(10f);
            rad2[i] = random(10f,40f);
            red[i] = random(255);
            green[i] = random(255);
            blue[i] = random(255);
        }
    }

    public void draw() {
        background(0, 0, 0);

        drawStar(width*.5f,height*.5f,50f,0,0,255);

        for(int i=0; i<starNumber; i++)
        {
            pushMatrix();
            translate(coordsX[i], coordsY[i]);
            rotate(frameCount / 20f);
            // star(0, 0, 10f, rad2[i], 9, red[i], green[i], blue[i]);
            drawStar(0, 0, rad2[i], blue[i], green[i],red[i]);
            popMatrix();
        }
    }

    public void drawStar(float x, float y, float r, float blue, float green, float red)
    {
        strokeWeight(3f);
        stroke(red,green,blue);

        float angle = TWO_PI/9;
        float hAngle = angle*.5f;
        fill(red,green,blue);

        for(float a = 0; a < TWO_PI; a+=angle)
        {
            float sx = x+cos(a)*r;
            float sy = y+sin(a)*r;
            line(x,y,sx,sy);
        }
    }

    public static void main(String[] args) {
        PApplet.main("Main01");
    }

    /*  public void star(float x, float y, float r1, float r2, int n, float r,float g, float b)
    {
        float angle = TWO_PI/n;
        float hAngle = angle*.5f;
        beginShape();
        fill(r,g,b);
        for(float a = 0; a < TWO_PI; a+=angle)
        {
            float sx = x+cos(a)*r2;
            float sy = y+sin(a)*r2;
            vertex(sx,sy);
            sx = x+cos(a+hAngle)*r1;
            sy = y+sin(a+hAngle)*r1;
            vertex(sx, sy);
        }
        endShape();
    }*/
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