package week3.assignements;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingUsingCollection {

	public static void main(String[] args) {
		
		// Declare a String array and add the Strings values as (HCL, Wipro,  Aspire Systems, CTS)		


		List<String> company = new ArrayList <String>();
		
		company.add("HCL");
		company.add("Wipro");
		company.add("Aspire Systems");
		company.add("CTS");
		
		System.out.println("Companies : " +company);
		
		int size = company.size();
		
		System.out.println("No of companies: " + size);
		
		Collections.sort(company);
		
		System.out.println("Sorted order : " +company);
		
		Collections.reverse(company);
			
	    System.out.println("Reversed order : " +company);
			
			
		}
			
		
		}
		
		
	
	
	


