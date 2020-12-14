import processing.core.*;

import javax.swing.*;

public class Main extends PApplet {

    private int starNumber;

    public void settings() {
        fullScreen();
    }

    public void setup() {
        starNumber = Integer.parseInt(JOptionPane.showInputDialog("Enter the number of stars:").trim());

    }

    public void draw() {
        background(0, 0, 0);
    }

    public static void main(String[] args) {
        PApplet.main("Main");
    }

}