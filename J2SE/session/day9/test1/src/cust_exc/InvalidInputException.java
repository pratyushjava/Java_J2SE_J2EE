package cust_exc;

public class InvalidInputException extends Exception {
	public InvalidInputException(String msg) {
		super("A/C Creation Failure :" +msg);
	}
}
