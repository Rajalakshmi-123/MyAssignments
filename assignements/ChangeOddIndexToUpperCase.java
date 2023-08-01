package week3.assignements;

public class ChangeOddIndexToUpperCase {

	public static void main(String[] args) {

		String test = "changeme";
		
		char[] ch = test.toCharArray();
		
		
		//System.out.println(" ");

		
		for (int i = 0; i < ch.length; i++) {
			
			//System.out.println(ch[i]);
			
			
			if(i%2!=0) {
				
			 ch[i] = Character.toUpperCase(ch[i]);
			 
			 System.out.print(ch[i] = Character.toUpperCase(ch[i]));

				}
		
			else {
				ch[i] = Character.toLowerCase((ch[i]));
				
				System.out.print(ch[i] = Character.toLowerCase((ch[i])));
			}
				
				
			}
		
		}
	
	}			
		
	
	
	

