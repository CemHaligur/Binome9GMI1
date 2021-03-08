public class Vector {

    private Rational[] Vecteur;

    public Vector(int taille) {
        this.Vecteur = new Rational[taille];
        for (int i = 0; i < Vecteur.length; i++) {
            this.Vecteur[i] = new Rational(1, 1);
        }
    }

    // Autres Methodes

    @Override
    public String toString() {
        String VecteurEcriture = new String("<");
        for (int i = 0; i < this.Vecteur.length - 1; i++)
            VecteurEcriture = VecteurEcriture + this.Vecteur[i] + ", ";
        VecteurEcriture = VecteurEcriture + this.Vecteur[this.Vecteur.length - 1] + ">";
        return VecteurEcriture;
    }

    public void set(int i, Rational r){
        if (i > this.Vecteur.length){
            throw new IllegalArgumentException("i excede la dimension du vecteur");
        }
        this.Vecteur[i] = r;
    }

    public Rational get(int i){
        if (i > this.Vecteur.length){
            throw new IllegalArgumentException("i excede la dimension du vecteur");
        }
        return this.Vecteur[i];
    }

    public void multiplicationVecteur(Rational r){
        for(int i=0;i<this.Vecteur.length;i++){
            Vecteur[i].multiplication(r);
        }
    }

    public void additionVecteur(Vector v){
        if (this.Vecteur.length != v.Vecteur.length){
            throw new IllegalArgumentException("Les vecteurs sont de tailles différents");
        }

        for (int i=0; i< this.Vecteur.length ; i++){
            this.Vecteur[i].addition(v.get(i));
        }
    }
}
