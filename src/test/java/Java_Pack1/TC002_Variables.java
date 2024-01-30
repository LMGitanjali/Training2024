package Java_Pack1;

public class TC002_Variables {

	private double dblwidth; //global variable
	private double dblheight;
	private double dbldepth;
	

	public static int boxid;
	
	
	public double volume(double a, double b, double c) {
		
		dblwidth=a;
		dblheight=b;
		dbldepth=c;
		double deltemp; //instance varibale
		deltemp=dblwidth*dblheight*dbldepth;
		
		return deltemp;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		TC002_Variables obj = new TC002_Variables();
		System.out.println(obj.volume(10,20,10));
	}

}
