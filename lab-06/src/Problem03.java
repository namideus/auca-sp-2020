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

       // drawStar(width/2f, height/2f,0, 100);
    }

    public static void main(String[] args) {
        PApplet.main("Problem03");
    }

    public void drawStar()
    {
       //  fill(color, color, color);
       // line(x,y-50f,x,y+50f);
       // line();

        float r = min(width, height)/3f;
        float x = width/2f;
        float y = height/2f;
        float red = 255;
        float green = 0;
        float blue = 0;

        float x1 = x-r;
        float y1 = y;

        float x2 = x+r;

    }

}