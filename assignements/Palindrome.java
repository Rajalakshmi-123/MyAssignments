package week3.assignements;

public class Palindrome {

	public static void main(String[] args) {
		
		String A = "madam";
		String rev = "";
		
		char[] chAr = A.toCharArray();
		
	for (int i = chAr.length-1; i >=0; i--) {
		
		rev = rev+chAr[i];
		
		System.out.println("Reversed string is "+rev);
	}
		
      if(A.equals(rev)) {
    	  System.out.println("It is a palindrome");
      }
      else {
    	  System.out.println("It is not a palindrome");
      }
	}

}
