import processing.core.*;

import javax.swing.*;

public class Main extends PApplet {

    private boolean f1 = true, f2 = false;
    private float x1, x2, speed1, speed2;
    private String firstText, secondText;

    public void settings() {
        fullScreen();
    }

    public void setup() {
        frameRate(30f);

        x1 = width/2f;
        x2 = width/2f;

        firstText = JOptionPane.showInputDialog("Enter the first text:").trim();
        secondText = JOptionPane.showInputDialog("Enter the second text:").trim();

        speed1 = width/textWidth(firstText);
        speed2 = width/textWidth(secondText);
    }

    public void draw() {
        background(0, 0, 0);

        if(f1) {
            x1-=speed1;
            if(x1<=textWidth(firstText)/2f)
                f1 = false;
        } else {
            x1+=speed1;
            if(x1>=width-textWidth(firstText)/2f)
                f1 = true;
        }

        if(f2) {
            x2-=speed2;
            if(x2<=textWidth(secondText)/2f)
                f2 = false;
        } else {
            x2+=speed2;
            if(x2>=width-textWidth(secondText)/2f)
                f2 = true;
        }

        textAlign(CENTER);

        fill(255, 0, 0);
        textSize(100f);
        text(firstText, x1, height / 2.5f);

        fill(255, 255, 0);
        textSize(100f);
        text(secondText, x2, height / 1.5f);
    }

    public static void main(String[] args) {
        PApplet.main("Main");
    }

}