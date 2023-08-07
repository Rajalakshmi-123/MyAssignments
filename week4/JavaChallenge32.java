package assignments.week4;

public class JavaChallenge32 {
	public static void main(String[] args) {
		
	
	
	String s = "race a car";
	String t = "";
	String rev = "";
	
	String[] split = s.split(" ");
	for (int i = 0; i < split.length; i++) {
		System.out.print(split[i]);
		t = t+split[i];
	}
	System.out.println(" ");
	char[] ch = t.toCharArray();
	
	for (int j = ch.length-1; j >=0; j--) {
		
		System.out.print(ch[j]);
		rev = rev+ch[j];
		}
	System.out.println(" ");
	
	if(t.equals(rev)) {
		System.out.println("It is palindrome");
	}
	else {System.out.println("It is not a palindrome");
	}
	}
	}
	
