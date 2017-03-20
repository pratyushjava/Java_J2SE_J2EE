package calc_impl;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.ejb.Stateless;
import javax.ejb.*;

import calc.Calculator;

@Stateful(mappedName="my_calc")
public class CalculatorBean implements Calculator{
	private double result;
	public CalculatorBean() {
		System.out.println("in bean constr");
	}

	@Override
	public double add(double d1, double d2) {
		// TODO Auto-generated method stub
		result +=(d1+d2);
		return result;
	}
	
	@PostConstruct
	public void myInit()
	{
		System.out.println("in post constr");
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
