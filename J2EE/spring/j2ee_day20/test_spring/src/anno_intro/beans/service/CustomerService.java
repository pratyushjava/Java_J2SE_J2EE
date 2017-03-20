package anno_intro.beans.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import anno_intro.beans.dao.CustomerDAO;


@Service
public class CustomerService 
{
	@Autowired
	CustomerDAO customerDAO123;

	@Override
	public String toString() {
		return "CustomerService [customerDAO=" + customerDAO123 + "]";
	}
		
}
