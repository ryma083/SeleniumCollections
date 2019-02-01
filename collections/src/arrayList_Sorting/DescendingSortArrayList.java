package arrayList_Sorting;

import java.util.*;

public class DescendingSortArrayList {

	public static void main(String[] args) {
	
		// this is a descending order sort in arrayList
		ArrayList<String> ary = new ArrayList<String> (Arrays.asList("joe","back","hi"));
		
		System.out.println("Before the Desc Assorting String: ");
		for(String st : ary) {
			System.out.println(st);
		}
		
		Collections.sort(ary, Collections.reverseOrder());// this how we sort in a descending order or decreasing order
		
		System.out.println("After the Desc Assorting String: ");
		for(String i : ary) {
			System.out.println(i);
		}
	}

}