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

        firstText = JOptionPane.showInputDialog("Enter the first text:");
        secondText = JOptionPane.showInputDialog("Enter the second text:");
    }

    public void draw() {
        background(0, 0, 0);

        fill(255, 0, 0);
        textSize(100f);
        text(firstText, width / 2f, height / 2.5f);

        fill(255, 255, 0);
        textSize(100f);
        text(secondText, width / 2f, height / 1.5f);
    }

    public static void main(String[] args) {
        PApplet.main("Main");
    }

}