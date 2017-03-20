package calc;

import javax.ejb.Remote;

@Remote
public interface CalcSLSBRemote {
	double add(double d1,double d2);
	void logout();

}
