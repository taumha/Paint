import java.awt.Color;
import java.awt.* ;

public class Ellipse extends Figure {
    protected int semiAxysX;
    protected int semiAxysY;

    public Ellipse(Point p) {
        super (p);
        this.semiAxysY = 0;
        this.semiAxysX = 0;

    }

    public Ellipse(int ga, int pa) {
        super(new Point());
        semiAxysX = ga;
        semiAxysY = pa;
    }

    public Ellipse (int px, int py, Color c){
        super(new Point(px, py), c);
        this.semiAxysY = 0;
        this.semiAxysX = 0;
    }

    public void setBoundingBox(int hauteurBB, int largeurBB){
        this.semiAxysY = hauteurBB;
        this.semiAxysX = largeurBB;
    }

    public void draw(Graphics g) {
        g.setColor(this.c);
        g.fillOval(p.getX(), p.getY(), this.semiAxysY, this.semiAxysX);
    }

    public int getSurface() {
        return (int) (Math.PI* semiAxysX * semiAxysY /4);  //on caste (impose une classe) car sinon c'est un nombre trop grand qui demande une double précision (type double)
    }

    public int getPerimetre() {
        return (int) (2*Math.PI*Math.sqrt(((semiAxysY * semiAxysY)+(semiAxysX * semiAxysX))/2));
    }

    public int getSemiAxysX() {
        return semiAxysX;
    }

    public int getSemiAxysY() {
        return semiAxysY;
    }

}