package javaArrays;

import java.util.Scanner;

public class Arrays {
	
	static Scanner s = new Scanner(System.in);
	
	public static void main(String[] args) {
	int [] a = {5,8,9,35,7};
	
	System.out.println("the size of array is : "+a.length);
	
	for (int i = 0; i<a.length;i++){
		System.out.println("value at index "+i+" of array is : "+a[i]);
	}
	
	int sum = 0;
	for (int j = 0; j<a.length;j++){
		sum = sum + a[j];
	}
	
	System.out.println("Result of addition of numbers present in array is : "+sum);
	
	
  }
}
