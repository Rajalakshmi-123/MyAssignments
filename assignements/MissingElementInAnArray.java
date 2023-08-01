package week3.assignements;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MissingElementInAnArray {

	public static void main(String[] args) {
        
		//int[] arr = {1,2,3,4,7,6,8};
		
		List<Integer> arr = new ArrayList<Integer>();
		
		arr.add(1);
		arr.add(2);
		arr.add(3);
		arr.add(4);
		arr.add(7);
		arr.add(6);
		arr.add(8);
		
		System.out.println("Given List is " +arr);
		
		Collections.sort(arr);
		
		System.out.println("Sorted List is " +arr);
		
		for (int i = 1; i < arr.size()-1; i++) {
			
			if(!arr.contains(i)) {
				System.out.println("Missing element is " +i);
			}
			
		}
		
	}

}
