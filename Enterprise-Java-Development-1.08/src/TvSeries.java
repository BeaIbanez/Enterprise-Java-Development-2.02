public class TvSeries extends Video{

    private int episodes;
    private int seasons;


    public TvSeries(String name, String genre, String lasts, int episodes, int seasons) {
        super(name, genre, lasts);
        this.episodes=episodes;
        this.seasons=seasons;
    }

    public int getEpisodes() {
        return episodes;
    }

    public void setEpisodes(int episodes) {
        this.episodes = episodes;
    }

    public int getSeasons() {
        return seasons;
    }

    public void setSeasons(int seasons) {
        this.seasons = seasons;
    }

    @Override
    public String toString() {
        return "TvSeries Description"+"\n" +
                "Nombre: " + super.getName() + "\n" +
                "Genero:" + super.getGenre() +"\n" +
                "Duracion: " + super.getLasts() + " \n"+
                "Episodios:" + episodes +" \n"+
                "Temporadas:" + seasons ;
    }
}
