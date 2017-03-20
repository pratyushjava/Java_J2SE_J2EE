package cust_exc;

public class BrowserNotSupportedException extends Exception {
	public BrowserNotSupportedException(String msg) {
		super(msg);
	}
}
