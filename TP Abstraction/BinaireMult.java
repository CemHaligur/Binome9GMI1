public class BinaireMult extends ExpBinaire{

    public BinaireMult(ExpAbstraite gauche, ExpAbstraite droite) {
        super(gauche, droite);
    }

    @Override
    protected String SigneBinaire() {
        return "*";
    }

    public double calcul(double G, double D){
        return G*D;
    }

}
