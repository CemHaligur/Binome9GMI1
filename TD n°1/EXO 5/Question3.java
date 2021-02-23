public class Main {

    public static void main(String[] args) {

        TableauArg(args);
        SommeTableau(args);

    }

    public static void SommeTableau(String[] args) {

        int somme = 0;
        for (int i = 0; i < args.length; i++)

            somme = somme + Integer.parseInt(args[i]);

        System.out.println(somme);
    }

    public static void TableauArg(String[] listeArguments) {

        for (String nombre : listeArguments)
            System.out.println(nombre.toString());
    }

}