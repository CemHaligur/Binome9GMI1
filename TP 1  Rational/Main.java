public class Main {

    public static void main(String[] args) {

        //Rational r1 = new Rational(3,2);
        //Rational r2 = new Rational(1,3);
        //r1.multiplication(r2);
        //System.out.println(r1);

        System.out.println("Question 9.b");
        Vector v1 = new Vector(2);
        Rational a = new Rational(2,3);
        v1.set(0,a);
        System.out.println(v1);
        Rational b = new Rational(3,2);
        a.multiplication(b);
        System.out.println(v1);

        System.out.println("Question 9.d");
        Vector v2 = new Vector(2);
        v2.set(0, new Rational(1,2));
        v2.set(1, new Rational(1,2));
        System.out.println(v2);
        Rational a1 = v2.get(0);
        Rational tmp = new Rational(1,3);
        a1.multiplication(tmp);
        System.out.println(v2);

        System.out.println("Question 10");
        //v1.multiplicationVecteur(a1);
        v1.additionVecteur(v2);
        System.out.println(v1);

    }
}

