import processing.core.*;

import javax.swing.*;

public class Main extends PApplet {

    private int flakeNumber;
    PShape[] flake_shapes;

    float[] x;
    float[] y;
    float[] size;
    float[] spin;
    float[] spinspeed;

    public void settings() {
        fullScreen();
    }

    public void setup() {
        flakeNumber = Integer.parseInt(JOptionPane.showInputDialog("Enter the number of flakes:").trim());

        x = new float[flakeNumber];
        y = new float[flakeNumber];

        for(int i=0; i<flakeNumber; i++) {
            x[i] = random(0, width - 1);
            y[i] = random(0, height - 1);
        }
    }

    public void draw() {
        background(0, 0, 0);

//        for(int i=0; i<flakeNumber; i++) {
//            flakes[i].show();
//            flakes[i].fall();
//        }
    }

    public static void main(String[] args) {
        PApplet.main("Main");
    }

    void drawFlakes()
    {
        for(int i=0; i<12; i++)
        {
            pushMatrix();
            translate(x[i], y[i]);
        }
    }
}
