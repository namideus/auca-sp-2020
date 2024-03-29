import processing.core.*;

import javax.swing.*;

public class Main01 extends PApplet {

    private int starNumber;
    private float[] coordsX;
    private float[] coordsY;
    private float[] rad;
    private float[] red;
    private float[] green;
    private float[] blue;
    private int[] spin;
    private float[] speed;
    private boolean[][] bounceXY;


    public void settings() {
        fullScreen();
    }

    public void setup() {
        frameRate(25f);

        starNumber = Integer.parseInt(JOptionPane.showInputDialog("Enter the number of stars:").trim());

        coordsX = new float[starNumber];
        coordsY = new float[starNumber];
        rad = new float[starNumber];
        red = new float[starNumber];
        green = new float[starNumber];
        blue = new float[starNumber];
        spin = new int[starNumber];
        speed = new float[starNumber];
        bounceXY = new boolean[starNumber][2];

        for(int i=0; i<starNumber; i++)
        {
            coordsX[i] = random(10f,width-40f);
            coordsY[i] = random(10f,height-40f);
            rad[i] = random(10f,40f);
            red[i] = random(255);
            green[i] = random(255);
            blue[i] = random(255);
            spin[i] = ((int)random(2,9)%2>0) ? 1 : -1;
            speed[i] = random(3,6);
            bounceXY[i][0] = ((int)random(1,8)%2>0);
            bounceXY[i][1] = ((int)random(1,8)%2>0);
        }
    }

    public void draw() {
        background(0, 0, 0);

        for(int i=0; i<starNumber; i++)
        {
            pushMatrix();
            translate(coordsX[i], coordsY[i]);
            rotate(spin[i]*frameCount / 5f);
            drawStar(0, 0, rad[i], blue[i], green[i],red[i]);
            popMatrix();
        }

        updateXY();
    }

    public void updateXY()
    {
        for(int i=0; i<starNumber; i++)
        {
            float x = coordsX[i];
            boolean fx = bounceXY[i][0];
            float y = coordsY[i];
            boolean fy = bounceXY[i][1];

            if(fx) {
                x-=speed[i];
                if(x<=rad[i])
                    fx = false;
            } else {
                x+=speed[i];
                if(x>=width-rad[i])
                    fx = true;
            }

            if(fy) {
                y-=speed[i];
                if(y<=rad[i])
                    fy = false;
            } else {
                y+=speed[i];
                if(y>=height-rad[i])
                    fy = true;
            }


            coordsX[i] = x;
            coordsY[i] = y;
            bounceXY[i][0] = fx;
            bounceXY[i][1] = fy;
        }
    }

    public void drawStar(float x, float y, float r, float blue, float green, float red)
    {
        strokeWeight(3f);
        stroke(red,green,blue);

        float angle = TWO_PI/9;

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
}