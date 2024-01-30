package day3;

import java.util.UUID;

public class Account2_1 {
	  public String accNum;
	  public double balance;
	  public Person2_1 accHolder;
	  
	  public Account2_1(Person2_1 p1,double balance ) {
		  super();
		this.accNum=UUID.randomUUID().toString();
		this.balance = balance;
		this.accHolder = p1;
	}
	  
	public void deposit(double amt)
	  {
		  balance +=amt;
	  }
	  public void withdraw(double amt)
	  {
		  balance -= amt;
	  }
	  public String getAccNum() {
		return accNum;
	}
	public void setAccNum(String accNum) {
		this.accNum = accNum;
	}
	
	
	public Person2_1 getAccHolder() {
		return accHolder;
	}
	public void setAccHolder(Person2_1 accHolder) {
		this.accHolder = accHolder;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public double getBalance()
	  {
		  return balance;
	  }

	@Override
	public String toString() {
		return "Account2_1 [accNum=" + accNum + ", balance=" + balance + ", accHolder=" + accHolder.name + ", Age"+accHolder.age+"]";
	}
	
}

