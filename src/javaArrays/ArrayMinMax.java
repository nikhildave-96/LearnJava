package javaArrays;

import java.util.Scanner;

public class ArrayMinMax {

	public static void main(String[] args) {
		int n;
		
		System.out.println("Enter number of elements to be stored in array");
		
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		
		int arr[] = new int [n];
		
		for(int i=0;i<n;i++) {
			int num;
			System.out.println("Please enter element "+(i+1)+" of the array");
			num = sc.nextInt();
			arr[i] = num;
		}
		sc.close();
		ArrayMinMax amm = new ArrayMinMax();
		amm.printArray(arr);
		amm.minArray(arr);
		amm.maxArray(arr);
	}
	
	public void printArray(int array[]) {
		System.out.println("Displaying values entered by user -");
		for(int a:array) {
			System.out.print(a+" ");
		}
		System.out.println();
	}
	
	public void minArray(int array[]) {
		int min = array[0];
		int index1=0;
		for(int j=0;j<array.length;j++){
			if(array[j]<min) {
				min=array[j];
				index1=j;
			}
		}
		System.out.println("minimum value of the array is :"+min+" present at index - "+index1);
	}
	
	public void maxArray(int array[]) {
		int max = array[0];
		int index2=0;
		for(int j=0;j<array.length;j++){
			if(array[j]>max) {
				max=array[j];
				index2=j;
			}
		}
		System.out.println("maximum value of the array is :"+max+" present at index - "+index2);
	}
}
