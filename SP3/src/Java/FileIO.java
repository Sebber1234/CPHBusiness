
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class FileIO {
    public ArrayList<String> readMoviesFile() {
        File file = new File("Data/Movies.txt");
        ArrayList<String> movies = new ArrayList<>();
        try {
            Scanner input = new Scanner(file);
            input.nextLine();
            while (input.hasNextLine()) ;
            movies.add(input.nextLine());
        } catch (FileNotFoundException e) {
            movies = null;
        }
        return movies;

    }

    public ArrayList<String> readSeriesFile() {
        File file = new File("Data/Series.txt");
        ArrayList<String> Series = new ArrayList<>();
        try {
            Scanner input = new Scanner(file);
            input.nextLine();
            while (input.hasNextLine()) ;
            Series.add(input.nextLine());

        } catch (FileNotFoundException e) {
            Series = null;
        }
        return Series;
    }

    public void writeUserFile(User u) {
        try {
            FileWriter writer = new FileWriter("Data/Users.txt");
            writer.write(u.getUserName() + ": " + u.getPassword() +":");
            writer.close();
        } catch (IOException e) {
            System.out.println(e);
        }

    }
    public String readUserFile(String username, String password){
        File file = new File("Data/Users.txt");
        ArrayList<String> users = new ArrayList<>();
        try {
            Scanner input = new Scanner(file);
            while (input.hasNextLine()) {
                users.add(input.nextLine());
            }
            for (String u : users) {
                String[] values = u.split(";");
                if (Objects.equals(values[0], username) && Objects.equals(values[1], password)) {
                    return u;
                }
            }
        } catch (FileNotFoundException e) {
            users = null;
        }
        return"";

    }

}
