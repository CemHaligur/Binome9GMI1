abstract class Animal {

    private String nom;
    protected int poids;
    protected Regime regime;

    //Constructeur

    protected Animal(String nom, int poids, Regime regime) {
        this.nom = nom;
        this.poids = poids;
        this.regime = regime;
    }

    //Autre Methodes

    public void crier(){

        System.out.println(toString() + " crie...");
    }

    @Override
    public String toString() {

        return nom;
    }

    abstract public int nombreNourriture();
}
