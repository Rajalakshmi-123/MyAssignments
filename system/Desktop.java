package org.system;

public class Desktop extends Computer{
	
	public void desktopSize() {
		
		System.out.println("Size is 13.3-inch (2560 × 1600)");
	}
	
	public static void main(String[] args) {
		
		Desktop dp = new Desktop();
		
		dp.computerModel();
		dp.desktopSize();
	}

}
