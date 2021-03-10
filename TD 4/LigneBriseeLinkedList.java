import java.util.LinkedList;

public class LigneBriseeLinkedList {

    private LinkedList<Point> points;

    public LigneBriseeLinkedList(LinkedList<Point> points){
        this.points = new LinkedList<Point>();
    }

    public LigneBriseeLinkedList(){
        this.points = new LinkedList<Point>();
    }

    // Autre Methodes

    public void add(Point p){
        this.points.add(p);
    }

    public void remove(Point p){
        this.points.remove(p);
    }

    public void contientPoints(Point p){

        System.out.println(this.points.contains(p));
    }

    public void String(){
        System.out.println(this.points);
    }

}
