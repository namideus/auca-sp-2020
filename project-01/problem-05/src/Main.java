import processing.core.*;

public class Main extends PApplet {

    private float x,y,z, dx,dy,columns,rows;
    private String text;
    private float D = 50;

    public void settings() {
        fullScreen();
    }

    public void setup() {
        columns = min(height,width)/D;
        rows = min(height,width)/D;
        z = 0;
    }

    public void draw() {
        background(0,0,0);

        for(int row=0; y<height; y+=D) {
            for (int x = 0; x <width; x+=D) {
                if(z%2!=0)
                    fill(255,0,0);
                else
                    fill(0,0,255);
                z++;
                stroke(0);
                rect(x, y , D, D);
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