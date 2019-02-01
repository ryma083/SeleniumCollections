package iterable_Collection_List;

import java.util.*;

public class Iterate_loop_ArrayList {

	public static void main(String[] args) {

	      ArrayList<Integer> arrlist = new ArrayList<Integer>();
	      arrlist.add(14);
	      arrlist.add(7);
	      arrlist.add(39);
	      arrlist.add(40);

	      /* For Loop for iterating ArrayList */
	      System.out.println("For Loop");
	      for (int i = 0;i < arrlist.size();i++) { 		      
	          System.out.println(arrlist.get(i)); 		
	      }   		

	      /* Advanced For Loop*/ 		
	      System.out.println("Advanced For Loop"); 		
	      for (Integer num : arrlist) { 		      
	           System.out.println(num); 		
	      }

	      /* While Loop for iterating ArrayList*/ 		
	      System.out.println("While Loop"); 		
	      	int count = 0;
	      	while (arrlist.size()>count) {
	      		System.out.println(arrlist.get(count));
	         count++;
	      }

	      /*Looping Array List using Iterator*/
	      System.out.println("Iterator");
	      Iterator it =  arrlist.iterator();
	      
	      while (it.hasNext()) {
	    	  System.out.println(it.next());
	      }
	     
	     //how to iterate arrayList elements using Enumeration Interface
	      //create an ArrayList object
	      ArrayList<String> arrayList = new ArrayList<String>();
	 
	      //Add elements to ArrayList
	      arrayList.add("C");
	      arrayList.add("C++");
	      arrayList.add("Java");
	      arrayList.add("DotNet");
	      arrayList.add("Perl");
	 
	      // Get the Enumeration object
	      Enumeration<String> e = Collections.enumeration(arrayList);
	 
	      // Enumerate through the ArrayList elements
	      System.out.println("ArrayList elements: ");
	      while(e.hasMoreElements())
	      System.out.println(e.nextElement());
	      
	      
	      }
	   }

