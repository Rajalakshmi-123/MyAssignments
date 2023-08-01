package override;

public class AxisBank extends BankInfo{

	@Override
	public void deposit() {
		super.deposit();
	}
	public static void main(String[] args) {
		
		AxisBank axis = new AxisBank();
		axis.deposit();
	}

}
