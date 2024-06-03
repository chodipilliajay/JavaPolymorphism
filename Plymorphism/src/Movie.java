public class Movie {

    private String title;

    public Movie(String title) {
        this.title = title;
    }

    public void watchMovie(){
        String instanceType = this.getClass().getSimpleName();
        System.out.println(title+" is a "+instanceType+" film.");
    }

    public static Movie getMovie(String type, String title){

        return switch (type.toUpperCase().charAt(0)) {
            case 'A' -> new Adventure(title);
            case 'C' -> new Comedy(title);
            case 'S' -> new ScienceFriction(title);
            default -> new Movie(title);
        };
    }
}

class Adventure extends Movie{

    public Adventure(String title) {
        super(title);
    }
    @Override
    public void watchMovie(){
        super.watchMovie();
        System.out.printf("..%s%n".repeat(3),
                "Pleasant Scene", "Scary Music",
                "Something Bad Happens.");
    }

    public void watchAdventure(){
        System.out.println("Watching an Adventure.");
    }
}

class Comedy extends Movie{

    public Comedy(String title) {
        super(title);
    }
    @Override
    public void watchMovie(){
        super.watchMovie();
        System.out.printf("..%s%n".repeat(3),
                "Something funny happens", "Something even funnier happens",
                "Happy Ending.");
    }
    public void watchComedy(){
        System.out.println("Watching an Comedy.");
    }
}

class ScienceFriction extends Movie{

    public ScienceFriction(String title) {
        super(title);
    }
    @Override
    public void watchMovie(){
        super.watchMovie();
        System.out.printf("..%s%n".repeat(3),
                "Bad Aliens do bad stuff", "Space guys chase Aliens",
                "Planet Blows up.");
    }
    public void watchScience(){
        System.out.println("Watching an sci-fi movie.");
    }
}
