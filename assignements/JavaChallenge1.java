package week3.assignements;

public class JavaChallenge1 {

	public static void main(String[] args) {

		String s = "Hello World";
		String[] split = s.split(" ");
		System.out.println(split[1]);
		
		int split1length = split[1].length();
		System.out.println(split1length);
		
		
		String t = "fly me  to  the moon";
		String[] split2 = t.split(" ");
		System.out.println(split2[6]);
		
	    int split6length = split2[6].length();
	    System.out.println(split6length);
		
	    
	    String u = "luffy is still joyboy";
	    String[] split3 = u.split(" ");
	    System.out.println(split3[3]);
		
	    int split3length = split3[3].length();
	    System.out.println(split3length);
		
	}

}
