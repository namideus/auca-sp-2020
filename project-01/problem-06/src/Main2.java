import processing.core.*;

public class Main2 extends PApplet {

    private final int N = 100, MAX_R = 50;
    private float x1,y1,x2,y2,x3,y3;
    private boolean fx1,fy1,fx2,fy2,fx3, fy3;

    public void settings() {
        fullScreen();
    }

    public void setup() {
        frameRate(40f);

    }

    public void draw() {
        background(0, 0, 0);

        textAlign(CENTER);
        fill(255);
        textSize(20f);
        text("The center of the circle is outside of both rectangles",width/2f,150f);

        fill(0,0,255);
        circle(mouseX, mouseY,50f);

        stroke(255);
        fill(0,0,0,0);
        rect(width/5f,height/4f,350f, 500f);

        rect(width/1.7f,height/4f,350f, 500f);
    }

    public static void main(String[] args) {
        PApplet.main("Main2");
    }
}