import java.util.Arrays;
import java.util.ArrayList;

public class LigneBriseeArrayList {

    private ArrayList<Point> points;

    public LigneBriseeArrayList(ArrayList<Point> points){
        this.points = new ArrayList<Point>();

    }

    public LigneBriseeArrayList(){

        this.points = new ArrayList<Point>();
    }

    // accesseurs

    public ArrayList<Point> getPoints() {
        return points;
    }


    // mutateurs

    public void setPoints(ArrayList<Point> points) {
        this.points = points;
    }

    // Autres Methodes


    public void add(Point p){
        if(!contientPoints(p)){
        this.points.add(p);}
        else{
            System.out.println("Ce Point est déjà existant");
        }

    }

    public void remove(Point p){
        this.points.remove(p);
    }

    public boolean contientPoints(Point p){

        return this.points.contains(p);
    }

    public void String() {
        System.out.println(this.points);
    }


    public void size(){
        System.out.println("La taille est " + this.points.size());
    }

}