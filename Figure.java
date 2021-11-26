import java.awt.Color;
import java.awt.* ;

public abstract class Figure {
    protected Point p;
    protected Color c;


    public Figure(Point p1)  {
        p = p1;
    }

    public Figure(Point p, Color co){
        this.p = p;
        this.c = co;
    }

    public String toString() {
        return ("( " + p.getX()+ ", "+ p.getY()+")");
    }

    public abstract int getPerimetre();
    public abstract int getSurface();
    public abstract void setBoundingBox(int hauteurBB, int largeurBB);
    public abstract void draw(Graphics g);

}