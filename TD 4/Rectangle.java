public class Rectangle extends Figure{

    private float largeur;
    private float longueur;

    // Constructeur


    public void Rectangle(float largeur, float longueur)
    {
        this.largeur = largeur;
        this.longueur = longueur;
    }


    // Accensseurs

    public float getLongueur(){
        return this.largeur;
    }

    public float getLargeur(){
        return this.longueur;
    }


    // Mutateurs

    public void setLongueur(float largeur){

        this.largeur = largeur;
    }


    public void setLargeur(float longueur){

        this.longueur = longueur;
    }


    // Autres Methodes

    public String toString() {

        return "(" + this.getLongueur() + "," + this.getLargeur() + ")";

    }

    public boolean equals(Rectangle A){

        return  ((this.getLongueur() == A.getLongueur())
                && (this.getLargeur() == A.getLargeur()));

    }

    public float perimetre() {

        return ((float) (2 * this.getLongueur()) + (2 * this.getLargeur()));
    }

    public float surface() {

        return ((float) (this.getLongueur() * this.getLargeur()));
    }


}

