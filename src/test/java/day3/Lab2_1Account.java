package day3;

import java.util.UUID;

public class Lab2_1Account {
	
	private String accNum;
	public double balance;
	private String person;
	
	
	public Lab2_1Account(String accholder, double initialval) {
		this.accNum=UUID.randomUUID().toString();
		this.person=accholder;
		this.balance=initialval;
	}
	
	public void deposit(double amt ) {
		balance+=amt;
		System.out.println(amt + "Amount is deposited to your account number " +accNum);
	}
	
	public void withdraw(double amt ) {
		if(balance>amt) {
			balance-=amt;
			System.out.println(amt + "Amount is deposited to your account number " +accNum);
		}
		
		else {
			System.out.println("Insufficient balance: ");
		}
	}
	
	public String getAccNum() {
		return accNum;
	}

	public void setAccNum(String accNum) {
		this.accNum = accNum;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public String getperson() {
		return person;
	}

	public void setperson(String person) {
		this.person = person;
	}

    public void display() {
    	System.out.println("Account number: "+accNum);
    	System.out.println("Person name: "+person);
    	System.out.println("Balance: "+balance);
    }
	}



	
	
	
   

	


