package sess_ent;

import java.util.List;

import javax.ejb.Remote;

import rev_ent.Dac2Book;

@Remote
public interface BookDAO {
	List<Dac2Book> getAllBooks();
}
