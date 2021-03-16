import java.io.IOError;
import java.util.Scanner;

public class CThequeManager {

    public static void main(String[] args) {
        CDTheque cdtheque;
        int choix;
        cdtheque = new CDTheque();
        choix = -1;
        try {
            while(choix!=0){
                Menu();
                choix = saisieChoix();
                switch(choix){
                    case 1 :
                        System.out.println("En cours de construction !");
                        break;
                    case 2 :
                        addCD(cdtheque);
                        break;
                    case 3 :
                        removeCD(cdtheque);
                        break;
                    case 4 :
                        removeCDbyAT(cdtheque);
                        break;
                    case 5 :
                        removeCDbyST(cdtheque);
                        break;
                    case 6 :
                        searchCDByISBN(cdtheque);
                        break;
                    case 7 :
                        searchCDByAT(cdtheque);
                        break;
                    case 8 :
                        searchCDByST(cdtheque);
                        break;
                    case 9 :
                        afficherCDTheque(cdtheque);
                        break;
                    case 10 :
                        System.out.println("En cours de construction !");
                        break;
                    case 0 :
                        System.out.println("A une prochaine fois !");
                        break;
                }
            }
        } catch (IOError e){
            System.err.println("Erreur d'entré, Fin du programme...");
        }
    }

    private static void Menu() {
        System.out.println("");
        System.out.println("****************************MENU*****************************");
        System.out.println("(1) Charger la CDTheque");
        System.out.println("(2) Ajouter CD");
        System.out.println("(3) Supprimer CD par ISBN");
        System.out.println("(4) Supprimer CD par nom d'artiste et titre d'album");
        System.out.println("(5) Supprimer CD par style et titre d'album");
        System.out.println("(6) Rechercher CD par ISBN");
        System.out.println("(7) Rechercher CD par nom d'artiste et titre d'album");
        System.out.println("(8) Rechercher CD par style et titre d'album");
        System.out.println("(9) Afficher le contenu de la CDTheque");
        System.out.println("(10) Enregistrer la CDTheque dans un fichier ");
        System.out.println("(0) Quitter");
        System.out.println("");
    }

    private static String lireString(String s1) throws IOError{
        String lecture;
        System.out.println(s1 + " : ");
        Scanner s = new Scanner(System.in);
        lecture = s.nextLine();
        return lecture;
    }

    private static int saisieChoix() throws IOError{
        int choix = -1;
        boolean err;
        String lire;
        do{
            try{
                err = false;
                lire = lireString("Saisissez votre choix");
                choix = Integer.parseInt(lire);
            }catch(NumberFormatException e){
                err = true;
            }
        }while(err || choix < 0 || choix >10);
        return choix;
    }


    private static long saisieISBN() throws IOError{
        String isbn;
        long iSBN = -1;
        boolean err;
        do{
            try{
                err = false;
                isbn = lireString("Saisissez l'ISBN");
                iSBN = Long.parseLong(isbn);
            }catch(NumberFormatException e){
                err = true;
            }
        }while(err || (iSBN < 0));
        return iSBN;
    }

    private static int saisieNBTracks() throws IOError{
        String nbTracks;
        int IntNbTracks = -1;
        boolean err;
        do{
            try{
                err = false;
                nbTracks = lireString("Saisissez le nombre de pistes");
                IntNbTracks = Integer.parseInt(nbTracks);
            }catch(NumberFormatException e){
                err = true;
            }
        }while(err || (IntNbTracks < 0));
        return IntNbTracks;
    }

    private static void addCD(CDTheque cd) throws IOError{
        long isbn;
        String artist;
        String title;
        String style;
        String nbTracks;
        int intNbTracks;
        boolean err;
        boolean valider;

        System.out.println("Enregistrement d'un nouveau CD :");
        isbn = saisieISBN();
        artist = lireString("Saisir l'artiste");
        title = lireString("Saisir le titre de l'album");
        style = lireString("Saisir le style");
        intNbTracks = saisieNBTracks();
        valider = cd.addCD(isbn,artist,title,style,intNbTracks);
        if(valider){
            System.out.println("L'ajout du CD s'est achevé avec succès");
        }
        else{
            System.out.println("L'ajout du CD ne s'est pas effectué !");
        }
    }

    private static void removeCD(CDTheque cd) throws IOError{
        boolean valider;
        long isbn;
        System.out.println("Suppression d'un CD : ");
        isbn = saisieISBN();
        valider = cd.removeCD(isbn);
        if(valider){
            System.out.println("Le CD a été supprimé avec succès !");
        }
        else{
            System.out.println("Suite à une erreur le CD n'a malheureusement pas pu être supprimé");
        }

    }

    private static void removeCDbyAT(CDTheque cd){
        boolean valider;
        String artist;
        String title;
        System.out.println("Suppression d'un CD via son artiste et son titre d'album : ");
        artist = lireString("artiste");
        title = lireString("titre");
        valider = cd.removeCDByAT(artist, title);
        if(valider){
            System.out.println("Le CD a été supprimé !");
        }
        else{
            System.out.println("Suite à une erreur, nous n'avons pas réussit à supprimer le CD...");
        }
    }

    private static void removeCDbyST(CDTheque cd){
        boolean valider;
        String style;
        String title;
        System.out.println("Suppression d'un CD via son style et son titre d'album : ");
        style = lireString("style");
        title = lireString("titre");
        valider = cd.removeCDByST(style, title);
        if(valider){
            System.out.println("Le CD a été supprimé !");
        }
        else{
            System.out.println("Suite à une erreur, nous n'avons pas réussit à supprimer le CD...");
        }
    }

    private static void searchCDByISBN(CDTheque cd) throws IOError{
        CDAudio findCD;
        long isbn;
        System.out.println("Recherche d'un CD par son ISBN");
        isbn = saisieISBN();
        findCD = cd.searchCD(isbn);
        if(findCD != null){
            System.out.println("le CD est trouvé : " + findCD);
        }
        else{
            System.out.println("Aucun CD trouvé via l'ISBN");
        }

    }

    private static void searchCDByAT(CDTheque cd) throws IOError{
        CDAudio findCD;
        String artist;
        String title;
        System.out.println("Recherche d'un CD par son artiste et son titre d'album");
        artist = lireString("artiste");
        title = lireString("titre");
        findCD = cd.searchCDArtistTitle(artist,title);
        if(findCD != null){
            System.out.println("le CD est trouvé : " + findCD);
        }
        else{
            System.out.println("Aucun CD trouvé via les informations fournies");
        }
    }

    private static void searchCDByST(CDTheque cd) throws IOError{
        CDAudio findCD;
        String style;
        String title;
        System.out.println("Recherche d'un CD par son artiste et son titre d'album");
        style = lireString("style");
        title = lireString("titre");
        findCD = cd.searchCDArtistTitle(style,title);
        if(findCD != null){
            System.out.println("le CD est trouvé : " + findCD);
        }
        else{
            System.out.println("Aucun CD trouvé via les informations fournies");
        }
    }

    private static void afficherCDTheque(CDTheque cd){
        System.out.println("***** Bienvenue dans votre CDTheque *****\n");
        System.out.println("---------------- DEBUT ----------------");
        for(CDAudio cd1 : cd){
            System.out.println(" - " + cd);
        }
        System.out.println("----------------- FIN -----------------");
    }



}
