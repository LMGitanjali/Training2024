package day4;

public class TC003Nested_Exception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			int a =3;
			int b =10/a;
			System.out.println("a ="+a);
			try {
				if(a==1)
					a=a/(a-a);
				if(a==2) {
					int c[]= {1};
					c[42]=99;}
				}
				catch(ArrayIndexOutOfBoundsException e) {
					System.out.println(e);
				}
			}
				
			catch(ArithmeticException e) {
					System.out.println();
			}

	}
}
