public class Carre extends Rectangle {


    private float cote;

    // Constructeur

    public Carre(float cote)
    {
        this.cote = cote;
    }


    // Accensseurs

    public float getCote(){
        return this.cote;
    }


    // Mutateurs

    public void setCote(float cote){

        this.cote = cote;
    }


    // Autres Methodes

    public String toString() {

        return "(" + this.getCote() + ")";

    }

    public boolean equals(Carre A){

        return  (this.getCote() == A.getCote());

    }

    public float perimetre() {

        return ((float) (4*this.getCote()));
    }

    public float surface() {

        return ((float) (this.getCote() * this.getCote()));
    }




}
