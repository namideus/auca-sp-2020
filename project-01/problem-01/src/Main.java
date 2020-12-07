import processing.core.*;

public class Main extends PApplet {

    private final int N = 100, MAX_R = 50;
    private float x1,y1,x2,y2,x3,y3;
    private boolean fx1,fy1,fx2,fy2,fx3, fy3;

    public void settings() {
        fullScreen();
    }

    public void setup() {
        frameRate(40f);

        x1 = width/2f;
        y1 = height/2f;
        x2 = width/2f-MAX_R;
        y2 = height/2f-MAX_R;
        x3 = width/2f-MAX_R*2;
        y3 = height/2f-MAX_R*2;
        fx1 = fy1 = fx2 = fy2 = fx3 = fy3 = false;
    }

    public void draw() {
        background(0, 0, 0);

        animateCircle1();
        animateCircle2();
        animateCircle3();

    }

    public static void main(String[] args) {
        PApplet.main("Main");
    }

    public void animateCircle1()
    {
        fill(100,10,255);
        ellipse(x1,y1, MAX_R, MAX_R);

        if(fx1) {
            x1-=10;
            if(x1<=MAX_R)
                fx1 = false;
        } else {
            x1+=10;
            if(x1>=width-MAX_R)
                fx1 = true;
        }

        if(fy1) {
            y1-=10;
            if(y1<=MAX_R)
                fy1 = false;
        } else {
            y1+=10;
            if(y1>=height-MAX_R)
                fy1 = true;
        }
    }

    public void animateCircle2() {
        fill(255, 0, 0);
        ellipse(x2, y2, MAX_R, MAX_R);

        if (fx2) {
            x2 -= 10;
            if (x2 <= MAX_R)
                fx2 = false;
        } else {
            x2 += 10;
            if (x2>=width-MAX_R)
                fx2 = true;
        }

        if (fy2) {
            y2 -= 10;
            if (y2<=MAX_R)
                fy2 = false;
        } else {
            y2 += 10;
            if (y2>=height-MAX_R)
                fy2 = true;
        }
    }

    public void animateCircle3()
    {
        fill(0,255,255);
        ellipse(x3,y3, MAX_R, MAX_R);

        if(fx3) {
            x3-=10;
            if(x3<=MAX_R)
                fx3 = false;
        } else {
            x3+=10;
            if(x3>=width-MAX_R)
                fx3 = true;
        }

        if(fy3) {
            y3-=10;
            if(y3<=MAX_R)
                fy3 = false;
        } else {
            y3+=10;
            if(y3>=height-MAX_R)
                fy3 = true;
        }
    }
}