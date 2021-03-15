public abstract class ExpAbstraite {

    abstract public String toStringInfixe();

    @Override
    public String toString() {
        return "Voici l'ecriture infixé : " + toStringInfixe();
    }

    abstract public double evaluer(Env env);

}
