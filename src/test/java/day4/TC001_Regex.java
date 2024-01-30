package day4;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TC001_Regex {
	public static void main(String[] args) {
		String str1="Welcome";
		String str2="Welcome";
		boolean pattermatch=Pattern.matches(str1, str2);
		System.out.println("Matching: " +pattermatch);
		
		String input = "Shop,Mop.Hopping.Chopping";
		Pattern p1 = Pattern.compile("hop");       // group=hop
		Matcher m1 = p1.matcher(input);
		System.out.println(m1.matches());
		while(m1.find())
		{
			System.out.println(m1.group()+ ":"+m1.start()+":"+ m1.end());
		}
		
		
		String n1 = "1234567";
		Pattern p3=Pattern.compile("\\d\\d\\d\\d\\d\\d\\d");
		//Pattern p3=Pattern.compile("[0-9][0-9][0-9][0-9][0-9][0-9][0-9]"); 
		//Pattern p3=Pattern.compile(".*");
		Matcher m3 = p3.matcher(n1);
				if(m3.find()) {
					System.out.println("Number pattern matched");
				}
				else {
					System.out.println("Number pattern not matched");
				}
				
				
				String a1 = "1234 1234 1234";
				Pattern p5=Pattern.compile("[0-9][0-9][0-9][0-9]\\s[0-9][0-9][0-9][0-9]\\s[0-9][0-9][0-9][0-9]");
				//Pattern p5=Pattern.compile("^[0-9]{4}\\s [0-9]{4}\\s  [0-9]{4}$");
				Matcher m5 = p5.matcher(a1);
						if(m5.find()) {
							System.out.println(" Addhar number pattern matched");
						}
						else {
							System.out.println("Addhar number pattern not matched");
						}			
				
						
		String e1 = "neha@gmail.com";
		Pattern p4=Pattern.compile("^(.+)@(\\S)+$");               //         \\S- should not contain space
		//Pattern p4=Pattern.compile("^(.+)@(\\S).com");    
		Matcher m4= p4.matcher(e1);
		if(m4.find()) {
			System.out.println("email pattern matched");
		}
		else {
		System.out.println("email pattern matched");
		}
				
		String s1 = "Weome to Amazon 12345";
		//Pattern p2=Pattern.compile("^[A-Z]");            //alphabet             pattern matched   ^-for start
		//Pattern p2=Pattern.compile("[0-9]$");       //for digit   pattern matched
		Pattern p2=Pattern.compile("^[A-Z].*[0-9]$");           //for alphabet and digit     pattern matched
		Matcher m2 = p2.matcher(s1);
		if(m2.find()) {
			System.out.println("Pattern matched");
		}
		else {
			System.out.println("Pattern not matched");
		}
	}
}
