import processing.core.*;

import javax.swing.*;

public class Main03 extends PApplet {

    private int N;
    private float[] coordsX;
    private float[] coordsY;
    private float speed = 5f;
    private float EXTEND = 30f;
    private boolean[][] bounceXY;


    public void settings() {
        fullScreen();
    }

    public void setup() {
        frameRate(50f);

        N = Integer.parseInt(JOptionPane.showInputDialog("N?").trim());

//        if(size<10 || size>40) {
//            JOptionPane.showMessageDialog(
//                    null,
//                    "Wrong size of the field entered!",
//                    "Error",
//                    JOptionPane.INFORMATION_MESSAGE);
//            exit();
//        }

        coordsX = new float[N];
        coordsY = new float[N];
        bounceXY = new boolean[N][2];

        float x = width*.5f;
        float y = height*.5f;

        for(int i=0; i<N; i++)
        {
            coordsX[i] = x;
            coordsY[i] = y;

            x += EXTEND;
            y += EXTEND;
        }
    }

    public void draw() {
        background(0, 0, 0);

        float dc = 250f/N;

        for(int i=0; i<N; i++)
        {
            fill(0f,0f,5+i*dc);
            ellipse(coordsX[i], coordsY[i], EXTEND+13f, EXTEND+13f);
        }

        updateXY();
    }

    public void updateXY()
    {
        for(int i=0; i<N; i++)
        {
            float x = coordsX[i];
            boolean fx = bounceXY[i][0];
            float y = coordsY[i];
            boolean fy = bounceXY[i][1];

            if(fx) {
                x-=speed;

                if(x<=EXTEND)
                    fx = false;
            } else {
                x+=speed;

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