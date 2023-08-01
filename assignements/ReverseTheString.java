package week3.assignements;

public class ReverseTheString {

	public static void main(String[] args) {

		String input = "Amazon development centre,Chennai";
		
		String lowerCase = input.toLowerCase();
		
		System.out.println(lowerCase);
		
		String[] split = input.split(" ");
		
		for (int i = 0; i < split.length; i++) {
			System.out.print(split[i]);
			
		}
		
		System.out.println(" ");
		
		int length = input.length();
       
       System.out.println(length);
       
       for (int i = split.length-1; i >=0; i--) {
    	   
    	   System.out.print(split[i]);
		
	}

	}
	
	
     
      }




