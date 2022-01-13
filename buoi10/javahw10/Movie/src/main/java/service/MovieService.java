package service;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import model.Movie;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.lang.reflect.Type;
import java.util.*;

public class MovieService {

    public ArrayList<Movie> getAllMovie(){
        ArrayList<Movie> movies = new ArrayList<>();

        Gson gson = new Gson();
        try {
            FileReader reader = new FileReader("movie.json");
            Type type = new TypeToken<ArrayList<Movie>>(){}.getType();
            movies = gson.fromJson(reader,type);
        } catch (FileNotFoundException e) {
            System.out.println("Không tìm thấy file");
        }
        return movies;
    }

    public void show(ArrayList<Movie> movies){
        for(Movie p:movies){
            System.out.println(p);
        }
    }

    public void sortByYear(ArrayList<Movie> movies){
        Collections.sort(movies, new Comparator<Movie>() {
            @Override
            public int compare(Movie o1, Movie o2) {
                return o1.getYear() - o2.getYear()>0?1:-1;
            }
        });
    }

    public void sortByTitle(ArrayList<Movie> movies){
        Collections.sort(movies, new Comparator<Movie>() {
            @Override
            public int compare(Movie o1, Movie o2) {
                return o1.getTitle().compareTo(o2.getTitle());
            }
        });
    }

    public void searchByTitle(ArrayList<Movie> movies, String searchTitle){
        for(Movie p: movies){
            if(p.getTitle().toLowerCase().contains(searchTitle.toLowerCase())){
                System.out.println(p);
            }
        }
    }

    public void searchByCategory(ArrayList<Movie> movies, String searchCategory){
        for(Movie p: movies){
            if(Arrays.toString(p.getCategory()).toLowerCase().contains(searchCategory.toLowerCase())){
                System.out.println(p);
            }
        }
    }

    public void topView(ArrayList<Movie> movies){
        Collections.sort(movies, new Comparator<Movie>() {
            @Override
            public int compare(Movie o1, Movie o2) {
                return o2.getView() - o1.getView()>0?1:-1;
            }
        });
        for(int i=0; i<3; i++){
            System.out.println(movies.get(i));
        }
    }



}
