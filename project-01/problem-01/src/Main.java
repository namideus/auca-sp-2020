import processing.core.*;

public class Main extends PApplet {

    private final int N = 100;
    private final int MAX_R = 100;

    public void settings() {
        fullScreen();
    }

    public void setup() {
        // noLoop();
    }

    public void draw() {
        background(0, 0, 0);

        fill(100,10,100);
        ellipse(width/2,height/2,MAX_R,MAX_R);
    }

    public static void main(String[] args) {
        PApplet.main("Main");
    }

}