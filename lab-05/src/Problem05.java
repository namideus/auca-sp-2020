import processing.core.*;

public class Problem05 extends PApplet {

    private final int N = 100;
    private float alpha = 0;

    public void settings() {
        fullScreen();
    }

    public void setup() {
        noLoop();
        alpha = 90;
    }

    public void draw() {
        background(0, 0, 0);

        for(int rad=0; rad<=900; rad+=50, alpha-=5)
        {
            fill(255f,50f,70f, alpha);
            ellipse(width/2f, height/2f, rad, rad);
        }
    }

    public static void main(String[] args) {
        PApplet.main("Problem05");
    }

}