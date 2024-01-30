package Java_Pack1;

public class Ex_Const {
	
	int mathmarks;
	int scimarks;
	int engmarks;
	
	
	

	 Ex_Const(int mathmarks, int scimarks, int engmarks) {
		this.mathmarks = mathmarks;
		this.scimarks = scimarks;
		this.engmarks = engmarks;
	}



	public void total() {
		int totalmarks;
		totalmarks=mathmarks+scimarks+engmarks;
		System.out.println("The total marks are : "+totalmarks);
		}
}
