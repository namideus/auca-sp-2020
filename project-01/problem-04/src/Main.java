import processing.core.*;
import processing.event.KeyEvent;

import javax.swing.*;
import java.awt.*;

public class Main extends PApplet {

    private float x,y, dx,dy;
    private int BLOCKX, BLOCKY, size;
    private final int WIDTH = 1000, HEIGHT = 1000;
    private String text;
    private float D = 50;

    public void settings() {
        // fullScreen();
        size(WIDTH, HEIGHT);
    }

    public void setup() {
        frameRate(40f);

        size = Integer.parseInt(JOptionPane.showInputDialog("Enter the field's size [10,40]:").trim());

        BLOCKX = WIDTH/size;
        BLOCKY = HEIGHT/size;

        text = "Press Arrow buttons";

        dx = 0;
        dy = 0;
    }

    public void draw() {
        fill(0, 0, 0,20);
        rect(0,0,width-1,height-1);

        for (int i = 0; i < size; i ++) {
            for (int j = 0; j < size; j ++) {
                stroke(0, 0, 255, 10);
                rect(i * BLOCKX, j * BLOCKY, BLOCKX, BLOCKY);
            }
        }

        fill(255,0,0);
        textAlign(CENTER);
        textSize(30f);
        text(text,width/2f,30f);

        circle(x,y,BLOCKX);

        if(key==CODED)
        {
            if(keyCode==UP) {
                text = "You pressed button: UP";
                dx = 0;
                dy = -D;
            } else if(keyCode==LEFT) {
                text = "You pressed button: LEFT";
                dx = -D;
                dy = 0;
            } else if(keyCode==RIGHT) {
                text = "You pressed button: RIGHT";
                dx = D;
                dy = 0;
            } else if(keyCode==DOWN) {
                text = "You pressed button: DOWN";
                dx = 0;
                dy = D;
            }
        }

        x+=dx;
        y+=dy;

    }

    public static void main(String[] args) {
        PApplet.main("Main");
    }
}