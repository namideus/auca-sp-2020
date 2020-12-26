import processing.core.*;

import javax.swing.*;

public class Main04 extends PApplet {

    private int N;
    private float[][] coordsX;
    private float[][] coordsY;
    private final float speed = 5f;
    private final float EXTEND = 30f;
    private boolean[][] bounceX;
    private boolean[][] bounceY;


    public void settings() {
        fullScreen();
    }

    public void setup() {
        frameRate(50f);

        N = Integer.parseInt(JOptionPane.showInputDialog("Enter the number of sequences?").trim());

//        if(N<2 || N>35) {
//            JOptionPane.showMessageDialog(
//                    null,
//                    "Wrong size of !",
//                    "Error",
//                    JOptionPane.INFORMATION_MESSAGE);
//            exit();
//        }

        coordsX = new float[N][N];
        coordsY = new float[N][N];
        bounceX = new boolean[N][N];
        bounceY = new boolean[N][N];

        for(int i=0; i<N; i++) {

            float x = random(width);
            float y = random(height);

            for (int j = 0; j < N; j++)
            {
                coordsX[i][j] = x;
                coordsY[i][j] = y;

                x += EXTEND;
                y += EXTEND;
            }
        }
    }

    public void draw() {
        background(0, 0, 0);

        float dc = 230f/N;

        for(int i=0;i<N;i++)
        {
            for (int j = 0; j < N; j++)
            {
                fill(0f, 0f, 25f + j * dc);
                ellipse(coordsX[i][j], coordsY[i][j], EXTEND + 13f, EXTEND + 13f);
            }
        }

        updateXY();
    }

    public void updateXY()
    {
        for(int i=0; i<N; i++)
        {
            for (int j = 0; j < N; j++)
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