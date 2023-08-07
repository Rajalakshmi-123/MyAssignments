package assignments.week4;

public class JavaChallenge31 {

	public static void main(String[] args) {
		
		String s = "A man, a plan, a canal: Panama";
		String t = "";
		String rev = "";
		
		String replaceAll = s.replaceAll(",", " ");
		System.out.println(replaceAll);
		String replace = replaceAll.replace(":", "");
		System.out.println(replace);
		String lowerCase = replace.toLowerCase();
		System.out.println(lowerCase);
		
		String[] split = lowerCase.split(" ");
		
		
		for (int i = 0; i < split.length; i++) {
			System.out.print(split[i]);
			t = t +split[i];
			}
		
		char[] ch = t.toCharArray();
		
		for (int j =ch.length-1; j >= 0; j--) {
			
			System.out.println(ch[j]);
		    rev= rev+ch[j];
			System.out.print(rev);
			
		}
		
	System.out.println(" ");
		  if(t.equals(rev)) {
			  System.out.println("Given string is a palindrome");
		  }
		  else { System.out.println("Not a palindrome");
		  }
		  
		}

	}


