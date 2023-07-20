package week1.day2;

public class Fibonnaci {

	public static void main(String[] args) {
		
		int range = 8;
		int firstNum = 0;
	    int secondNum = 1;
	    
	   int sum;
	   
	   System.out.println("The Fibonnaci series is :  ");
		
	for (int i = 0; i < range; i++) {
		
		System.out.println(firstNum+"");
		sum = firstNum+secondNum;
		firstNum = secondNum;
		secondNum = sum;
		
		
	}
		
	}


}