public abstract class Figure {

    private String Nom;
    private String Couleur;

    // Constructeur

    public void Figure(String Nom, String Couleur)
    {
        this.Nom = Nom;
        this.Couleur = Couleur;
    }

    // Accensseurs

    public String getNom(){

        return this.Nom;
    }

    public String getCouleur(){

        return this.Couleur;
    }

    // Mutateurs

    public void setNom(String perimetre){

        this.Nom = Nom;
    }

    public void setCouleur(String surface){

        this.Couleur = Couleur;
    }


    // Autres Methodes

    public abstract float perimetre();
    public abstract float surface();

    public String toString() {

        return "{" + this.getNom() + "," + this.getCouleur() + "}";

    }

    public boolean equals(Figure A){

        return  ((this.getNom() == A.getNom())
                && (this.getCouleur() == A.getCouleur()));

    }

}
