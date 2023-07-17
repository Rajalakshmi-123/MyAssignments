package week1.day1;

public class Car {
	
	public void applybreak() {
		System.out.println("Applied break");
		
	}
public void soundhorn() {
	
	System.out.println("sound horn");
}
	public static void main(String[] args) {
	
		  Car c=new Car ();
		
		c.applybreak();
		c.soundhorn();
		
		Bike obj=new Bike();
		
		obj.fillfuel();
		
	}

}
