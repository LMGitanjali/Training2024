package day4Lab;

public class PersonAgeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		Person p1 = new Person();
		p1.setName("Nihal");
		String n = p1.getName();
		 try {
			 p1.setAge(17);
			   p1.getempdetails();
		   }catch(AgeException e){
			  
			System.out.println(n  + "  "+e);
			   
		   }
	}

}
