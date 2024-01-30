package day3;


interface simplecalc{
	int add(int a, int b);
}
public class TC004_INTER implements simplecalc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TC004_INTER c = new TC004_INTER();
       System.out.println(c.add(10,10));
	}

	
		public int add(int a, int b) {
			int c= a+b;
			return c;
		}
}
