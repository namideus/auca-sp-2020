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
        x = width/2f;
        y = height-1;
    }

    public void draw() {
        background(0, 0, 0);

        fill(100,10,255);
        ellipse(x,y, MAX_R, MAX_R);

//        if(x<width-(MAX_R/2f+10f))
//            x+=10; // Horizontal

        if(y>0+MAX_R/2f)
            y-=10; // Vertical
    }

    public static void main(String[] args) {
        PApplet.main("Main");
    }

}