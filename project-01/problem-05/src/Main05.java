import processing.core.*;

import javax.swing.*;

public class Main05 extends PApplet {

    private float x,y,z, dx,dy,columns,rows;
    private int size;
    private String text;

//    public void settings() {
//        fullScreen();
//    }

    final int WIDTH = 1000;
    final int HEIGHT = 1000;
    private int BLOCKX;
    private int BLOCKY;

    @Override
    public void settings() {
        super.settings();
        fullScreen();
    }

    public void setup() {
        size = Integer.parseInt(JOptionPane.showInputDialog("Enter the board's size [4,12]:").trim());

        if(size<4 || size>12) {
            JOptionPane.showMessageDialog(
                    null,
                    "Wrong size of the board entered!",
                    "Error",
                    JOptionPane.INFORMATION_MESSAGE);
            exit();
        }

        BLOCKX = WIDTH/size;
        BLOCKY = HEIGHT/size;
    }

    public void draw() {
        background(0, 0, 0);

        textAlign(CENTER);
        fill(255);
        textSize(40f);
        text("Row: 0; Column: 0; Color: White", width*.5f, 35f);

        for (int i = 0; i < size; i ++) {
            for (int j = 0; j < size; j ++) {
                if ((i + j + 1) % 2 == 0) {
                    fill(255, 255, 255); // white
                } else {
                    fill(0, 0, 0); // black
                }
                rect(i * BLOCKX+(width*.5f-WIDTH*.5f),
                        j * BLOCKY+(height*.5f-HEIGHT*.5f), BLOCKX, BLOCKY);

                stroke(255,0,0);
                strokeWeight(4f);
                rect(i * BLOCKX+(width*.5f-WIDTH*.5f),
                        j * BLOCKY+(height*.5f-HEIGHT*.5f), BLOCKX, BLOCKY);
            }
        }
    }

    public static void main(String[] args) {
        PApplet.main("Main05");
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