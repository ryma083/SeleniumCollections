package iterable_Collection_List;

import java.util.ArrayList;


public class ArryListBasics {

	public static void main(String[] args) {
		
		int a[]= new int [3]; //static array -->size is fixed
		 
		//dynamic Array --->arrayList :
		//1- can contain duplicate values
		//2- maintains insertion order
		//3- not Synchronized
		//4- allows random access to fetch the element because it stores the values on the basics of indexes
		
		
		ArrayList<Integer> alist = new ArrayList<Integer> ();
		alist.add(5);
		alist.add(7);
		alist.add(2);
		
		System.out.println("the size is "+alist.size());
		alist.set(0, 55);
		alist.add(1, 22);
	    System.out.println("the first element is :" +alist.get(0));
	   System.out.println(alist.contains(7)); 
	 
	    System.out.println("Displaying the Arraylist :");
		for (int i : alist) {
			System.out.println(i);
		}
		
		
	}

}
