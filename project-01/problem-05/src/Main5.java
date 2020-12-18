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
        // fullScreen();
        size(WIDTH, HEIGHT);
    }

    public void setup() {
        size = Integer.parseInt(JOptionPane.showInputDialog("Enter the field's size [10,40]:").trim());
        BLOCKX = WIDTH/size;
        BLOCKY = HEIGHT/size;
    }

    public void draw() {
        // rectMode(CENTER);
        fill(0, 0, 0,100);
        rect(0,0,width-1,height-1);

        for (int i = 0; i < size; i ++) {
            for (int j = 0; j < size; j ++) {
                if ((i + j + 1) % 2 == 0) {
                    fill(255, 255, 255); // white
                } else {
                    fill(0, 0, 0); // black
                }
                rect(i * BLOCKX, j * BLOCKY, (i + 1) * BLOCKX, (j + 1) * BLOCKY);
            }
        }
    }

    public static void main(String[] args) {
        PApplet.main("Main5");
    }

}

  /*  void setup() {
        size(800, 800);
    }

    void draw() {
        background(255);
        for (int x = 0; x < 8; x++) {
            for (int y = 0; y < 8; y++) {
                if ((x+y)%2 == 0) {
                    fill(255);
                } else {
                    fill(0);
                }
                rect(x * 100, y * 100, 100, 100);
            }
        }
    }*/