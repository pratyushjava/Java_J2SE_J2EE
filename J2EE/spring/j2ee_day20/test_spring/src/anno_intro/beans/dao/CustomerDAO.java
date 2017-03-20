package anno_intro.beans.dao;

import org.springframework.stereotype.Repository;

//will be actually replaced by JDBC based or ORM based DAO 
@Repository
public class CustomerDAO 
{
	@Override
	public String toString() {
		return "Hello , This is CustomerDAO1234";
	}	
}
