public class UnaireSin extends ExpUnaire{

    public UnaireSin(ExpAbstraite EA) {
        super(EA);
    }

    @Override
    public String toStringInfixe() {
        return "sin(" + operande.toStringInfixe() + ")";
    }

    @Override
    public double evaluer(Env env) {
        return Math.sin(operande.evaluer(env));
    }
}
