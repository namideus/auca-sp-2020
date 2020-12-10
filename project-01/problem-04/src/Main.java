import processing.core.*;
import processing.event.KeyEvent;

import javax.swing.*;
import java.awt.*;

public class Main extends PApplet {

    private float x,y, dx,dy,size;
    private String text;
    private float D = 50;

    public void settings() {
        fullScreen();
        // size(1000,1000);

    }

    public void setup() {
        frameRate(40f);

        D = (float) Integer.parseInt(JOptionPane.showInputDialog("Enter the field's size [10,40]:").trim());

        text = "Press Arrow buttons";
        x = width/2f;
        y = height/2f;
        dx = D;
        dy = 0;
        size = min(height, width);
    }

    public void draw() {
        fill(0, 0, 0,20);
        rect(0,0,width-1,height-1);

        drawGrid();

        fill(255,0,0);
        textAlign(CENTER);
        textSize(30f);
        text(text,width/2f,30f);

        circle(x,y,D);

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

    // Draws grid
    public void drawGrid()
    {
        for(float x=width/2f-size/2, i=0; i<size/D-2; x+=D, i++) {
            for (float y = 40f, j=0; j<size/D-2; y+=D, j++) {
                stroke(0, 0, 255, 10);
                rect(x, y , D, D);
            }
        }
    }

    public static void main(String[] args) {
        PApplet.main("Main");
    }
}