package junit;

import org.junit.Test;

public class Person {
	private String fname;
	private String lname;
	 private int age;

	
	public Person(String fname, String lname,int age) {
		if(fname==null && lname==null) {
			throw new IllegalArgumentException("Both names cannot be null");
		}
		
		this.fname=fname;
		this.lname=lname;
		this.age=age;
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

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getFullName() {
		String first=(this.fname!=null)?this.fname:"?";
		String last=(this.lname!=null)?this.lname:"?";
		
		return first+ " " +last+ " "+age;
	}


	
	
	
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		Person p1= new Person("Neha","Luv");
//		System.out.println(p1.getFirstName());
//		System.out.println(p1.getFullName());
//		
////		Person p2=new Person(null, null);
////		System.out.println(p2.getFullName());
//	
//	}
}
