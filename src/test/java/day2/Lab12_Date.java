package day2;
import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Lab12_Date {
	public static void main(String[] args) {
		
	Scanner sc= new Scanner(System.in);
	 System.out.println("Enter your 1st date in yyyy-MM-dd");
    String d1=sc.next();
    LocalDate date=  LocalDate.parse(d1);
	System.out.println(date);

		System.out.println("Enter your 2nd date in yyyy-MM-dd");
	     String d2=sc.next();
		 LocalDate date2=  LocalDate.parse(d2);
		 System.out.println(date2);
		sc.close();
		 
	Period p1= Period.between(date, date2);
	System.out.println("Days: "+p1.getDays());     
	System.out.println("Months: "+p1.getMonths());
	System.out.println("Years: "+p1.getYears());	
}}


