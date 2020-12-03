import processing.core.*;

import javax.swing.*;

public class Main extends PApplet {

    private boolean f = true;
    private float x1,x2;

    public void settings() {
        fullScreen();
    }

    public void setup() {
        frameRate(20f);
        noLoop();
    }

    public void draw() {
        background(0, 0, 0);

        String firstText = JOptionPane.showInputDialog("Enter the first text:");
        String secondText = JOptionPane.showInputDialog("Enter the second text:");

//        fill(255, 0, 0);
//        text("Hello,", width / 2f, height / 2.5f);
//
//        fill(255, 255, 0);
//        textSize(70f);
//        text("World of Java!", width / 2f, height / 1.5f);
    }

    public static void main(String[] args) {
        PApplet.main("Main");


    }

}