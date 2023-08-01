package abstraction;

public class Automation extends MultipleLanguage {

	@Override
	public void Selenium() {
		System.out.println("Testing tool is Selenium");
		
	}

	@Override
	public void java() {
		System.out.println("Coding Language is Java");
		
	}

	@Override
	public void python() {
		super.python();
	}

	@Override
	public void ruby() {
		super.ruby();
	}
	
	public static void main(String[] args) {
		
		Automation auto = new Automation();

		auto.java();
		auto.Selenium();
		auto.python();
		auto.ruby();
	}

	
}
