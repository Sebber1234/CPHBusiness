import java.util.ArrayList;
import java.util.Scanner;

public class UI {

    Data data = new Data();
    int userInput;

    public int getUserInput(String msg) {
        System.out.println(msg);
        Scanner scan = new Scanner(System.in);
        return scan.nextInt();
    }

    public void mainInterface() {


        System.out.println("*********************MainMenu**************************");
        System.out.println("========================================================");
        System.out.println("You have these following options:");
        System.out.println("1. MovieMenu:");
        System.out.println("2. SeriesMenu:");
        System.out.println("3. Your favorites:");
        System.out.println("4. Exit:");

        userInput = getUserInput("Userinput: ");

        switch (userInput) {
            case 1 -> movieMenu();
            //case 2 -> seriesMenu();
            case 3 -> favorites();
            case 4 -> System.exit(0);
            default -> System.out.println("Not a valid option");

        }


    }


    public void movieMenu() {
        System.out.println("*********************MovieMenu**************************");
        System.out.println("========================================================");
        System.out.println("You have these following options:");
        System.out.println("1. View categories");
        System.out.println("2. View all recently watched movies");
        System.out.println("3. View all saved movies");
        System.out.println("4. Back to MainMenu");
        userInput = getUserInput("User input: ");

        switch (userInput) {
            case 1 -> categoryMenu();
            //case 2 -> //En klasse skal have en funktion, der ordner det her.
           // case 3 -> //En klasse skal have en funktion, der ordner det her.
            case 4 -> mainInterface();
            default -> System.out.println("Not a valid option");
        }

    }



    public void categoryMenu() {
        System.out.println("*********************CategoryMenu**************************");
        System.out.println("========================================================");
        System.out.println("You have these following options:");
        System.out.println("1.View all Drama movies ");
        System.out.println("2.View all Thriller movies");
        System.out.println("3.View all Family movies");
        System.out.println("4.View all Crime movies");
        System.out.println("5.View all Adventure movies");
        System.out.println("6.View all Mystery movies");
        System.out.println("7.View all Sci-fi movies");
        System.out.println("8.View all War movies");
        System.out.println("9.View all Fantasy movies");
        System.out.println("10.View all Romance movies");
        System.out.println("11.View all Comedy movies");
        System.out.println("12.View all Musical movies");
        System.out.println("13. View all Action movies");
        System.out.println("14.Back to MovieMenu");

        userInput = getUserInput("Userinput: ");

        switch (userInput){
            case 1 -> movies(data.getMoviesInCategory("Drama"));
            case 2 -> movies(data.getMoviesInCategory("Thriller"));
            case 3 -> movies(data.getMoviesInCategory("Family"));
            case 4 -> movies(data.getMoviesInCategory("Crime"));
            case 5 -> movies(data.getMoviesInCategory("Adventure"));
            case 6 -> movies(data.getMoviesInCategory("Mystery"));
            case 7 -> movies(data.getMoviesInCategory("Sci-fi"));
            case 8 -> movies(data.getMoviesInCategory("War"));
            case 9 -> movies(data.getMoviesInCategory("Fantasy"));
            case 10 ->movies(data.getMoviesInCategory("Romance"));
            case 11-> movies(data.getMoviesInCategory("Comedy"));
            case 12-> movies(data.getMoviesInCategory("Musical"));
            case 13-> movies(data.getMoviesInCategory("Action"));
            case 14-> movieMenu();


        }

    }
        public void movies(ArrayList<Movie> movies){
        for(int i = 0; i < movies.size(); i++){
            System.out.println(movies.get(i).getTitle());

        }
        favorites();

        }
    public void favorites(){

        System.out.println("*********************MovieMenu**************************");
        System.out.println("========================================================");
        System.out.println("You have these following options:");
        System.out.println("1. play movie");
        System.out.println("4. Back to MainMenu");
        userInput = getUserInput("User input: ");


    }
    }


