package lists;

import java.util.*;

public class IntegerList {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// create empty AL
		ArrayList<Integer> l1 = new ArrayList<Integer>();

		// populate same --- array data i/p
		int[] ints = { 10, 21, 2, 3, 10, 21, 3 };
		for (int i : ints)
			l1.add(i);// auto-boxing

		// display AL using toString,iterator,for-each
		System.out.println("l1 cont via toString" + l1);
		Iterator<Integer> itr = l1.iterator();// forward only itr.
		while (itr.hasNext())
			System.out.print(itr.next() + " ");
		System.out.println("\nl1 cont via for-each ");
		// for-each
		for (int i : l1)
			// auto-un-boxing
			System.out.print(i + "  ");
		// addAll
		ArrayList<Integer> l2 = new ArrayList<Integer>();
		l2.addAll(l1);
		System.out.println("\nl2 cont " + l2);
		ArrayList<Integer> l3 = new ArrayList<Integer>(l1);
		System.out.println("l3 cont " + l3);
		// display l1 elems in reverse order
		System.out.println("\n via ListItr ");
		ListIterator<Integer> litr = l1.listIterator(l1.size());
		while (litr.hasPrevious())
			System.out.print(litr.previous() + "  ");
		// remove elem via Iterator.l2
		itr = l2.iterator();
		// itr.remove();IllegalStateExc
		while (itr.hasNext()) {
			System.out.println("elem to be removed " + itr.next());
			itr.remove();
		}
		System.out.println("\n l2 cont after removal " + l2);
		itr = l1.iterator();
	//	l1.add(1234);//un-comment this to see ConcurrentModificationExc
		while (itr.hasNext())
			System.out.println(itr.next());
		System.out.println("\n l1 cont "+l1);
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter data to search n update");
		int data=sc.nextInt();
		/*
		 * search for a particular elem --- if exists double the val
		 */
		System.out.printf("l1 contains %d %b",data,l1.contains(data));
		int index=l1.indexOf(data);//auto-boxing
		if (index == -1)
			System.out.println("Elem not found");
		else
			System.out.println("Old val "+l1.set(index,l1.get(index)*2));
		System.out.println("updated l1"+l1);
		/*sort the elems of list as per Natural 
		 * ordering criteria */
		//java.util.Collections ---
		//public void sort(List<E> l1) --- un-sorted list
		//sort() uses N.O criteria of Elems & 
		//sorts the specified list
		//applicable for AL,LL,Vector
		Collections.sort(l1);
		System.out.println("sorted list "+l1);
		
	}

}
