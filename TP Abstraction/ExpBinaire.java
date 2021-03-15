abstract class ExpBinaire extends ExpAbstraite {

    private ExpAbstraite opGauche;
    private ExpAbstraite opDroite;

    public ExpBinaire(ExpAbstraite gauche, ExpAbstraite droite){
        opGauche = gauche;
        opDroite = droite;
    }

    @Override
    public String toStringInfixe() {
        return  "(" + opGauche.toStringInfixe() + " " + SigneBinaire() + " " + opDroite.toStringInfixe() + ")";
    }

    abstract protected String SigneBinaire();
    abstract double calcul(double G,double D);

    public double evaluer(Env env){
        double G = opGauche.evaluer(env);
        double D = opDroite.evaluer(env);
        return calcul(G,D);
    }

}
