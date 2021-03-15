import java.util.*;

public class Env {

    private HashMap<String, Double> Transformation;

    public Env(){
        Transformation = new HashMap<String, Double>();
    }

    public void associer(String variable, double valeur){
        Transformation.put(variable, valeur);
    }

    public double obtenirValeur(String variable){
        if(contient(variable)){
            return Transformation.get(variable);
        }
        else{
            throw new RuntimeException("Nous n'arrivons pas à trouver votre variable " + variable);
        }
    }

    public boolean contient(String variable){
        return Transformation.containsKey(variable);
    }

    @Override
    public String toString() {
        return "New : " + Transformation;
    }
}
