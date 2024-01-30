package day3;

public class CurrentAccount extends Lab2_1Account{

	final double limit;
	public CurrentAccount(String accholder, double initialval) {
		super(accholder, initialval);
		this.limit=1000;
		// TODO Auto-generated constructor stub
	}
	@Override
	public void withdraw(double amt ) {
		if(limit<amt) {
			balance-=amt;
			System.out.println("Amount withdraw now your balance is: "+balance);
		}
		
		else {
			System.out.println("You exceeds the limit ");
		}
	}
}
