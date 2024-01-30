package day3;

public class Lab2_1Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Person2_1 smith = new Person2_1("Smith" , 34);
		Person2_1 kathy = new Person2_1("Kathy" , 29);
		
		Account2_1 a1 =  new Account2_1(smith,2000);
		Account2_1 a2 =  new Account2_1(kathy,3000);
		
		a1.deposit(100);
		a2.withdraw(2000);
	
		System.out.println(a1.getBalance());
		System.out.println(a2.getBalance());
		System.out.println("Smith account number"+a1.getAccNum());
		System.out.println("Kathy account number"+a2.getAccNum());
		
		System.out.println(a1);
		System.out.println(a2);
		
	}
}
