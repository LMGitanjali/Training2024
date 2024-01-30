package LAB_Array;

import java.util.ArrayList;
import java.util.Collections;

public class Lab4_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList arr1 = new ArrayList();
		arr1.add("TV");
		arr1.add("Oven");
		arr1.add("Mobile");
	
		System.out.println("Before sorting:"+arr1);
		
		Collections.sort(arr1);
		for (Object products : arr1) {
			System.out.println("Products are: "+products);
		}
	}
}
