import processing.core.*;

import javax.swing.*;

public class Main extends PApplet {

    private float x,y,z, dx,dy,columns,rows;
    private int size;
    private String text;
    private float D = 50;

    public void settings() {
        fullScreen();
    }

    public void setup() {
        size = Integer.parseInt(JOptionPane.showInputDialog("Enter the field's size [10,40]:").trim());
    }

    public void draw() {
        background(0,0,0);

        for(int row=0; row<size; row++) {
            for (int column = 0; column<size; x++) {
                x+=500f/size;
                y+=500f/size;
                if((x+y)%2!=0)
                    fill(255,0,0);
                else
                    fill(0,0,255);
                stroke(0);
                rect(x, y , x, x);
            }
        }
    }

//        for(float y=0; y<rows; y+=D) {
//            for (float x = 0; x<columns; x+=D) {
//                if((x+y)%2!=0)
//                    fill(255);
//                else
//                    fill(0);
//                stroke(0);
//                rect(x, y , D, D);
//            }
//        }

    public static void main(String[] args) {
        PApplet.main("Main");
    }

}