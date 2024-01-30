package day3;

public class Lab2Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Lab2_1Account per1 = new Lab2_1Account("Joya", 3000);
		Savings_Account sav1 = new Savings_Account("Geeta", 6000);
		CurrentAccount cur1 = new CurrentAccount("Krish", 3000);
		
		//System.out.println(sav1.getAccNum());
		//System.out.println(cur1.getAccNum());
		//System.out.println(sav1.getAccNum());
		
		sav1.display();
		cur1.display();
		
		sav1.withdraw(1000);
		cur1.withdraw(2000);
		
		
	}

}
