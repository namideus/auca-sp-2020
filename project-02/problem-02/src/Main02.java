import processing.core.*;

import javax.swing.*;

public class Main02 extends PApplet {

    private int flakesNumber;
    private float[] coordsX;
    private float[] coordsY;
    private float[] rad;
    private float[] red;
    private float[] green;
    private float[] blue;
    private int[] spin;
    private float[] spinSpeed;
    private float[] speedY;


    public void settings() {
        fullScreen();
    }

    public void setup() {
        frameRate(25f);

        flakesNumber = Integer.parseInt(JOptionPane.showInputDialog("Enter the number of flakes:").trim());

        coordsX = new float[flakesNumber];
        coordsY = new float[flakesNumber];
        rad = new float[flakesNumber];
        red = new float[flakesNumber];
        green = new float[flakesNumber];
        blue = new float[flakesNumber];
        spin = new int[flakesNumber];
        spinSpeed = new float[flakesNumber];
        speedY = new float[flakesNumber];

        for(int i=0; i<flakesNumber; i++)
        {
            coordsX[i] = random(0,width);
            coordsY[i] = random(-200, -100);
            rad[i] = random(10f,30f);
            red[i] = random(255);
            green[i] = random(255);
            blue[i] = random(255);
            spin[i] = ((int)random(2,9)%2>0) ? 1 : -1;
            spinSpeed[i] = random(10,20);
            speedY[i] = random(2,6);
        }
    }

    public void draw() {
        background(0, 0, 0);

        for(int i=0; i<flakesNumber; i++)
        {
            pushMatrix();
            translate(coordsX[i], coordsY[i]);
            rotate(spin[i]*frameCount / spinSpeed[i]);

            if(rad[i]<=13f)
                drawFlake(0, 0, rad[i], 128, 128,128);
            else
                drawFlake(0, 0, rad[i], 255, 255,255);

            popMatrix();
        }

        updateXY();
    }

    public void updateXY()
    {
        for(int i=0; i<flakesNumber; i++)
        {
            coordsY[i] += speedY[i];
            coordsX[i] += random(-3,3);

            if (coordsY[i] > height)
                coordsY[i] = random(-200, -100);
        }
    }

    public void drawFlake(float x, float y, float r, float blue, float green, float red)
    {
        strokeWeight(3f);
        stroke(red,green,blue);

        float angle = TWO_PI/8;

        for(float a = 0; a < TWO_PI; a+=angle)
        {
            float sx = x+cos(a)*r;
            float sy = y+sin(a)*r;
            line(x,y,sx,sy);
        }
    }

    public static void main(String[] args) {
        PApplet.main("Main02");
    }
}

