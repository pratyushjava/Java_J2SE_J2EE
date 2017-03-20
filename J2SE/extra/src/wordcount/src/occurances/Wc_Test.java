package occurances;

import java.util.*;

public class Wc_Test {

	/**
	 * @param args
	 */

	public static void main(String[] args) {
		HashSet<String> hs= new HashSet<>();
		
		Scanner sc= new Scanner(System.in);
		//System.out.println("enter no fo words in a line");
		//int s=sc.nextInt();
		
		
		
		System.out.println("Enter a line of statement");
		//boolean exit=true;
		String w=null;
		do
		{
			w=sc.next();
		//WordCount wc=new WordCount(w);
		hs.add(w);
		
		}while(!w.equals("exit"));
		/*Iterator<String> itr=hs.iterator();
		
		if(itr.hasNext())
		{
			System.out.println(itr.next());
		}*/
		
		System.out.println("using hs"+hs);
		
		ArrayList<String> al=new ArrayList<String>(hs);
		
		//System.out.println("using al"+al);
		
		TreeSet<String> ts= new TreeSet<>(hs);
		
		Iterator<String> itr=ts.iterator();
		
		Iterator<String> itr1=al.iterator();
		
		String s=null;
		String s1=null;
		
		while(itr.hasNext())
		{
			s=itr.next();
			while(itr1.hasNext())
			{
				s1=itr1.next();
				System.out.println("ts  "+s+"al  "+s1);
			}
		}
	}
		

	}


