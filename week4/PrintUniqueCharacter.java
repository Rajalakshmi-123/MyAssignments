package assignments.week4;

import java.util.LinkedHashSet;
import java.util.Set;

public class PrintUniqueCharacter {

	public static void main(String[] args) {
            
		
		       String name = "Rajalakshmi";
		       
		       char[] ch = name.toCharArray();
		       
		       Set<Character> unique= new LinkedHashSet<Character>();
		       
		       for (Character name1 : ch) {
		    	   
		    	   unique.add(name1);
		    	   }
		       
		       System.out.print(unique);
	}

}
