public class BinairePlus extends ExpBinaire{

    public BinairePlus(ExpAbstraite gauche, ExpAbstraite droite) {
        super(gauche, droite);
    }

    @Override
    protected String SigneBinaire() {
        return "+";
    }

    public double calcul(double G, double D){
        return G+D;
    }
}
