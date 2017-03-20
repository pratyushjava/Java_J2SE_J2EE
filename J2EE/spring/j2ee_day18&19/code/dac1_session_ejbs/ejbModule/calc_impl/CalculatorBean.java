package calc_impl;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.ejb.Remove;
import javax.ejb.Stateful;
import javax.ejb.Stateless;

import calc.Calculator;

@Stateful(mappedName="dac1_calc")
public class CalculatorBean implements Calculator{
	private double result;//adding state in EJB reflecting 
	//conversational state of clnt ---- to prove stateless nature.
	
	public CalculatorBean() {
		System.out.println("in bean constr");
	}

	@PostConstruct
	public void myInit()
	{
		//here onwards  dependecies will available to EJB
		//eg DataSource----cn pool
		System.out.println("in post Construct ");
	}
	@Override
	public double add(double d1, double d2) {
		// TODO Auto-generated method stub
		result += (d1+d2);
		return result;
	}
	@PreDestroy
	public void myDestroy()
	{
		System.out.println("in pre destroy");
	}
	
	@Remove
	@Override
	public void logout() {
		System.out.println("in logout ");
		
	}
	
	
	

}
