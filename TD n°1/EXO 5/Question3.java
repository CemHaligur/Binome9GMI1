import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        AfficherTableau2(args); //Changer le AfficherTableau1 en AfficherTableau2 pour changer la methode foreach vers la methode java.util.Arrays
        SommeTableau(args);

    }

    public static void SommeTableau(String[] args) {

        int somme = 0;
        for (String nombre : args)

            somme += Integer.parseInt(nombre.toString());

        System.out.println(somme);
    }

    public static void AfficherTableau1(String[] listeArguments) {

        for (String nombre : listeArguments)
            System.out.println(nombre.toString());
    }

    public static void AfficherTableau2(String[] listeArguments) {

        System.out.println(Arrays.toString(listeArguments));
    }

}


