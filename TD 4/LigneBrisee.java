
import java.util.Arrays;


public class LigneBrisee {

    private Point[] points;
    private static int taille = 4;

    public LigneBrisee(Point[] points){
        super();
        if(points == null)
        {
            this.points = new Point[taille];
        }
        else
        this.points = points;

    }

    public LigneBrisee(){

        this.points = new Point[taille];
    }

    // accesseurs

    public Point[] getPoint(){

        return points;
    }

    // mutateurs

    public void setPoints(Point[] points){

        this.points = points;
    }

    // Autres Methodes

    public boolean contientPoint(Point p){
        boolean t1 = false;

        for (Point point1 : this.getPoint()){
            if (p.equals(point1)) {
                t1 = true;
            }

        }
        return t1;
    }



    public String toString(){

        return "LigneBrisee [points = " + Arrays.toString(points) + "]";
    }

    public void addPoint(Point p){

        for(int i=0; i<this.getPoint().length;i++){

            if (this.getPoint()[i] == null){
                this.getPoint()[i] = p;
                break;
            }


        }

    }

    public int nombrePoints(){
        int cpt = 0;
        for (int i=0; i < this.getPoint().length;i++){
            if (this.getPoint()[i] != null) {
                cpt++;
            }
        }
        return cpt;
    }


    public int nombreMaximumPoints(){
        return this.getPoint().length - this.nombrePoints();
    }


    public void deletePoint(Point p){

        if (!(this.contientPoint(p))){

            System.out.print("Il n'y a pas ce point dans la ligne brisée \n");

        }
        else {
            int IP = 0;
            for (int i=0 ; i< this.getPoint().length;i++){
                if (this.getPoint()[i] == p) {
                    IP = i;
                    break;
                }
            }
            this.getPoint()[IP] = null;
            for (int j = IP ; j+1 < this.getPoint().length;j++){
                this.getPoint()[j] = this.getPoint()[j+1];
                this.getPoint()[j+1] = null;
            }
        }


    }


}
