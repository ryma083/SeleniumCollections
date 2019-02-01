package iterable_Collection_List;

import java.util.*;


public class InitializeArrayList {

	public static void main(String[] args) {
		
		// Method1 : Initialization using Arrays.asList 
		
	ArrayList<String> ali = new ArrayList<String>(Arrays.asList ("name","age","country"));
	 System.out.println(ali);
		
	 // Method2 : Initialization using Anonymous Inner Class method
	 
	 ArrayList<String> ali1 = new ArrayList<String>(){{
		                           
		                         add ("test");
		                         add("test2");
		                         }};
	
	  System.out.println(ali1);
	 //Method 3 : normal way 
	  
	  //Method 4 : using Collections.nCopies
	  
	  ArrayList<String> ali3 = new ArrayList<String>(Collections.nCopies(2, "hello"));
		  System.out.println(ali3);
	 
	 
	}

}
