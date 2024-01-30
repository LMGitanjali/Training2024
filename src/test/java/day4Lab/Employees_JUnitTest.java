package day4Lab;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Employees_JUnitTest {

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
	emp1.setFname("");
	emp1.setLname("");
	emp1.setGender("Female");
     
    
     EmpName emp = new EmpName();
        try {
        	emp.empdetails(emp1.getFname(),emp1.getLname());
 System.out.println("Employee name is "+emp1.getFname()+" "+emp1.getLname() + " "+emp1.getGender());
        } catch (InvalidNameException e) {
            System.out.println("Invalid Name " + e.getMessage());
        }
	}
}
