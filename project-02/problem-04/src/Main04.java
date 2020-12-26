import processing.core.*;

import javax.swing.*;

public class Main04 extends PApplet {

    private int N, length;
    private float[][] coordsX;
    private float[][] coordsY;
    private final float speed = 5f;
    private final float EXTEND = 20f;
    private boolean[][] bounceX;
    private boolean[][] bounceY;
    private float[][] red;
    private float[][] green;
    private float[][] blue;


    public void settings() {
        fullScreen();
    }

    public void setup() {
        noStroke();

        frameRate(50f);

        N = Integer.parseInt(JOptionPane.showInputDialog("Enter the number of sequences?").trim());
        length = Integer.parseInt(JOptionPane.showInputDialog("Enter the length of sequences?").trim());

//        if(N<2 || N>35) {
//            JOptionPane.showMessageDialog(
//                    null,
//                    "Wrong size of !",
//                    "Error",
//                    JOptionPane.INFORMATION_MESSAGE);
//            exit();
//        }

        red = new float[N][length];
        green = new float[N][length];
        blue = new float[N][length];
        coordsX = new float[N][length];
        coordsY = new float[N][length];
        bounceX = new boolean[N][length];
        bounceY = new boolean[N][length];

        for(int i=0; i<N; i++) {

            float dc = 230f/length;
            float x = random(0, width);
            float y = random(0, height);
            float angle = random(0,TWO_PI);
            int rand = (int)random(255);

            coordsX[i][0] = x;
            coordsY[i][0] = y;

            x = x + cos(angle)*EXTEND;
            y = y + sin(angle)*EXTEND;

            for (int j = 1; j < length; j++)
            {
                if(rand%2==0) {
                    green[i][j] = 25f + j * dc;
                }else if(rand%3==0) {
                    blue[i][j] = 25f + j * dc;
                }else {
                    red[i][j] = 25f + j * dc;
                }

                coordsX[i][j] = x;
                coordsY[i][j] = y;

                x += EXTEND;
                y += EXTEND;
            }
        }
    }

    public void draw() {
        background(0, 0, 0);

        for(int i=0;i<N;i++)
        {
            for (int j = 0; j < length; j++)
            {
                fill(red[i][j],green[i][j],blue[i][j]);
                ellipse(coordsX[i][j], coordsY[i][j], EXTEND + 9f, EXTEND + 9f);
            }
        }

        updateXY();
    }

    public void updateXY()
    {
        for(int i=0; i<N; i++)
        {
            for (int j = 0; j < length; j++)
            {
                float x = coordsX[i][j];
                float y = coordsY[i][j];

                boolean fx = bounceX[i][j];
                boolean fy = bounceY[i][j];

                if (fx) {
                    x -= speed;

                    if (x <= EXTEND)
                        fx = false;
                } else {
                    x += speed;

                    if (x >= width - EXTEND)
                        fx = true;
                }

                if (fy) {
                    y -= speed;

                    if (y <= EXTEND)
                        fy = false;
                } else {
                    y += speed;

                    if (y >= height - EXTEND)
                        fy = true;
                }

                coordsX[i][j] = x;
                coordsY[i][j] = y;

                bounceX[i][j] = fx;
                bounceY[i][j] = fy;
            }
        }
    }

    public static void main(String[] args) {
        PApplet.main("Main04");
    }
}