import processing.core.*;

public class Main extends PApplet {

    private final int N = 100;
    private final int MAX_R = 50;
    private float x;
    private float y;

    public void settings() {
        fullScreen();
    }

    public void setup() {
        noLoop();
    }

    public void draw() {
        background(0, 0, 0);

        fill(255,0,0);
        textSize(100f);
        text("Java", width/2f, height/2f);
    }

    public static void main(String[] args) {
        PApplet.main("Main");
    }

}