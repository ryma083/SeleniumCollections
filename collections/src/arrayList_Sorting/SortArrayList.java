package arrayList_Sorting;

import java.util.*;

public class SortArrayList {

	public static void main(String[] args) {
	 // example1: sorting an arraylist type String 
		ArrayList<String> listofcountries = new ArrayList<String>();
		   listofcountries.add("India");
		   listofcountries.add("US");
		   listofcountries.add("China");
		   listofcountries.add("Denmark");

		   /*Unsorted List*/
		   System.out.println("Before Sorting string:");
		   for(String counter: listofcountries){
				System.out.println(counter);
			}

		   /* Sort statement*/
          Collections.sort(listofcountries);// this is where we do the assorting 
		   /* Sorted List*/
		   System.out.println("After Sorting string:");
		   for(String counter: listofcountries){
				System.out.println(counter);

		   }
	//example2: sorting an arraylist type integer 
		 
		   ArrayList<Integer> arr = new ArrayList<Integer> (Arrays.asList(2,8,5));
		    
		    //Before assorting :
		   System.out.println("Befor assortin int :");
		   for(int i : arr) {
			   System.out.println(i);
			    }
		    
		   Collections.sort(arr);// this is how we do assorting integer same as for the String
		    System.out.println("After assorting int: ");
		     for(int y : arr) {
		    	 System.out.println(y);
		     }
		   
	}

}
