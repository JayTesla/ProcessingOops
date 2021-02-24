import processing.core.PApplet;

public class Translate extends PApplet {

    private static final int TOTALNOOFBALLS = 4;
    public static final int WIDTH = 600;
    public static final int HEIGHT = 600;
    Balls[] ball;
    public static void main(String[] args) {
        PApplet.main("Translate");
    }

    @Override
    public void settings() {
        size(WIDTH, HEIGHT);
        ball = new Balls[TOTALNOOFBALLS];

        for (int i = 0; i < TOTALNOOFBALLS; i++) {
            ball[i] =new Balls(this,i+1);

        }
    }


    @Override
    public void draw() {

        for (Balls b :
                ball) {
            b.drawBall();
            b.moveBall();
        }

    }
}
