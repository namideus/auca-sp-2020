import processing.core.*;

import javax.swing.*;

public class Main03 extends PApplet {

    private int circleNumber;
    private float[] coordsX;
    private float[] coordsY;
    private float[] alpha;
    private float speed = 5f;
    private float EXTEND = 40f;
    private boolean[][] bounceXY;


    public void settings() {
        fullScreen();
    }

    public void setup() {
        frameRate(25f);

        circleNumber = Integer.parseInt(JOptionPane.showInputDialog("N?").trim());

        coordsX = new float[circleNumber];
        coordsY = new float[circleNumber];
        alpha = new float[circleNumber];
        bounceXY = new boolean[circleNumber][2];

        for(int i=0; i<circleNumber; i++)
        {
            coordsX[i] = random(10f,width-40f);
            coordsY[i] = random(10f,height-40f);
            alpha[i] = 250f-i;
        }
    }

    public void draw() {
        background(0, 0, 0);

        for(int i=0; i<circleNumber; i++)
        {
            fill(0,0,255, alpha[i]);
            circle(coordsX[i], coordsY[i], EXTEND);
        }

        updateXY();
    }

    public void updateXY()
    {
        for(int i=0; i<circleNumber; i++)
        {
            float x = coordsX[i];
            boolean fx = bounceXY[i][0];
            float y = coordsY[i];
            boolean fy = bounceXY[i][1];

            if(fx) {
                x-=speed;
                if(x<=EXTEND)
                    fx = false;
            } else {
                x+=speed;
                if(x>=width-EXTEND)
                    fx = true;
            }

            if(fy) {
                y-=speed;
                if(y<=EXTEND)
                    fy = false;
            } else {
                y+=speed;
                if(y>=height-EXTEND)
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
        PApplet.main("Main03");
    }
}