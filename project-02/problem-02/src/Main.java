import processing.core.*;

import javax.swing.*;

public class Main extends PApplet {

    private int flakeNumber;
    private float[] coordsX;
    private float[] coordsY;
    private Snowflake[] flakes;

    public void settings() {
        fullScreen();
    }

    public void setup() {
        flakeNumber = Integer.parseInt(JOptionPane.showInputDialog("Enter the number of flakes:").trim());
    }

    public void draw() {
        background(0, 0, 0);

    }

    public static void main(String[] args) {
        PApplet.main("Main");
    }

    private class Snowflake {
        float x = random(width);
        float y = random(-200,-100);
        float r = random(5,10);
        float yspeed = random(5,11);

        void fall()
        {
            y+=yspeed;
        }

        void show()
        {
            strokeWeight(4f);
            stroke(255,255,255);

            float y1 = y-r;
            float y2 = y+r;
            line(x,y1,x,y2);
            line(x-30f,y1,x+30f,y2);
            line(x+30f,y1,x-30f,y2);

            float x3 = x-r;
            float x4 = x+r;
            line(x3,y,x4,y);
        }
    }
}
