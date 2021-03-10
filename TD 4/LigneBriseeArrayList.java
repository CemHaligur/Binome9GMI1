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

    public ArrayList<Point> getPoint(){

        return points;
    }

    // mutateurs

    public void setPoints(ArrayList<Point> points){

        this.points = points;
    }

    // Autres Methodes


    public void add(Point p){
        this.points.add(p);
    }

    public void remove(Point p){
        this.points.remove(p);
    }

    public void contientPoints(Point p){
        System.out.println(this.points.contains(p));
    }

    public void String() {
        System.out.println(this.points);
    }

}