public abstract class Video {

    private String name;
    private String genre;
    private String lasts;

    public Video(String name, String genre, String lasts) {
        this.name = name;
        this.genre = genre;
        this.lasts = lasts;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getLasts() {
        return lasts;
    }

    public void setLasts(String lasts) {
        this.lasts = lasts;
    }

    @Override
    public String toString() {
        return "Video{" +
                "name='" + name + '\'' +
                ", genre=" + genre +
                ", lasts='" + lasts + '\'' +
                '}';
    }
}
