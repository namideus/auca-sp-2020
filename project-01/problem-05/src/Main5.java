import processing.core.*;

import javax.swing.*;

public class Main5 extends PApplet {

    private float x,y,z, dx,dy,columns,rows;
    private int size;
    private String text;

//    public void settings() {
//        fullScreen();
//    }

    final int WIDTH = 600;
    final int HEIGHT = 600;
    private int BLOCKX;
    private int BLOCKY;

    @Override
    public void settings() {
        super.settings();
        fullScreen();
        //size(WIDTH, HEIGHT);
    }

    public void setup() {
        noLoop();
        size = Integer.parseInt(JOptionPane.showInputDialog("Enter the field's size [10,40]:").trim());
        BLOCKX = WIDTH/size;
        BLOCKY = HEIGHT/size;
    }

    public void draw() {
        background(0,0,0);

        for (int i = 0; i < size; i ++) {
            for (int j = 0; j < size; j ++) {
                if ((i + j + 1) % 2 == 0) {
                    fill(255, 255, 255); // white
                } else {
                    fill(0, 0, 0); // black
                }
                rectMode(CENTER);
                rect(i * BLOCKX, j * BLOCKY, (i + 1) * BLOCKX, (j + 1) * BLOCKY);
            }
        }
    }

    public static void main(String[] args) {
        PApplet.main("Main5");
    }

}