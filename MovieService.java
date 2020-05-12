package Service;

import Model.Movie;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MovieService {

    List<Movie> movies = new ArrayList<>();
    Scanner scanner;

    {
        try {
            scanner = new Scanner(new File("C:\\Users\\Nmtur\\IdeaProjects\\3Semester\\JonUndervisning\\CSV_Movie_Refined\\src\\main\\resources\\movie_metadata_500.csv"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void generateList(){
        while (scanner.hasNext()){
            String word = scanner.nextLine();
            String[]column = word.split(",");

            movies.add(new Movie(column[1], column[9], column[19], column[11]));
        }
        System.out.println("\n" + movies);
    }


}
