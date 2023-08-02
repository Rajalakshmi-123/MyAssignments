package week3.assignements;

public class ReverseEvenWords {

	public static void main(String[] args) {

		String test = "I am a software tester";
		
		String[] words = test.split(" ");
		
		String output = "";
		
		
		for (int i = 0; i < words.length; i++) {
				
			if(i%2!=0 ) {
				
				String reverse = words[i];
				String rev =" ";
				
				for (int j = reverse.length()-1; j>=0; j--) {
					//System.out.print(reverse.charAt(j));
					rev = rev+reverse.charAt(j);
					
					}
				output = output + rev + " ";
			}
			else {
				output = output + words[i] + " ";
			}
		
		
		
		}
		
		System.out.println(output);
		}

		}

	


