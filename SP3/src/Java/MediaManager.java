import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class MediaManager {
    private static final File moviesFile = new File("Data/Movies.txt");

    private static final File seriesFile = new File("Data/Series.txt");
    private static MediaManager manager = null;

    public static MediaManager getInstance() {
        if (manager == null)
            manager = new MediaManager();
        return manager;
    }

    private List<Media> mediaList = Collections.emptyList();

    public void loadMedia() {

        List<Movie> movies;
        try (BufferedReader reader = new BufferedReader(new FileReader(moviesFile, StandardCharsets.UTF_8))) {
              movies = reader.lines().map(line -> {
                  /*
                   * 0: navn, fx "The Godfather"
                   * 1: årstal, fx "1972"
                   * 2: genre, fx "Crime, Drama"
                   * 3: rating
                   */
                  String[] values = line.split(";");

                  String[] genreValues = values[2].split(",");
                  ArrayList<String> genres = new ArrayList<>();
                  for (String genreValue : genreValues) {
                      genres.add(genreValue.trim());
                  }

                  return new Movie(values[0],genres , Float.parseFloat(values[3].trim()), Integer.parseInt(values[1].trim()), 1);
            }).collect(Collectors.toList());
        }
        catch (IOException e) {
            movies = Collections.emptyList();
        }


        List<Series> series;
        try (BufferedReader reader = new BufferedReader(new FileReader(seriesFile, StandardCharsets.UTF_8))) {
            series = reader.lines().map(line -> {
                /*Twin Peaks; 1990-1991; Crime, Drama, Mystery; 8,8; 1-8, 2-22;
                 * 0: navn, fx "Twin Peaks"
                 * 1: årstal, fx "1990-1991"
                 * 2: genre, fx "Crime, Drama, Mystery"
                 * 3: rating
                 * 4: sæsoner, fx "1-8, 2-22"
                 */
                String[] values = line.split(";");

                String[] yearValues = values[2].split(",");
                int startYear = Integer.parseInt(yearValues[0]);
                int endYear = Integer.parseInt(yearValues[1]);

                String[] genreValues = values[2].split(",");
                ArrayList<String> genres = new ArrayList<>();
                for (String genreValue : genreValues) {
                    genres.add(genreValue.trim());
                }

                String[] seasonValues = values[4].split(",");
                ArrayList<Integer> seasons = new ArrayList<>();
                for (String seasonValue : seasonValues) {
                    seasonValue = seasonValue.trim().substring(seasonValue.indexOf('-') + 1);
                    seasons.add(Integer.parseInt(seasonValue));
                }

                return new Series(values[0], genres , Float.parseFloat(values[3].trim()), startYear, endYear, seasons, 1);
            }).collect(Collectors.toList());
        }
        catch (IOException e) {
            series = Collections.emptyList();
        }

        mediaList = new ArrayList<>(movies.size() + series.size());
        mediaList.addAll(movies);
        mediaList.addAll(series);
    }

    public Media getMedia(String title) {
        for (Media media : mediaList) {
            if (media.getTitle().equals(title))
                return media;
        }
        return null;
    }
    

}



