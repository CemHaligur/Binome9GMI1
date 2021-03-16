import java.util.*;

public class CDTheque implements Iterable<CDAudio>{

    private List<CDAudio> catalogue;
    private Map<Long,CDAudio> indexISBN;
    private Map<String,CDAudio> indexArtisteTitre;
    private Map<String,CDAudio> indexStyleTitre;

    public CDTheque(){
        catalogue = new ArrayList<CDAudio>();
        indexISBN = new HashMap<Long,CDAudio>();
        indexArtisteTitre = new HashMap<String,CDAudio>();
        indexStyleTitre = new HashMap<String,CDAudio>();

    }

    // Getter

    public List<CDAudio> getCatalogue() {
        return catalogue;
    }

    public Map<Long, CDAudio> getIndexISBN() {
        return indexISBN;
    }

    public Map<String, CDAudio> getIndexArtisteTitre() {
        return indexArtisteTitre;
    }

    public Map<String, CDAudio> getIndexStyleTitre() {
        return indexStyleTitre;
    }

    // Autres Methodes

    public boolean addCD(CDAudio cd){
        boolean valider;

        if(indexISBN.containsKey(cd.getIsbn()) || indexArtisteTitre.containsKey(keyAT(cd)) ||
            indexStyleTitre.containsKey(keyST(cd))){
            return false;
        }

        valider = catalogue.add(cd);

        if(valider){
            indexISBN.put(cd.getIsbn(),cd);
            indexArtisteTitre.put(keyAT(cd),cd);
            indexStyleTitre.put(keyST(cd),cd);
        }

        return valider;

    }

    public boolean addCD(long isbn, String artist, String title, String style, int nbTracks){
        CDAudio cd = new CDAudio(isbn,artist,title,style,nbTracks);
        return this.addCD(cd);
    }

    public boolean removeCD(CDAudio cd){
        boolean valider;
        valider = catalogue.remove(cd);
        if(valider){
            indexISBN.remove(cd.getIsbn());
            indexStyleTitre.remove(keyST(cd));
            indexArtisteTitre.remove(keyAT(cd));
        }
        return valider;
    }

    public boolean removeCD(long isbn){
        return removeCD(isbn, indexISBN);
    }

    public boolean removeCDByAT(String artist, String title){
        return removeCD(makeKey(artist,title), indexArtisteTitre);
    }

    public boolean removeCDByST(String style, String title){
        return removeCD(makeKey(style,title), indexStyleTitre);
    }

    private <K> boolean removeCD(K clef, Map<K,CDAudio> index){
        CDAudio cdremove;
        if(!index.containsKey(clef)){
            return false;
        }
        cdremove = index.get(clef);
        return removeCD(cdremove);
    }

    public CDAudio searchCD(long isbn){
        return indexISBN.get(isbn);
    }

    public CDAudio searchCDArtistTitle(String artist, String title){
        return indexArtisteTitre.get(makeKey(artist,title));
    }

    public CDAudio searchCDStyleTitle(String style, String title){
        return indexArtisteTitre.get(makeKey(style,title));
    }

    private static String makeKey(String s1, String s2) {
        String Resultat;

        s1 = s1.replaceAll("[\\s\\p{Punct}]","");
        s2 = s2.replaceAll("[\\s\\p{Punct}]","");
        s1 = s1.toUpperCase();
        s2 = s2.toUpperCase();

        Resultat = s1 + "#" + s2;
        return Resultat;
    }

    private static String keyAT(CDAudio cd) {
        return makeKey(cd.getArtist(),cd.getTitle());
    }

    private static String keyST(CDAudio cd) {
        return makeKey(cd.getStyle(),cd.getTitle());
    }

    public Iterator<CDAudio> iterator() {
        return catalogue.iterator();
    }

    public ListIterator<CDAudio> listIterator() {
        return catalogue.listIterator();
    }

    public String toString() {
        String res = indexToString(indexISBN, "°Index ISBN°\n");
        return res;
    }

    private <K> String indexToString(Map<K,CDAudio> index, String message) {
        String res = message + "\n";
        for (K key : index.keySet()) {
            res += key + " : " + index.get(key) + "\n";
        }
        return res;
    }


}
