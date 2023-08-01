package week3.assignements;

import java.util.ArrayList;
import java.util.List;

public class FindIntersection {

	public static void main(String[] args) {

		//int[] a = {3,2,11,4,6,7};
		//int[] b = {1,2,8,4,9,7};
		
		List<Integer> a = new ArrayList<>();
		
		a.add(3);
		a.add(2);
		a.add(11);
		a.add(4);
		a.add(6);
		a.add(7);
		
		System.out.println("a = " +a);
		
		List<Integer> b = new ArrayList<>();
		b.add(1);
		b.add(2);
		b.add(8);
		b.add(4);
		b.add(9);
		b.add(7);
		
		System.out.println("b = "+b);
		
		
		a.retainAll(b);
		System.out.println("common = " +a);
			
			
		}

	}

	 
	
