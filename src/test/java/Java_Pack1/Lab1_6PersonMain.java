package Java_Pack1;


public class Lab1_6PersonMain {
	
	public static void main(String[] args) {
		Lab1_6_Person p1= new Lab1_6_Person("Nihal ", "Surve ", "Male");
		p1.printData();
		
		Lab1_6_Person p2= new Lab1_6_Person("Ira ", "Surve ", "Female");
		System.out.print(p2.getFname());
		System.out.print(p2.getLname());
		System.out.println(p2.getGender());
	}

}
