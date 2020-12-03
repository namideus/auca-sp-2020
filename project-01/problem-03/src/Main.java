import processing.core.*;

import javax.swing.*;

public class Main extends PApplet {

    private boolean f = true;
    private float x1,x2;
    private String firstText, secondText;

    public void settings() {
        fullScreen();
    }

    public void setup() {
        frameRate(20f);

        x1 = width/2f;
        x2 = width/2f;

        firstText = JOptionPane.showInputDialog("Enter the first text:").trim();
        secondText = JOptionPane.showInputDialog("Enter the second text:").trim();
    }

    public void draw() {
        background(0, 0, 0);

        if(f) {
            x1-=5;
            x2+=5;

            if(x1==20)
                f = false;
        } else {
            x1+=5;
            x2-=5;

            if(x1==width-20)
                f = true;
        }

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