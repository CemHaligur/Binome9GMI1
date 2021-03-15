public class UnaireCos extends ExpUnaire{

    public UnaireCos(ExpAbstraite EA) {
        super(EA);
    }

    @Override
    public String toStringInfixe() {
        return "cos(" + operande.toStringInfixe() + ")";
    }

    @Override
    public double evaluer(Env env) {
        return Math.cos(operande.evaluer(env));
    }
}
