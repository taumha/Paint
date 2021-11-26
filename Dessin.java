import javax.swing.*;
import java.awt.* ;
import java.awt.event.*;
import java.util.*;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class Dessin extends JPanel implements MouseListener, MouseMotionListener{
    protected ArrayList<Figure> liste;
    protected Color c;
    protected String nomFigure;
    protected int x;
    protected int y;

    public Dessin(){
        super();
        this.c = Color.black;
        this.nomFigure = "Rectangle";
        this.liste = new ArrayList<Figure>();
        this.addMouseListener(this);
        this.addMouseMotionListener(this);
    }

    public void paintComponent(Graphics g){
        super.paintComponent(g);
        this.setBackground(Color.white);
        for(Figure f : liste){
            f.draw(g);
        }
    }

    public void setCouleur(Color cl){
        this.c = cl;
    }

    public void setNomFig(String nomFig){
        this.nomFigure = nomFig;
    }

    public void setListe(ArrayList<Figure> l){
        this.liste = l;
    }

    public void mouseDragged(MouseEvent e){
        /*System.out.println("Bouge"); */
        liste.get(liste.size()-1).setBoundingBox(e.getX()-x, e.getY()-y);
        paintComponent(this.getGraphics());
    }
    public void mouseMoved(MouseEvent e){}
    public void mouseClicked(MouseEvent e){}
    public void mouseEntered(MouseEvent e){}
    public void mouseExited(MouseEvent e){}
    public void mousePressed(MouseEvent e){
        x = e.getX();
        y = e.getY();
        /*System.out.println("Creation de la figure " +nomFigure+ " à l'origine (" +x+ ", " +y+ "), de couleur " +c); */
        switch(nomFigure) {
            case "Rectangle" : liste.add(new Rectangle(x, y, c));
                break;
            case "Ellipse" : liste.add(new Ellipse(x, y, c));
                break;
            case "Carre" : liste.add(new Carre(x, y, c));
                break;
            case "Cercle" : liste.add(new Cercle(x, y, c));
                break;
        }
    }
    public void mouseReleased(MouseEvent e){
        /*System.out.println("Dessin de la figure"); */
        liste.get(liste.size()-1).setBoundingBox(e.getX()-x, e.getY()-y);
        paintComponent(this.getGraphics());

    }

    public void efface() {
        liste.clear();
        super.paintComponent(this.getGraphics());
    }



    public ArrayList<Figure> getListe(){
        return this.liste;
    }

}