package junit;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class JUnit_Person {
	@Test
	public void test2() {
		
		Person1 p1= new Person1("Janu","Joshi");
		System.out.println(p1.getFirstName());
		System.out.println(p1.getFullName());
		assertEquals("Janu Joshi",p1.getFullName() );
//	Person p2=new Person(null, null);
//	System.out.println(p2.getFullName());
	}
	
	@Test
	public void test1() {
		
		Person p2= new Person("Rahul","Joshi",19);
		System.out.println(p2.getFname());
		System.out.println(p2.getFullName());
		
//	Person p2=new Person(null, null);
//	System.out.println(p2.getFullName());
	
	}
}


class Person1 {
	private String fname;
	private String lname;
	
	public Person1(String fname, String lname) {
		if(fname==null && lname==null) {
			throw new IllegalArgumentException("Both names cannot be null");
		}
		this.fname=fname;
		this.lname=lname;
	}
	
	public String getFullName() {
		String first=(this.fname!=null)?this.fname:"?";
		String last=(this.lname!=null)?this.lname:"?";
		return first+ " " +last;
	}

	public String getFirstName() {
		return this.fname;
	}
	
	public String getLastName() {
		return this.lname;
	}
	}