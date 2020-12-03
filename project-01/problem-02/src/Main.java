import processing.core.*;

public class Main extends PApplet {

    private boolean f = true;
    private float size1, size2;

    public void settings() {
        fullScreen();
    }

    public void setup() {
        frameRate(20f);

        size1 = 100f;
        size2 = 20f;
    }

    public void draw() {
        background(0, 0, 0);

        if(f) {
            size1-=5;
            size2+=5;

            if(size1==20)
                f = false;
        } else {
            size1+=5;
            size2-=5;

            if(size1==100)
                f = true;
        }

        fill(255, 0, 0);
       // textSize(size1);
        textAlign(CENTER);
        text("Hello,", width / 2f, height / 2.5f);

        fill(0, 255, 0);
        textSize(size2);
        text("Wonderful", width / 2f, height / 1.9f);

        fill(255, 255, 0);
        textSize(size1);
        text("World of Java!", width / 2f, height / 1.5f);
    }

    public static void main(String[] args) {
        PApplet.main("Main");
    }

}