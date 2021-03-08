public class Rational {

    private int num;
    private int denom;


    // Constructeur

    public Rational(int num, int denom){
        if (denom == 0){
            throw new IllegalArgumentException("dénominateur nul");
        }
        this.num = num;
        this.denom = denom;

    }


    // Accesseurs


    public int getNum(){
        return this.num;
    }

    public int getDenom(){
        return this.denom;
    }


    // Autres Methodes

    //La méthode qui permet de multiplier deux fractions

    public void multiplication(Rational r){
        this.num = this.getNum() * r.getNum();
        this.denom = this.getDenom() * r.getDenom();
        this.irreductible();

    }

    //La méthode qui permet d'additionner deux fractions

    public void addition(Rational r){
        this.num = this.getNum()*r.getDenom() + this.getDenom()*r.getNum();
        this.denom = this.getDenom()*r.getDenom();
        this.irreductible();
    }

    //La méthode pour avoir le PGCD entre deux nombre x et y par recursivité

    private int pgcd(int x, int y){
        if (y == 0){
            return x;
        }
        return pgcd(y, x%y);
    }

    //La méthode qui permet de rendre une fraction irréductible

    private void irreductible(){
        int pgcd = pgcd(this.num, this.denom);
        this.num /= pgcd;
        this.denom /= pgcd;

    }


    public String toString() {

        return this.getNum() + "/" + this.getDenom();
    }

}
