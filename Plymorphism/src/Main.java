import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//        Movie theMovie = Movie.getMovie("Adventure", "Fast and Furious");
//        theMovie.watchMovie();
//
//        Movie sciMovie = Movie.getMovie("s", "Star Wars");
//        sciMovie.watchMovie();

        Scanner scanner = new Scanner(System.in);
        Movie theMovie = Movie.getMovie(scanner.nextLine(), scanner.nextLine());
        theMovie.watchMovie();

        while (true) {
            System.out.print("Enter Type (A for Adventure C for Comedy"+
                    "S for ScienceFriction, or Q for quit: ");
            String type = scanner.nextLine();
            if ("Qq".contains(type)){
                break;
            }
            System.out.print("Enter Movie title: ");
            String title = scanner.nextLine();

            Movie movie = Movie.getMovie(type, title);
            movie.watchMovie();
        }
        //this is polymorphism in action.
    }
}