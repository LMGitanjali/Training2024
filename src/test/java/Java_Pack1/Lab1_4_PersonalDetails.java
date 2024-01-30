package Java_Pack1;

public class Lab1_4_PersonalDetails {

	private String fname;
	private String lname;
	private String gender;
	private int age;
	private double weight;
	
	public void printDetails() {
		System.out.println("First name: "+fname);
		System.out.println("Last name: "+lname);
		System.out.println("Gender: "+gender);
		System.out.println("Age: "+age);
		System.out.println("Weight: "+weight);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Lab1_4_PersonalDetails obj = new Lab1_4_PersonalDetails();
		 obj.fname="Gitanjali";
		 obj.lname="Dalvi";
		 obj.gender="F";
		 obj.age=27;
		 obj.weight=49.5;
		 
		 obj.printDetails();
		
	}
}
