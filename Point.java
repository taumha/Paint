public class Point {
    private int X;
    private int Y;

    /**
     * Construit le point de coordonnees (a, b)
     *
     * @param a abscisse
     * @param b ordonnée
     */
    public Point(int a, int b)  {
        X = a;
        Y = b; }

    /**
     * Construit un point de coordonnees (0, 0)
     */
    public Point() {
        X = 0;
        Y = 0;}

    /**
     * retourne l'abscisse du point
     */

    public int getX() {
        return X;}

    /**
     * retourne l'ordonnee du point
     */
    public int getY() {
        return Y; }

    public String toString() {
        return ("Point :(" +X+ "," +Y+ ")");
    }
}