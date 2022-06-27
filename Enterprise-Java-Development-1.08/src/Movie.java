public class Movie extends Video {

    int year;


    public Movie(String name, String genre, String lasts, int year) {
        super(name, genre, lasts);
        this.year=year;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }


    public void playMovie(Movie mov1){
        System.out.println("Reproduciendo la pelicula...");
    }

    @Override
    public String toString() {
        return "Pelicula: \n" +
                 "Nombre: " + super.getName() + "\n" +
                "Genero:" + super.getGenre() +"\n" +
                "Duracion: " + super.getLasts() + " \n"+
                "Año:" + year + "\n";

    }


}
