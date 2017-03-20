package date;

import java.util.GregorianCalendar;

public class DateDiff {

	/**
	 * @param args
	 */
	static GregorianCalendar gc;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		gc = new GregorianCalendar(1990, 03,28);
		
		System.out.println(gc.YEAR);
		System.out.printf("%tY",gc);
		
		gregorian= new DateDiff();
		
		System.out.println(gc);

	}

}
