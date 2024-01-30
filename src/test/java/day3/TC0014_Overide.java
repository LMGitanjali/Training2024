package day3;    //Override


class SwipeMachine{
	void readCard() {
		System.out.println("Reading Swipe Machine");
	}
}

class ChipCardMachine extends SwipeMachine{
	@Override
	void readCard() {
		System.out.println("Reading Chip Machine");
	}
}


public class TC0014_Overide{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	SwipeMachine normal = new SwipeMachine();
	//	normal.readCard();      //reading normal swipe card
		
		normal = new ChipCardMachine();
		normal.readCard();   // reading chip based  swipe card
		
		final int i =10;
		//i=14;    //error
	}
}


