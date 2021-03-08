public class Main {

    public static void main(String[] args) {

        Zoo a1 = new Zoo("EISTI");
        a1.ajouteAnimal(new Lion("Selena", 15 , 16));
        a1.ajouteAnimal(new Lion("Selena1", 16, 17));
        a1.ajouteAnimal(new Lion("Selena2", 15, 18));
        a1.ajouteAnimal(new Tigre("Selena3", 15 , "Rouge"));
        a1.ajouteAnimal(new Tigre("Selena4", 15 , "Bleu"));
        a1.ajouteAnimal(new Tigre("Selena5", 15 , "Vert"));
        a1.crier();
        a1.nombreNourriture();

    }
}
