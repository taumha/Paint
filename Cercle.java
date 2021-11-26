import java.awt.Color;

public class Cercle extends Ellipse {

    public Cercle(int c){
        super(c, c);
    }

    public Cercle (int px, int py, Color c){
        super(px, py, c);
    }

    public void setLargeur(int cote){
        super.semiAxysX = cote;
        super.semiAxysY = cote;
    }

    public void setBoundingBox(int horizontalBB, int largeurBB){
        this.semiAxysX = horizontalBB;
        this.semiAxysY = horizontalBB;
    }

    public void setLongueur(int cote){
        super.semiAxysX = cote;
        super.semiAxysY = cote;
    }
}