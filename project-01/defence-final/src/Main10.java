import processing.core.*;

public class Main10 extends PApplet {

    private final int N = 20;

    public void settings() {
        fullScreen();
    }

    public void setup() {
        noLoop();
        noStroke();
    }

    public void draw() {
        background(0, 0, 0);

        float dc = 250f / N;
        float dr = (float)min(height, width) / N;

        for(int i=0; i<N; ++i)
        {
            fill(5 + i*dc,0f,0f);
            circle(width/2.0f, height/2.0f, 1000-i*dr);
        }
    }

    public static void main(String[] args) {
        PApplet.main("Main10");
    }

}







/*
public class Main10 extends PApplet {

    private final int N = 20, MAX_R = 50;
    float x,y,dc,dr;

    public void settings() {
        fullScreen();
    }

    public void setup() {
        frameRate(40f);

        x = width/2f;
        y = height/2f;

        dc = Math.min(height,width);
        // dr =
    }

    public void draw() {
        background(0, 0, 0);

        for(int i=0; i<N; i++)
        {
            fill(255,0,0,20);
            circle(x,y,MAX_R*i);
        }
    }

    public static void main(String[] args) {
        PApplet.main("Main10");
    }
}*/
