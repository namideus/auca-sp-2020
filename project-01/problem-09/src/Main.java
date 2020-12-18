import processing.core.*;

public class Main extends PApplet {

    private float angle = 0;
    private float dangle = .1f;

    public void settings() {
        fullScreen();
    }

    public void setup() {
        noStroke();
    }

    public void draw() {
        fill(0,0,0,20);
        rect(0,0,width-1,height-1);

        translate(width*.5f,height*.5f);
        rotate(angle);
        fill(255);
        rect(-50,-50,100,100);

        angle+=dangle;
    }

    public static void main(String[] args) {
        PApplet.main("Main");
    }

}