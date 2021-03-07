import java.util.LinkedList;

class Zoo {

    private String nom;
    private LinkedList<Animal> animaux;

    public Zoo(String nom) {
        this.nom = nom;
        animaux = new LinkedList<Animal>();
    }

    public int getNbAnimaux() {
        return animaux.size();
    }

    public void ajouteAnimal(Animal animal) {
        animaux.add(animal);
    }

    public void crier() {
        for (Animal a : animaux) {
            a.crier();
        }
    }

    public void nombreNourriture(){
        int Total = 0;
        for(Animal a : animaux){
            int prix = a.nombreNourriture();
            Total += prix;
            System.out.println("Le cout est égale à " + prix + " €");
        }
        System.out.println("Le cout finale est de " + Total+ " €");
    }

}
