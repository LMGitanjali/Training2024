package day4;

public class Demo_Exception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
try {
	int a= 5 ;
	int b=a/0;
	System.out.println(b);
}catch(ArithmeticException e) {
	System.out.println("Exception is:" +e);
}



	}
}
