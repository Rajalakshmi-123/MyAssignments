package week3.assignements;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FindSecondLargest {

	public static void main(String[] args) {
		
		
		List<Integer> data = new ArrayList<Integer>();
		
		data.add(3);
		data.add(2);
		data.add(11);
		data.add(4);
		data.add(6);
		data.add(7);
		
		System.out.println("data = " +data);
		
		Collections.sort(data);
		
		System.out.println("sorted data = " +data);
		
		int size = data.size();
		
		System.out.println("Size of the list is " +size);
		
	Integer i = data.get(data.size()-2);
	
	System.out.println("Second largest number from the list is " +i);
	
		
		
	}

}
