package Model;

import java.util.ArrayList;
import java.util.List;

public class Movie {

    String directorName = "";
    String genre = "";
    String language = "";
    String title = "";


    List<Movie> movieLists = new ArrayList<>();


    public List<Movie> getMovieLists() {
        return movieLists;
    }

    public Movie() {
    }

    public Movie(String directorName, String genre, String language, String title) {
        this.directorName = directorName;
        this.genre = genre;
        this.language = language;
        this.title = title;
    }


    public String getDirectorName() {
        return directorName;
    }

    public void setDirectorName(String directorName) {
        this.directorName = directorName;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return
                "DirectorName='" + directorName + '\'' +
                        ", Genre='" + genre + '\'' +
                        ", Language='" + language + '\'' +
                        ", Title='" + title + "\n";
    }
}
