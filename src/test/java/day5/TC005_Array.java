package day5;

import java.util.Arrays;

public class TC005_Array {

	public static void main(String[] args) {
		// Array declaration
		int arr[];
		arr=new int[5];
		
		int arr1[]= new int[2];
		arr1[0]=3;
		arr1[1]=7;
		System.out.println(arr1[0]);
		System.out.println(arr1[1]);
		System.out.println(arr1.length);
		
		int arr3[]= {1,250,103,840,590};
		System.out.println(arr3[3]);
		System.out.println(arr3.length);
		
		Arrays.sort(arr3);
		// forEach loop
		for(int val:arr3) {
			System.out.println("Value of i: "+val);
		}
		//for loop
		for(int i=0;i<arr3.length;i++) {
			System.out.println("i value are: "+arr3[i]);
		}
		
	
		
		//2 dimensional array
		String twodim[][]=new String[2][2];
		System.out.println("Two dimensional length: " + twodim.length);
		twodim[0][0]="Apple";
		twodim[0][1]="Banana";
		twodim[1][0]="Cherry";
		twodim[1][1]="Mango";
		System.out.println(twodim[0][1]);
		
		int array[][]= {{1,2},{3,4},{5,6}};
		
		
		
		
		
      
	}

}
