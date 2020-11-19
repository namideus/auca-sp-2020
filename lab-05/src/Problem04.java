import processing.core.*;

public class Problem04 extends PApplet {

    private final int N = 100;
    private final int MAX_R = 100;

    public void settings() {
        fullScreen();
    }

    public void setup() {
        noLoop();
    }

    public void draw() {
        background(0, 0, 0);
        for(int i=0;i<N;i++) {
            float rad = random(MAX_R);
            fill(random(20, 255), random(20, 255), random(20, 255));
            ellipse(random(width), random(height), rad, rad);
        }
    }

    public static void main(String[] args) {
       PApplet.main("Problem04");
    }

}