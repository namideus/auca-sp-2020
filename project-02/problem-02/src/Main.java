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

        flakes = new Snowflake[flakeNumber];
        for(int i=0; i<flakeNumber; i++)
            flakes[i] = new Snowflake();
    }

    public void draw() {
        background(0, 0, 0);

        for(int i=0; i<flakeNumber; i++) {
            flakes[i].show();
            flakes[i].rotate();
            flakes[i].fall();
        }
    }

    public static void main(String[] args) {
        PApplet.main("Main");
    }

    private class Snowflake {
        float x = random(width);
        float y = random(-200,-100);
        float r = random(5,10);
        float angle = random(0,360);
        float yspeed = random(5,11);
        float rspeed = random(1,4);

        void fall() {
                y += yspeed;

                if (y > height)
                    y = random(-200, -100);
        }

        void rotate()
        {
            angle += rspeed;
        }

        void show()
        {
            PShape s = createShape();
            s.beginShape();
            s.fill(255, 255, 255);
            s.vertex(-25, -25);
            s.vertex(0, 50);
            s.vertex(50, 50);
            s.vertex(50, 0);
            //s.translate(25+x,25+y);
            s.translate(x,y);
            s.rotate(angle);
            s.endShape(CLOSE);
            shape(s,x,y);

//            strokeWeight(4f);
//            stroke(255,255,255);
//
//            float y1 = y-r;
//            float y2 = y+r;
//            line(x,y1,x,y2);
//            line(x-30f,y1,x+30f,y2);
//            line(x+30f,y1,x-30f,y2);
//
//            float x3 = x-r;
//            float x4 = x+r;
//            line(x3,y,x4,y);
        }
    }
}
