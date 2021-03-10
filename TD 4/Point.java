public class Point implements Comparable<Point>{

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

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    public int compareTo(Point p) {
        double dp2 = (double) Math.sqrt(Math.pow(p.getX(),2) + Math.pow(p.getY(),2));
        double dp = (double) Math.sqrt(Math.pow(this.x,2) + Math.pow(this.y,2));
        if(dp > dp2)
            return 1;
        else
            return 0;
    }
}