package Lab5;

public class Current_Account extends Account {
	final double limit;
	public Current_Account(String accholder, double initialval) {
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
		else
			System.out.println("You exceed the limit");
	}
}
