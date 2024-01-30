package Lab5;

public class Savings_Account extends Account {
final double minbalance;
	
	
	public Savings_Account(String accholder, double initialval) {
		super(accholder, initialval);
		this.minbalance = 2000;
	}

	@Override
	public void withdraw(double withdraw) {
		if(balance>=minbalance) {
			balance-=withdraw;
			System.out.println("Your balance is : "+ balance);
		}else
			System.out.println("Minimum Balance insufficient");
	}
}
