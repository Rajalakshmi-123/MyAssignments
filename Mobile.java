package week1.day1;

public class Mobile {
	
	public void makeCall() {
		System.out.println("Make Call");
	}
	
 void sendMsg() {
	System.out.println("Send Msg");
}

public void Mobilemodel(String name,float weight) {
	
	System.out.println(name+"\n"+weight);
}
	public void Fullycharged(boolean fullycharged,int cost) {
		
		System.out.println(fullycharged+"\n"+cost);
	}


	public static void main(String[] args) {
		Mobile m=new Mobile();
		System.out.println("This is my mobile");
		m.makeCall();
		m.sendMsg();
		m.Mobilemodel("Mobile name:Redmi",1.2f);
		m.Fullycharged(true, 12000);
	}
}