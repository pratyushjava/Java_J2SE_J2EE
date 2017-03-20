package custexception;

public class EmailExce extends Exception {

	public EmailExce(String msg) {
		super(msg);
		System.out.println(msg);
		
	}
}


