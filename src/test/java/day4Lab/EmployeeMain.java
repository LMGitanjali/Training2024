package day4Lab;



public class EmployeeMain {

	public static void main(String[] args) {
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


