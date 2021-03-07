public class Regime {

    private String nom;
    private int prix;

    //Constructeurs

    public Regime(String nom, int prix){
        this.nom = nom;
        this.prix = prix;
    }

    //Accesseurs

    public int prix(){
        return prix;
    }

    @Override
    public String toString() {
        return nom + " (" + prix + " €/kg)";
    }
}
