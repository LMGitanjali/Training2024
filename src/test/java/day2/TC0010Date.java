package day2;

import java.time.Instant;
import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.ChronoUnit;

public class TC0010Date {
	public static void main(String[] args) {
		DateTimeFormatter formatter= DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG);
		
		Instant currenttime=Instant.now();
		System.out.println("Current date and time "+ currenttime);
		
		LocalDate date1=LocalDate.now();
		System.out.println("Current date: "+ date1);   //2024-01-03
		
		LocalDate ind = LocalDate.of(1947,Month.AUGUST , 15);
		System.out.println("Independence day: "+ ind);    //1947-08-15
		
		System.out.println("Tomorrow: "+date1.plusDays(1));      //2024-01-04
	System.out.println("Last Month"+date1.minusMonths(1));       //2023-12-03
	
	ZonedDateTime ct=ZonedDateTime.now();
	System.out.println("Indian time: "+ct);
	
	ZonedDateTime ctparis = ZonedDateTime.now(ZoneId.of("Europe/Paris"));
	System.out.println("Paris current time and date: "+ctparis);
	
	Period p1= date1.until(ind);
	System.out.println(p1);//   
	System.out.println("Days: "+p1.get(ChronoUnit.DAYS));   //Enum ChronoUnit. A standard set of date periods units.  
	System.out.println("Months: "+p1.get(ChronoUnit.MONTHS));
	System.out.println("Years: "+p1.get(ChronoUnit.YEARS));
	
	}
	

}







//LocalDate d1=  LocalDate.parse(date);
//
//  int day = d1.getDayOfMonth();
//  Month month = d1.getMonth();
//  int year = d1.getYear();
//
//	System.out.println("Days: "+ day);
//	System.out.println("Month: "+ month); 
//	System.out.println("Year: "+ year); 

