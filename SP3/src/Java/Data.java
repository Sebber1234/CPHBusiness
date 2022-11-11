import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Data {
    public ArrayList<Movie> getMoviesInCategory(String category) {

        ArrayList<Movie> movies = new ArrayList<>();
        Scanner scan = null;
        File fr = new File("Data/Movies.txt");
        try {
            scan = new Scanner(fr);


        } catch (FileNotFoundException e) {
            e.printStackTrace();


        }

        if (scan != null) {
            while (scan.hasNextLine()) {
                String[] seperatedValues = scan.nextLine().split(";");
                String[] seperatedCategories = seperatedValues[2].split(",");
                for (int i = 0; i < seperatedCategories.length; i++) {
                    if (seperatedCategories[i].trim().equals(category)) {
                        ArrayList<String> categories = new ArrayList<>();
                        Collections.addAll(categories, seperatedCategories);
                        Movie movie = new Movie(seperatedValues[0],categories , Float.parseFloat(seperatedValues[3].trim()), Integer.parseInt(seperatedValues[1].trim()), 1);
                        movies.add(movie);

                    }
                }
            }
        }
        else{
            System.out.println("scan var null");
        }
        return movies;
    }


/*public ArrayList<Movies> setWatchedMovies(Movies m ){
        ArrayList<Movies> movies = new ArrayList<>();
    Writer writer = null;
    File fr = new File("Data/watchedMovies.txt");
    try{
        writer = new FileWriter(fr);
    }catch (FileNotFoundException e){
        e.printStackTrace();
    }

    }
}*/}
