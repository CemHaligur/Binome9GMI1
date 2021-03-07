class Lion extends Animal {

    private int LongueurFourrure;

    public Lion(String nom, int poids, int LongueurFourrure){
        super(nom,poids, new Regime("viandes", 20));
        this.LongueurFourrure = LongueurFourrure;
    }

    // Accesseurs

    public int getLongueurFourrure(){
        return this.LongueurFourrure;
    }

    // Autres Methodes


    @Override
    public void crier() {
        super.crier();
        System.out.println("Ce lion de " + poids + " kilos avec une fourrure de " + LongueurFourrure +" cm" + " rugit !" );

    }

    @Override
    public int nombreNourriture() {
        return regime.prix()*poids;
    }
}
