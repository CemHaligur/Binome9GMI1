import java.util.ArrayList;

public class Main {

    public static void main(String[] args){

        Point p1 = new Point(1,2);
        Point p3 = new Point(2,2);
        Point p = new Point(2,3);


        LigneBriseeTreeSet points = new LigneBriseeTreeSet();
        points.add(p1);
        points.add(p3);
        points.add(p);

        points.String();
        points.remove(p1);
        points.String();
        System.out.println(points.contientPoints(p3));
        points.add(p3);

    }
}