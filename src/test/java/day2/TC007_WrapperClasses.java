package day2;

public class TC007_WrapperClasses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    String strvalue="12345";
    int c=100;
    System.out.println(strvalue+c);  //12345100
    int d = Integer.parseInt(strvalue);   //12345
    System.out.println(d+c);//12445
	}

}
