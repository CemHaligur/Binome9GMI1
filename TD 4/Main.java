public class Main {

    public static void main(String[] args){

        // Point p = new Point();
        // System.out.println(p.getX()+" "+p.getY());

        // Point point = new Point(4,7);
        // System.out.println(point.toString());

        //Point p1 = new Point(1,2);
        //Point p3 = new Point(2,2);
        //System.out.println("p1 = p2 -> " + p3.equals(p1));
        //System.out.println("le nombre de point est = " + p3.getCompteur());


        Figure F;
        Cercle C = new Cercle(5);
        // Carre C1 = new Carre(2);
        Rectangle R = new Rectangle(2,3);
        System.out.println(C);
        System.out.println(R);
        System.out.println("Le périmètre du cercle est : " + C.perimetre() + " La surface du cercle est : " + C.surface());
        System.out.println("Le périmètre du rectangle est : " + R.perimetre() + " La surface du rectangle est : " + R.surface());




    }
}
