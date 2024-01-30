package day3;
class Base_Parent{
public void basemethod() {
	System.out.println("Parent called");
}
}

class Derived_Child extends Base_Parent{
	public void derivedmethod() {
		super.basemethod();
		System.out.println("Child called");
	}
}
public class TC0012_Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Derived_Child cd = new Derived_Child();
		//cd.basemethod();         //Parent called
		cd.derivedmethod();    //   Parent called       Child called 
		
		if(cd instanceof Base_Parent ) {
			System.out.println("yes it is instance of base parent");
		}
		else {
			System.out.println("yes it is instance of base parent");
		}
	}
}
