package Lab5;

public class Account_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Savings_Account a = new Savings_Account("Neha", 5000);
		Current_Account b = new Current_Account("Ira", 3000);
		
		a.display();
		b.display();
		
		a.withdraw(2000);
		b.withdraw(1000);
	}

}
