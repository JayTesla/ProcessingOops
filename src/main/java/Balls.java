import processing.core.PApplet;
public class Balls {
    public int HEIGHT = Translate.HEIGHT;
    public int x,y;
    public int ballSpeed;
    private PApplet parent;

    public Balls(PApplet parent, int ballNo)
    {
        this.parent = parent;
        this.x = 0;
        this.y = HEIGHT * ballNo/5;
        this.ballSpeed = ballNo;
    }

    public void moveBall() {

        this.x += this.ballSpeed;
    }

    public void drawBall() {
        parent.ellipse(this.x, this.y, 10, 10);
    }
}
