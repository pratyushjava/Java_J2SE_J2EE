package occurances;

import java.util.*;
public class sample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		String input = "1 fish 2 fish red fish blue fish";
	     Scanner s = new Scanner(input);
	     s.findInLine("(\\d+) fish (\\d+) fish (\\w+) fish (\\w+)");
	     
	     System.out.println(s.match());
	     /*String result = s.match();
	     for (int i=1; i<=result.groupCount(); i++)
	         System.out.println(result.group(i));*/
	     s.close();

	}

}
