package spel.model.anno2;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("customerBean")
public class Customer {

	@Value("#{dataBean2.getName()}")
	private String name;
	
	@Value("#{addressBean}")
	private Address address;

	@Value("#{addressBean.country}")
	private String country;

	//Hard - coding cust name 
	//@Value("#{addressBean.getFullAddress('abc')}")
	//using rt expr for resolving cust name
	@Value("#{addressBean.getFullAddress(customerBean.name)}")
	private String fullAddress;

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getFullAddress() {
		return fullAddress;
	}

	public void setFullAddress(String fullAddress) {
		this.fullAddress = fullAddress;
	}
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Hello "+name+",\n  Full Address of " + fullAddress;
	}

}