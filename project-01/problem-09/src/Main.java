import processing.core.*;

public class Main extends PApplet {

    private final int MAX_EXTEND = 100;
    private float x1,y1;
    private boolean fx,fy;
    private float angle = 0;
    private float dangle = .1f;

    public void settings() {
        fullScreen();
    }

    public void setup() {
        noStroke();
        frameRate(30f);

        x1 = width/2f;
        y1 = height/2f;
    }

    public void draw() {
        fill(0,0,0,60);
        rect(0,0,width-1,height-1);

        animateRects();
    }

    public static void main(String[] args) {
        PApplet.main("Main");
    }

    public void animateRects()
    {
        translate(x1,y1);
        rotate(angle);
        fill(255);
        rect(-50,-50,100,100);

        if(fx) {
            x1-=10;
            if(x1<=MAX_EXTEND)
                fx = false;
        } else {
            x1+=10;
            if(x1>=width-MAX_EXTEND)
                fx = true;
        }

        if(fy) {
            y1-=10;
            if(y1<=MAX_EXTEND)
                fy = false;
        } else {
            y1+=10;
            if(y1>=height-MAX_EXTEND)
                fy = true;
        }

        angle+=dangle;
    }

}