package week1.day1;

public class Maths {
	
	private int add(int a,int b) {
		return a+b;
		
	}

		
	private int multiply(int a,int b) {
	
	return a*b;
	
	}
	
	private int divide(int a,int b) {
		
		return a/b;
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Maths m=new Maths();
		

m.add(50, 80);
System.out.println(m.add(50, 80));

 int multiply=m.multiply(9, 5);
 System.out.println(multiply);
 
 m.divide(50, 2);
 System.out.println(m.divide(50, 2));
 
 

	}

}
