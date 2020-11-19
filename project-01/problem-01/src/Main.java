import processing.core.*;

public class Main extends PApplet {

    private final int N = 100;
    private final int MAX_R = 50;
    private float x;

    public void settings() {
        fullScreen();
    }

    public void setup() {
        x = 0;
    }

    public void draw() {
        background(0, 0, 0);

        fill(100,10,255);
        ellipse(x,height/2f,MAX_R,MAX_R);
        x+=10;

    }

    public static void main(String[] args) {
        PApplet.main("Main");
    }

}