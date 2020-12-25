import processing.core.*;

import javax.swing.*;

public class Main03 extends PApplet {

    private int circleNumber;
    private float[] coordsX;
    private float[] coordsY;
    private float[] alpha;
    private float speed = 10f;
    private float EXTEND = 40f;
    private boolean[][] bounceXY;


    public void settings() {
        fullScreen();
    }

    public void setup() {
        frameRate(25f);

        circleNumber = Integer.parseInt(JOptionPane.showInputDialog("N?").trim());

//        if(size<10 || size>40) {
//            JOptionPane.showMessageDialog(
//                    null,
//                    "Wrong size of the field entered!",
//                    "Error",
//                    JOptionPane.INFORMATION_MESSAGE);
//            exit();
//        }

        coordsX = new float[circleNumber];
        coordsY = new float[circleNumber];
        alpha = new float[circleNumber];
        bounceXY = new boolean[circleNumber][2];


        float x = EXTEND*.5f;
        float y = EXTEND*.5f;
        float alfa = 0;

        float d = 100f/circleNumber;

        for(int i=0; i<circleNumber; i++)
        {
            x += EXTEND;
            y += EXTEND/2f;

            coordsX[i] = x;
            coordsY[i] = y;

            alpha[i] = alfa;

            alfa += d;
        }
    }

    public void draw() {
        background(0, 0, 0);

        for(int i=0; i<circleNumber; i++)
        {
            fill(0f,0f,255f); //,alpha[i]);
            ellipse(coordsX[i], coordsY[i], EXTEND, EXTEND);
        }

        updateXY();
    }

    public void updateXY()
    {
        for(int i=0; i<circleNumber; i++)
        {
            float x = coordsX[i];
            boolean fx = bounceXY[i][0];
            float y = coordsY[i];
            boolean fy = bounceXY[i][1];

            if(fx) {
                x-=5f;

                if(x<=EXTEND)
                    fx = false;
            } else {
                x+=5f;

                if(x>=width-EXTEND)
                    fx = true;
            }

            if(fy) {
                y-=speed;

                if(y<=EXTEND)
                    fy = false;
            } else {
                y+=speed;

                if(y>=height-EXTEND)
                    fy = true;
            }

            coordsX[i] = x;
            coordsY[i] = y;
            bounceXY[i][0] = fx;
            bounceXY[i][1] = fy;
        }
    }

    public static void main(String[] args) {
        PApplet.main("Main03");
    }
}