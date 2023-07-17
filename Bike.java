package week1.day1;

public class Bike {
	
	public void fillfuel() {
		
		System.out.println("Filled fuel");
	}

	public static void main(String[] args) {
		
		
		Bike b=new Bike();
		
		b.fillfuel();
		
		Car obj=new Car();
		
		obj.applybreak();
		obj.soundhorn();
		
		
		
	}

}
