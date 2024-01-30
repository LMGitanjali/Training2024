package day3;

interface TC003_Interface {
	public int add(int a, int b);
	
}


class SimpleCalci implements TC003_Interface{
	@Override
	public int add(int x, int y) {
		return x+y;
	}
}