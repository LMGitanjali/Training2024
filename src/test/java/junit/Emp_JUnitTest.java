package junit;


import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Emp_JUnitTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
	Employee emp1=new Employee();
	emp1.setFname("Neha");
	emp1.setLname("");
	emp1.setGender("Female");
	assertEquals("Neha",emp1.getFname());
     
    
     EmpName emp = new EmpName();
        try {
        	emp.empdetails(emp1.getFname(),emp1.getLname());
 System.out.println("Employee name is "+emp1.getFname()+" "+emp1.getLname() + " "+emp1.getGender());
        } catch (InvalidNameException e) {
            System.out.println("Invalid Name " + e.getMessage());
        }
	}
}




class Employee{
 private String fname;
 private String lname;
 private String gender;

public String getGender() {
	return gender;
}
public void setGender(String gender) {
	this.gender = gender;
}
public String getFname(){
          return fname;
   }
   public String getLname(){
          return lname;
   } 
   public void setFname(String fname){
        this.fname=fname;
   } 
   public void setLname(String lname){
        this.lname=lname;
   } 
} 
 
class InvalidNameException extends Exception {
    InvalidNameException(String s) {
        super(s);
    }
} 
 class EmpName {
    void empdetails(String fname, String lname) throws InvalidNameException {
         if (fname.isEmpty() &&  lname.isEmpty()) {
            throw new InvalidNameException("Employee First and last name missing");
        }     else if(fname.isEmpty()){
            throw new InvalidNameException("Employee First name is missing");
        }
         else  if(lname.isEmpty()){
            throw new InvalidNameException("Employee Last name is missing");
        }
    }
 }
