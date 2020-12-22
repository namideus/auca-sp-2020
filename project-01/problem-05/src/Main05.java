import processing.core.*;

import javax.swing.*;

public class Main05 extends PApplet {

    private int size;
    private String text;
    private final int WIDTH = 1000;
    private final int HEIGHT = 1000;
    private int BLOCK;
    private float[][] pointsX;
    private float[][] pointsY;

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

        pointsX = new float[size][size];
        pointsY = new float[size][size];

        BLOCK = WIDTH/size;
    }

    public void draw() {
        background(0, 0, 0);

        textAlign(CENTER);
        fill(255);
        textSize(40f);
        text("Row: 0; Column: 0; Color: White", width*.5f, 35f);

        for (int i = 0; i < size; i ++) {
            for (int j = 0; j < size; j ++) {
                float
                        x = i * BLOCK+(width*.5f-WIDTH*.5f),
                        y = j * BLOCK+(height*.5f-HEIGHT*.5f);

                pointsX[i][j] = x;
                pointsY[i][j] = y;

                if ((i + j + 1) % 2 == 0) {
                    fill(255, 255, 255); // white
                } else {
                    fill(0, 0, 0); // black
                }
                rect(x, y, BLOCK, BLOCK);
            }
        }

//        for (int i = 0; i < size; i ++) {
//            for (int j = 0; j < size; j++) {
//                float x = pointsX[i][j];
//                float y = pointsY[i][j];
//
//                if (mouseX > x && mouseX < x + BLOCK && mouseY > y && mouseY < y + BLOCK)
//                {
//                    stroke(255, 0, 0);
//                    strokeWeight(4f);
//                    rect(x, y, BLOCK, BLOCK);
//                }
//            }
//        }
    }

    public static void main(String[] args) {
        PApplet.main("Main05");
    }

}
