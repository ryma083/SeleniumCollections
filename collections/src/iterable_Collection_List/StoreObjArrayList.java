package iterable_Collection_List;

import java.util.*;

public class StoreObjArrayList {

	public static void main(String[] args) {
		
		Employees emp1 = new Employees("Peter",28,"QA");
		Employees emp2 = new Employees("Joe",25,"Dev");
		

      ArrayList<Employees> arry = new ArrayList<Employees> ();
             arry.add(emp1);
             arry.add(emp2);
             arry.add(new Employees ("Tom",30,"Admin"));
             
        // using Iterator to loop our arrayList 
         System.out.println("loop the arrylist using Iterator:");   
        Iterator<Employees>  it = arry.iterator();
        while (it.hasNext()) {
//              Employees emp = it.next();
//              System.out.println(emp.name);
//              System.out.println(emp.age);
//              System.out.println(emp.dpt);
             System.out.println(it.next());
        }
        System.out.println("before sorting ..........");
        for(Employees em :arry) {
        	System.out.println(em); 	
        }
        
        //iterate using enumeration 
        System.out.println("*********iterate arrayList using Enumeration");
       Enumeration<Employees> num = Collections.enumeration(arry);
        while (num.hasMoreElements()) {
        	System.out.println(num.nextElement());
        }
     
        Collections.sort(arry);
        
        System.out.println("After sorting............... ");
        for(Employees e :arry) {
        	System.out.println(e); 	
        }
     
        
	}
	
}