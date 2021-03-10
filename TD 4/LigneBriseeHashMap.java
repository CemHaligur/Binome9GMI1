import java.util.HashMap;

public class LigneBriseeHashMap {

    private HashMap<Point, String> points;

    public LigneBriseeHashMap(){

        this.points = new HashMap<Point, String>();
    }

    // Accesseurs

    public HashMap<Point, String> getPoints() {
        return points;
    }

    // Mutateurs

    public void setPoints(HashMap<Point, String> points) {
        this.points = points;
    }


    // Autre Methodes

    public void add(Point p){
        if(!contientPoints(p)) {
            this.points.put(p, "Points");
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
        return this.points.containsKey(p);
    }
}
