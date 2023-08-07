package assignments.week4;

public class JavaChallenge33 {

	public static void main(String[] args) {
		String s = "";
		String rev ="";
		
		String replaceAll = s.replaceAll("[^0-9]", " ");
		String replaceAll2 = replaceAll.replaceAll("[a-z]", " ");
				
			if(replaceAll2.equals(rev)) {
	System.out.println("It is a palindrome");
}else {System.out.println("It is not a plaindrome");
}
}
}