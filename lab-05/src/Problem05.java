import processing.core.*;

public class Problem05 extends PApplet {

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
        PApplet.main("Problem05");
    }

}