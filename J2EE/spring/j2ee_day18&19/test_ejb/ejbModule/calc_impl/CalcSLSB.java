package calc_impl;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.ejb.Remove;
import javax.ejb.Stateless;

import calc.CalcSLSBRemote;

/**
 * Session Bean implementation class CalcSLSB
 */
@Stateless(mappedName = "my_calc")
public class CalcSLSB implements CalcSLSBRemote {
	private double result;

    /**
     * Default constructor. 
     */
    public CalcSLSB() {
        // TODO Auto-generated constructor stub
    }
    @PostConstruct
    public void myConstruct()
    {
    	System.out.println("in postCon");
    }

    @PreDestroy
    public void myDestroy()
    {
    	System.out.println("in preDestroy");
    }

	@Override
	public double add(double d1, double d2) {
		// TODO Auto-generated method stub
		result += (d1+d2);
		return result;
	}

	@Remove
	@Override
	public void logout() {
		System.out.println("in logout");
		
	}
    

}
