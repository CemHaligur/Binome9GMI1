public class Point {

    private int x;
    private int y;
    private static int compteur;

    // Constructeur

    public Point(int x, int y)
    {
        this.x = x;
        this.y = y;
        compteur++;
    }

    // Accensseurs

    public int getX(){
        return this.x;
    }


    public int getY(){
        return this.y;
    }

    public int getCompteur(){
        return this.compteur;
    }

    // Mutateurs

    public void setX(int x){

        this.x = x;
    }


    public void setY(int y){

        this.y = y;
    }


    // Autres Methodes

    public String toString() {

        return "(" + this.getX() + "," + this.getY() + ")";

    }

    public boolean equals(Point p2){

        return  ((this.getX() == p2.getX())
                && (this.getX() == p2.getX()));

    }

    protected void finalize()  {

        System.out.println("Point supprimé " + this);
    }
}
