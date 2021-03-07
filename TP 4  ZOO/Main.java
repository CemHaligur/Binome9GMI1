public class Main {

    public static void main(String[] args) {

        Zoo a1 = new Zoo("EISTI");
        a1.ajouteAnimal(new Lion("Catherine", 15 , 16));
        a1.ajouteAnimal(new Lion("Julie", 16, 17));
        a1.ajouteAnimal(new Lion("Sahar Benoit", 15, 18));
        a1.ajouteAnimal(new Tigre("Nicolas", 15 , "Rouge"));
        a1.ajouteAnimal(new Tigre("Sebastien", 15 , "Bleu"));
        a1.ajouteAnimal(new Tigre("Sylvain", 15 , "Vert"));
        a1.crier();
        a1.nombreNourriture();

    }
}
