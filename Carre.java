import java.awt.Color;

public class Carre extends Rectangle {

    public Carre(int c){
        super(c, c);  // Un Carré est un Rectangle
    }

    public Carre (int px, int py, Color c){
        super(px, py, c);
    }

    public void setWidth(int cote){
        super.length = cote;
        super.width = cote;
    }

    public void setBoundingBox(int largeurBB, int hauteurBB){
        this.length = largeurBB;
        this.width = largeurBB;
    }

    public void setLength(int cote){
        super.length = cote;
        super.width = cote;
    }
}