import processing.core.*;

public class Main extends PApplet {

    private float angle = 0, dangle = 0.6f;

    public void settings() {
        fullScreen();
    }

    public void setup() {
        frameRate(50f);
     //   noLoop();
    }

    public void draw() {
        background(0, 0, 0);

        pushMatrix();
        translate(width*.5f, height*.5f);
        rotate(angle);
        drawStar(0, 0, 200f, 255, 0, 255);
        popMatrix();

        angle+=dangle;

//        pushMatrix();
//        translate(width*0.5, height*0.5);
//        rotate(frameCount / 400.0);
//        star(0, 0, 80, 100, 40);
//        popMatrix();
//
//        pushMatrix();
//        translate(width*0.8, height*0.5);
//        rotate(frameCount / -100.0);
//        star(0, 0, 30, 70, 5);
//        popMatrix();

       // translate(width/2f,height/2f);
      //  rotate(angle);

    //   drawStar(width/2f, height/2f,min(width, height)/3f, 0,0,255);
    //    drawStar(width/4f, height/4f,min(width, height)/6f, 255,0,255);
//        drawStar(width - width/4f, height/4f,min(width, height)/6f, 255,0,255);
//        drawStar(width/4f, height-height/4f,min(width, height)/6f, 255,0,255);
//        drawStar(width-width/4f, height-height/4f,min(width, height)/6f, 255,0,255);

       // angle+=dangle;
    }

    public static void main(String[] args) {
        PApplet.main("Main");
    }

    public void drawStar(float x, float y, float r, float blue, float green, float red)
    {
        stroke(red,green,blue);

        float y1 = y-r;
        float y2 = y+r;
        line(x,y1,x,y2);

        float x3 = x-r;
        float x4 = x+r;
        line(x3,y,x4,y);

        float x5 = x + r/3;
        float y5 = y - r/3;
        float x6 = x - r/3;
        float y6 = y + r/3;
        line(x5,y5,x6,y6);

        float x7 = x + r/3;
        float y7 = y + r/3;
        float x8 = x - r/3;
        float y8 = y - r/3;
        line(x7,y7,x8,y8);

        line(x5,y5,x,y1);
        line(x8,y8,x,y1);
        line(x3,y,x8,y8);
        line(x3,y,x6,y6);
        line(x,y2,x6,y6);
        line(x,y2,x7,y7);
        line(x4,y,x7,y7);
        line(x4,y,x5,y5);
    }

}