public class Cercle extends Figure{

    private float rayon;

    // Constructeur

    public Cercle(float rayon)
    {
        this.rayon = rayon;
    }


    // Accensseurs

    public float getRayon(){

        return this.rayon;
    }


    // Mutateurs

    public void setRayon(float rayon){

        this.rayon = rayon;
    }


    // Autres Methodes

    public String toString() {

        return "(" + this.getRayon() + ")";

    }

    public boolean equals(Cercle A){

        return  (this.getRayon() == A.getRayon());

    }

    public float perimetre() {

        return ((float) (2 * Math.PI * this.getRayon()));
    }

    public float surface() {

        return ((float) (Math.PI * Math.pow(this.getRayon(), 2)));
    }

}
