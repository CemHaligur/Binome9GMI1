public class Constante extends ExpAbstraite {

    double valeur;

    public Constante(double valeur){
        this.valeur = valeur;
    }

    @Override
    public String toStringInfixe() {
        return "" + valeur;
    }

    @Override
    public double evaluer(Env env) {
        return valeur;
    }
}
