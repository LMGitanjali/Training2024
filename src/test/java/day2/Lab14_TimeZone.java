package day2;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Scanner;

public class Lab14_TimeZone {
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter country name:");
		String str= sc.next();
		
		
		ZonedDateTime time = ZonedDateTime.now(ZoneId.of(str));
		System.out.println("Current time and date of country of choice: "+time);
	}

}
