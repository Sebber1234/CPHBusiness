import java.util.ArrayList;

public abstract class Media {
    private static int ID;
    private float rating;
    private ArrayList<String> genres;
    private String title;
    Media(String title, ArrayList genres, float rating, int ID){
        this.ID = ID;
        this.title = title;
        this.genres = genres;
        this.rating = rating;

    }
    public String getTitle(){
        return title;
    }

    public ArrayList getGenres(){
        return genres;
    }
    public int getID(){
        return ID;
    }
    public float getRating(){
        return rating;
    }


    static void categories(){

    }


    public abstract void play(String msg);
}
