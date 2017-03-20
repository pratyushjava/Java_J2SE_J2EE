package slsb_facade;

import java.util.List;

import javax.ejb.Remote;

import entities.Dac1Book;
import entities.MoviePOJO;

@Remote
public interface MovieDAO {
   List<MoviePOJO> listAllMovies();
   String test(String s);
   List<Dac1Book> getAllBooks();
}
