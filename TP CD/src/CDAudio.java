public class CDAudio {

    private long isbn;
    private String artist;
    private String titre;
    private String style;
    private int nombrePistes;

    public CDAudio(long isbn, String artist, String titre, String style, int nombrePiste){
        this.isbn = isbn;
        this.artist = artist;
        this.titre = titre;
        this.style = style;
        this.nombrePistes = nombrePiste;
    }

    //getter

    public long getIsbn() {
        return isbn;
    }

    public String getArtist() {
        return artist;
    }

    public String getTitre() {
        return titre;
    }


    public String getStyle() {
        return style;
    }

    public int getNombrePistes() {
        return nombrePistes;
    }

    // Autres Methode

    @Override
    public String toString() {
        String str = "CD[";
        str += isbn + ",";
        str += artist + ",";
        str += titre + ",";
        str += style + ",";
        str += nombrePistes + "]";
        return str;
    }

}
