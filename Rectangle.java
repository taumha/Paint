import java.awt.Color;
import java.awt.* ;

public class Rectangle extends Figure {
    protected int length;
    protected int width;

    public Rectangle(Point p) {
        super (p);
        this.length = 0;
    }

    public Rectangle(int lo, int la) {
        super(new Point());
        length = lo;
        width = la;
    }

    public Rectangle (int px, int py, Color c){
        super(new Point(px, py), c);
        this.length = 0;
        this.width = 0;
    }

    public void draw(Graphics g) {
        g.setColor(this.c);
        g.fillRect(p.getX(), p.getY(), this.length, this.width);
    }

    public void setBoundingBox(int hauteurBB, int largeurBB){
        this.length = hauteurBB;
        this.width = largeurBB;
    }

    public int getPerimetre() {
        return (2* length + 2* width);
    }

    public int getSurface() {
        return (length * width);
    }

    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }

    public void setLength(int L){
        length = L;
    }

    public void setWidth(int l){
        width = l;
    }

    public String toString() {
        return ("O : " + p.toString()+ ", longueur = " + length + ", largeur = " + width + ".");
    }

    public String affiche() {
        String s = "+";
        for (int i = 0; i< length; i++) {
            s+="--";
        }
        s+="+ \n";
        for (int j = 0; j< width; j++) {
            s+="|";
            for (int i = 0; i< length; i++){
                s+= "  ";
            }
            s+= "| \n";
        }
        s+="+";
        for (int i = 0; i< length; i++){
            s+="--";
        }
        s+="+";
        return (s);
    }
}