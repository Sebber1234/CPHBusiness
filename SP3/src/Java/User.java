import java.util.ArrayList;

public class User {

    private String userName;
    private String password;
    private ArrayList<Media> watchedMedia = null;
    private ArrayList<Media> savedMedia = null;
    public User(String userName, String password){
        this.userName = userName;
        this.password = password;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

    public void setWatchedMedia(ArrayList <Media> watchedmedia){
        this.watchedMedia = watchedmedia;
    }
    public ArrayList<Media> getWatchedMedia(){
        return watchedMedia;
    }
   public void addWatchedMedia(Media media){
        if(!watchedMedia.contains(media)){
            watchedMedia.add(media);
        }


   }
}
