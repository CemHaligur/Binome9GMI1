public class CDAudio {

    private long isbn;
    private String artist;
    private String title;
    private String style;
    private int nbTracks;

    public CDAudio(long isbn, String artist, String title, String style, int nbTracks){
        this.isbn = isbn;
        this.artist = artist;
        this.title = title;
        this.style = style;
        this.nbTracks = nbTracks;
    }

    //getter

    public long getIsbn() {
        return isbn;
    }

    public String getArtist() {
        return artist;
    }

    public String getTitle() {
        return title;
    }


    public String getStyle() {
        return style;
    }

    public int getNumberTracks() {
        return nbTracks;
    }

    // Autres Methode

    @Override
    public String toString() {
        String str = "CD[";
        str += isbn + ",";
        str += artist + ",";
        str += title + ",";
        str += style + ",";
        str += nbTracks + "]";
        return str;
    }

}