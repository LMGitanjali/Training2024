package Java_Pack1;
 import java.util.Scanner;
 
public class TC003_ControlState {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=5;
		int m=-1;
		
		while(n>0) {
			System.out.println("the value of n is :"+n);
			n--;
		}
		
		
		do {
			System.out.println("the value of m is :"+m);
			m--;
		}while(m>0);
			
		
		for(int i=0; i<=4; i++) {
			switch(i) {
			case 0: 
				System.out.println("i value is 0");
				break;
				
			case 1: 
				System.out.println("i value is 1");
				break;
				
			case 2: 
				System.out.println("i value is 2");
				break;
				
			case 3: 
				System.out.println("i value is 3");
				break;
				
			default: 
				System.out.println("i value is greater than 3");
			
		}
		}
		
//		while(true) {
//			Scanner sc =new Scanner(System.in);
//			System.out.println("Enter number");
//			int i =sc.nextInt();
//			
//			switch(i) {
//			case 0: 
//				System.out.println("i value is 0");
//				break;
//				
//			case 1: 
//				System.out.println("i value is 1");
//				break;
//				
//			case 2: 
//				System.out.println("i value is 2");
//				break;
//				
//			case 3: 
//				System.out.println("i value is 3");
//				break;
//				
//			default: 
//				System.out.println("i value is greater than 3");
//					}
//		}
	}

}
