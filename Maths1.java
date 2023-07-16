package week1.day1;

public class Maths1{
	public int add(int a,int b)   {
		return a+b;
	}


public int multiply(int a,int b) {
	return a*b;
}
	public int divide(int a,int b) {
		return a/b;
	
	}
	
	public static void main(String[] args) {
		
		
		Maths1 m1=new Maths1();
		
		m1.add(40, 80);
		
		System.out.println(m1.add(40, 80));
		
		m1.multiply(35, 5);
		System.out.println(m1.multiply(35, 5));
		
		m1.divide(70, 5);
		System.out.println(m1.divide(70, 5));
	}

}
