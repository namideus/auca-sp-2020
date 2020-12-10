import processing.core.*;

public class Main extends PApplet {

    float earthAngle = 0;
    float earthSpeed = 0.05f;

    float moonAngle = 0;
    float moonSpeed = 0.3f;

//    float mercuryAngle = 0;
//    float mercurySpeed = 0.09f;

    public void settings() {
        fullScreen();
    }

    public void setup() {
    }

    public void draw() {
        background(0, 0, 0);

        translate(width/2f,height/2f);
        fill(255,255,0);
        circle(0,0,200); // The Sun
        rotate(earthAngle);
        // The Earth
        fill(0,0,255);
        circle(width/6f, 0, 50);
        earthAngle+=earthSpeed; // Increment angle

    }

    public static void main(String[] args) {
        PApplet.main("Main");
    }

}