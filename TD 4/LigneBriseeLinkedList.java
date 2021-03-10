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

    public boolean contientPoints(Point p){

        return this.points.contains(p);
    }

    public int size(){
        return this.points.size();
    }

    public void String(){
        System.out.println(this.points);
    }

}
