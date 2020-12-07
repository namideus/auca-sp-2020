import processing.core.*;
import processing.event.KeyEvent;

import javax.swing.*;
import java.awt.*;

public class Main extends PApplet {

    private float x,y, dx,dy,columns,rows;
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
        columns = width/D;
        rows = height/D;
    }

    public void draw() {
        fill(0, 0, 0,50);
        rect(0,0,width-1,height-1);

        drawGrid();

        fill(255,0,0);
        textAlign(CENTER);
        textSize(30f);
        text(text,width/2f,30f);

        circle(x,y, D);

        if(key==CODED)
        {
            if(keyCode==UP) {
                dx = 0;
                dy = -D;
            } else if(keyCode==LEFT) {
                dx = -D;
                dy = 0;
            } else if(keyCode==RIGHT) {
                dx = D;
                dy = 0;
            } else if(keyCode==DOWN) {
                dx = 0;
                dy = D;
            }
        }
        x+=dx;
        y+=dy;

       // drawGrid(width/2f,height/2f);


//        for(int i=0; i<fielSize; i++)
//            for(int j=0; j<fielSize; j++)
//            {
//
//            }
    }

    public void drawGrid()
    {
        for(int i=0; i<columns; i++)
            for(int j=0; j<rows; j++)
            {
                float x = i*D;
                float y = j*D;
                stroke(0,0,255,20);
                rect(x,y+D,D,D);
            }
    }

    public static void main(String[] args) {
        PApplet.main("Main");
    }
}