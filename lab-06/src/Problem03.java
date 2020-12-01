import processing.core.*;

public class Problem03 extends PApplet {

    private final int N = 100;
    private final int MAX_R = 50;

    public void settings() {
        fullScreen();
    }

    public void setup() {
        noLoop();
    }

    public void draw() {
        background(0, 0, 0);

        drawStar(width/2f, height/2f,0, 100);
    }

    public static void main(String[] args) {
        PApplet.main("Problem03");
    }

    public void drawStar(float x, float y, float r, float color)
    {
        fill(color, color, color);
        line(x,y-50f,x,y+50f);
       // line();
    }

}