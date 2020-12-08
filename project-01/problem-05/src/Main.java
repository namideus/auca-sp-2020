import processing.core.*;

public class Main extends PApplet {

    private float x,y, dx,dy,columns,rows;
    private String text;
    private float D = 50;

    public void settings() {
        fullScreen();
    }

    public void setup() {
        columns = min(height,width)/D;
        rows = min(height,width)/D;
    }

    public void draw() {
        background(0,0,0);

        for(int y=0; y<width; y+=D) {
            for (int x = 0; x <width; x+=D) {
                if((x+y)%2!=0)
                    fill(255,0,0);
                else
                    fill(0,0,255);
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