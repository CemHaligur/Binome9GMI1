import java.util.TreeSet;
import java.util.Iterator;


public class LigneBriseeTreeSet {

    private TreeSet<Point> points;

    public LigneBriseeTreeSet(){

        this.points = new TreeSet<Point>();
    }

    // Autre Methodes

    public void add(Point p){
        if(!contientPoints(p)) {
            this.points.add(p);
        }
        else{
            System.out.println("Ce point existe déjà !");
        }
    }

    public void remove(Point p){
        this.points.remove(p);
    }

    public int size(){
        return this.points.size();
    }

    public void String(){
        System.out.println(this.points);
    }

    public boolean contientPoints(Point p){
        return this.points.contains(p);
    }




}
