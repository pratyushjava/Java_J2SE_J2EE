package aop_demo.domain;

import org.springframework.stereotype.Component;

@Component
public class Customer implements CustomerIntf{

	@Override
	public void addCustomer() {
		System.out.println("in add Customer");
		
	}

	@Override
	public String addCustomerRetValue() {
		System.out.println("in add cust ret val");
		return "abc";
	}

	@Override
	public void addCustomerWithExc() throws Exception {
		System.out.println("in add cust with exc");
		throw new Exception("Some Token Err");
		
	}

	@Override
	public void addCustomerAround(String name) {
		System.out.println("in add cust around --"+name);
		
	}
	

}
