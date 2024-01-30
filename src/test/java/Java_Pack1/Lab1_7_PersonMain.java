package Java_Pack1;

import java.util.Scanner;

public class Lab1_7_PersonMain {
	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	System.out.println("Please enter the number:");
	String num1=sc.next();	
	Lab1_7_Person p1= new Lab1_7_Person("Nihal ", "Surve ", "Male",num1);
		p1.printData();
		
		System.out.println("Please enter the number");
		String num2=sc.next();
		Lab1_7_Person p2= new Lab1_7_Person();
		p2.setFname("Ira ");
		System.out.print(p2.getFname());
		
		p2.setLname("Dalvi ");
		System.out.print(p2.getLname());
		
		p2.setGender("Female ");
		System.out.print(p2.getGender());
		
		p2.setPnumber(num2);
		System.out.println(p2.getPnumber());
	}
}
