public class NextMain {

    public static void main(String[] args) {
        //child reference  //class casting
        Adventure movie = (Adventure) Movie.getMovie("Adventure", "Fast and Furious");
        movie.watchMovie();

        //object reference
        Object comedy = Movie.getMovie("C", "Airplanes");
        Comedy comedyMovie = (Comedy) comedy;
        comedyMovie.watchComedy();
        comedyMovie.watchMovie();

        //var reference
        var airplane  = Movie.getMovie("C", "Airplane");
        //local var type inference
        //by using the type, we're telling
        airplane.watchMovie();

        var plane = new Comedy("Airplane");
        plane.watchMovie();

        //Runtime type
        Object unknownObject = Movie.getMovie("A", "Fast and Furious");
        if (unknownObject.getClass().getSimpleName() == "Comedy") {
            Comedy c = (Comedy) unknownObject;  //without casting to comedy class we couldn't execute that method.
            c.watchComedy();
        } else if (unknownObject instanceof Adventure) {
            ((Adventure) unknownObject).watchAdventure();
        } else if (unknownObject instanceof ScienceFriction syfy) { //this is called pattern matching support for
            // the instance of the operator
            syfy.watchScience();  //if instanceof type is true, then syfy declared as science var.
        }
    }
}
