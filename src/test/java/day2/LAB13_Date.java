package day2;

import java.time.LocalDate;
import java.util.Scanner;

public class LAB13_Date {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter purchase date in YYYY-MM-DD format");
		String str= sc.next();
		sc.close();
		
		LocalDate date = LocalDate.parse(str);
		LocalDate expdate=date.plusMonths(11);
		System.out.println("Your product warrant expiry date is: "+ expdate);
	}
	
}







	
	
		
	
