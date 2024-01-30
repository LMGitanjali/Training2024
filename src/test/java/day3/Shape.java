package day3;
abstract class Shapes{
	abstract void draw();
}


class rect extends Shapes{
	@Override
	void draw() {
		System.out.println("Draw the recrangle");
	}
}

public class Shape {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    rect r1=new rect();
    r1.draw();
	}

}
