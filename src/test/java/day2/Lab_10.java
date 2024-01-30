package day2;
import java.util.Scanner;

public class Lab_10 {
	      	public boolean checkString()
	      	{
	      			System.out.println("Enter the Statement");
	      			Scanner sc = new Scanner(System.in);
	      			String message = sc.nextLine();
	      			for(int i = 0 ;i < message.length() - 1;i++)
	      			{
	      				int a = (int)message.charAt(i);
	      				int b = (int)message.charAt(i + 1);
	      				if(a > b)
	      				{
	      					System.out.println("String is negative");
	      					return false;
	      				}	
	      			}
	      	
	      			return true;
	      	}
	      	public static void main(String[] args) {
	      		Lab_10 obj4 = new Lab_10();
	      	   boolean v = obj4.checkString();
	      		if(v == true)
	      		{
	      			System.out.println("String is positive");
	      		}
	      	}
	}

