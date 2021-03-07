class Tigre extends Animal {

    private String CouleurFourrure;

    public Tigre(String nom, int poids, String CouleurFourrure){
        super(nom,poids, new Regime("viandes", 25));
        this.CouleurFourrure = CouleurFourrure;
    }

// Accesseurs

    public String getCouleurFourrure(){
        return this.CouleurFourrure;
    }

    // Autres Methodes


    @Override
    public void crier() {
        super.crier();
        System.out.println("Ce lion de " + poids + " kilos avec une fourrure de " + CouleurFourrure + " cm" + " rugit !" );

    }

    @Override
    public int nombreNourriture() {
        return regime.prix()*poids;
    }

}
