package week1.day2;

import java.util.Arrays;

public class FindSecondSmallestNumber {

	public static void main(String[] args) {
		
		int[] num= {23,45,67,32,89,22};
		
		Arrays.sort(num);
		
		for (int i = 0; i < num.length-5; i++) {
		
			
			System.out.println("second smallest number is "+num[1]);
		}
	}

}
