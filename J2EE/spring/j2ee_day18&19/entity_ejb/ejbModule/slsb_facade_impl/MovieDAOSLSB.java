package slsb_facade_impl;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import entities.Dac1Book;
import entities.MoviePOJO;

import slsb_facade.MovieDAO;

/**
 * Session Bean implementation class MovieDAOSLSB
 */
@Stateless(mappedName = "movie_dao")

public class MovieDAOSLSB implements MovieDAO{
	
	@PersistenceContext(unitName="entity_ejb")
	private EntityManager mgr;
	

	@Override
	public List<MoviePOJO> listAllMovies() {
		// TODO Auto-generated method stub
		System.out.println("mgr="+mgr);
		List<MoviePOJO> l1=mgr.createQuery("select m from MoviePOJO m").getResultList();
		System.out.println("movie list l1="+l1+" size "+l1.size());
		return l1;
		//SELECT e FROM MyEmp e
	}

	@Override
	public String test(String s) {
		return s.toUpperCase();
		
	}

	@Override
	public List<Dac1Book> getAllBooks() {
		// TODO Auto-generated method stub
		List<Dac1Book> l2=mgr.createQuery("select b from Dac1Book b").getResultList();
		System.out.println("bk list "+l2+" size "+l2.size());
		return l2;
	}
	
	
   

}
