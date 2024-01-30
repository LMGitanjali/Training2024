package day2;

public class TC009_String {
	public static void main(String[] args) {
		String str1=new String("Neha");
		String str2=new String("Shubh");
		System.out.println("String1: "+str1+"_____"+"String2: "+str2);// Neha    Shubh

		String str3=new String("Neha");
		String str4=str3;
		System.out.println("String3: "+str3+"_____"+"String4: "+str4);  //Neha     Neha
		System.out.println("Length: "+str1.length());    //4
		System.out.println("Index Of:"+ str1.indexOf("h"));  //2
		
		String s1="This is a beautiful day";
		System.out.println(s1.trim());
		System.out.println(s1.concat("hello"));
		System.out.println(s1.substring(8,17));   // a beautif
		
		System.out.println(str1.toUpperCase());         //NEHA
		System.out.println(str1.equals(s1));   //false
		System.out.println(str1==s1);  //false
		
		StringBuffer s2=new StringBuffer("Welcome");
		System.out.println(s2.append("Dalvi"));// Welcome Dalvi
	
	}
	
	
}
