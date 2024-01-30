package Java_Pack1;

public class Lab1_6_Person {
	private String fname;
	private String lname;
	private String gender;
	
	public Lab1_6_Person() {
	}
	
	public Lab1_6_Person(String fname, String lname, String gender) {
		super();
		this.fname = fname;
		this.lname = lname;
		this.gender = gender;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}
	
	public void printData() {
		System.out.println("First name: "+fname+ "Last name: "+lname+ "Gender: "+gender);
	}
}
