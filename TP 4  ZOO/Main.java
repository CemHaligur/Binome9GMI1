public class Main {

    public static void main(String[] args) {

        Zoo a1 = new Zoo("EISTI");
        a1.ajouteAnimal(new Lion("fou", 15 , 16));
        a1.ajouteAnimal(new Lion("fou1", 16, 17));
        a1.ajouteAnimal(new Lion("fou2", 15, 18));
        a1.ajouteAnimal(new Tigre("fou3", 15 , "Rouge"));
        a1.ajouteAnimal(new Tigre("fou4", 15 , "Bleu"));
        a1.ajouteAnimal(new Tigre("fou5", 15 , "Vert"));
        a1.crier();
        a1.nombreNourriture();

    }
}
