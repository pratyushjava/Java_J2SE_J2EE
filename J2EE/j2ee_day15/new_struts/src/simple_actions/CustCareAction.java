package simple_actions;

import java.util.*;

import javax.servlet.ServletContext;

import org.apache.struts2.util.ServletContextAware;

import model.CustomerComplaint;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class CustCareAction extends ActionSupport implements ModelDriven<CustomerComplaint> {
	private CustomerComplaint cust = new CustomerComplaint();

	public CustCareAction() {
		
		System.out.println("in cust care action constr");
		
	}
	

	

	@Override
	public CustomerComplaint getModel() {

		return cust;
	}

		
	public String showForm() throws Exception {
		// disp cust details
		System.out.println("show cust "+cust);
		return SUCCESS;
	}
	
	public String addComplaint() throws Exception {
		//add cust dtls
		System.out.println("add cust "+cust);
		return SUCCESS;
	}


	public CustomerComplaint getCust() {
		return cust;
	}
	
	
	
	
	

}
