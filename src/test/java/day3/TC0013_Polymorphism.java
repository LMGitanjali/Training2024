package day3;          //OVERLOADING
class  Box{
	Box(){
		System.out.println("Hello box");
		}
	
	Box(double val){
		System.out.println("Total no.of box is:"+val);
	}
		
	
	
}
public class TC0013_Polymorphism {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Box obj = new Box();
		Box obj2 = new Box(20);
	}

}
