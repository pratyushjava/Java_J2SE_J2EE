package sess_ent_impl;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import rev_ent.Dac2Book;
import sess_ent.BookDAO;

@Stateless(mappedName="dac2_sess_ent")
public class BookDAOImplSLSB implements BookDAO {
	@PersistenceContext(unitName="dac2_sess_entity")
	private EntityManager mgr;
	@Override
	public List<Dac2Book> getAllBooks() {
		// TODO Auto-generated method stub
		return mgr.createQuery("select b from Dac2Book b").getResultList();
	}

}
