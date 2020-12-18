import processing.core.*;

public class Main2 extends PApplet {

    private float circleX, circleY, rectX1, rectY1, rectX2, rectY2;
    private final float RECT_WIDTH = 350f;
    private final float RECT_HEIGHT = 500f;
    private String text = "The center of the circle is outside of both rectangles";

    public void settings() {
        fullScreen();
    }

    public void setup() {
        frameRate(40f);
        rectX1 = width/5f;
        rectY1 = height/4f;
        rectX2 = width/1.7f;
        rectY2 = height/4f;

        circleX = rectX1+RECT_WIDTH/2;
        circleY = height/2f;
    }

    public void draw() {
        background(0, 0, 0);

        textAlign(CENTER);
        fill(255);
        textSize(20f);
        text(text,width/2f,150f);

        fill(0,100,255);
        stroke(0,100,255);
        circle(circleX, circleY,50f);

         if(circleX>rectX1 && circleX<rectX1+RECT_WIDTH && circleY>rectY1 && circleY<rectY1+RECT_HEIGHT)
         {
             text = "The center of the circle is in the left rectangle";
         } else if (circleX>rectX2 && circleX<rectX2+RECT_WIDTH && circleY>rectY2 && circleY<rectY2+RECT_HEIGHT)
         {
             text = "The center of the circle is in the right rectangle";
         } else {
             text = "The center of the circle is outside of both rectangles";
         }

        stroke(255);
        fill(0,0,0,0);
        rect(rectX1, rectY1, RECT_WIDTH, RECT_HEIGHT);
        rect(rectX2, rectY2, RECT_WIDTH, RECT_HEIGHT);

        fill(255,0,0);
        textSize(20f);

        if(mousePressed) {

            if(distance(circleX,circleY,mouseX,mouseY) < 50) // Does the mouse point at the circle?
            {
                circleX = mouseX;
                circleY = mouseY;
            }

            text("Mouse pressed",width/2f,height-100f);
        } else
            text("Mouse released",width/2f,height-100f);
    }

    private static double distance(double x1, double y1, double x2, double y2)
    {
        return Math.sqrt((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2));
    }

    public static void main(String[] args) {
        PApplet.main("Main2");
    }
}