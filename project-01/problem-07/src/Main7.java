import processing.core.*;

public class Main7 extends PApplet {

    // Earth data
    float earthAngle = PI/8;
    float earthSpeed = 0.05f;

    // Moon data
    float moonAngle = PI/4;
    float moonSpeed = 0.3f;

    // Mercury data
    float mercuryAngle = PI/2;
    float mercurySpeed = 0.09f;

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

        pushMatrix();
        rotate(earthAngle);

        // The Earth
        fill(0,0,255);
        circle(width/6f, 0, 50);

        // Moon
        translate(width/6f, 0);
        rotate(moonAngle);
        fill(255,255,255);
        circle(width/20f,0,20);
        popMatrix();

        rotate(mercuryAngle);
        fill(255,0,0);
        circle(width/12f,0,30);

        mercuryAngle += mercurySpeed;
        earthAngle+=earthSpeed; // Increment angle
        moonAngle+=moonSpeed; // Increment angle
    }

    public static void main(String[] args) {
        PApplet.main("Main");
    }

}