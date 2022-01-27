package javaArrays;

public class ArraySecondLargest3 {

	public static void main(String[] args) {
		int[] a = {11,45,95,23,54,48,39,7,41,91,15,29};
		
		//second highest value
		int largest = Integer.MIN_VALUE;
		int second_largest = Integer.MIN_VALUE;
		
		for(int i=0;i<a.length;i++) {
			if(a[i]>largest) {
				second_largest = largest;
				largest = a[i];
			}else if(a[i]>second_largest && a[i]!=largest) {
				second_largest = a[i];
			}
		}
		
		if(second_largest==Integer.MIN_VALUE) {
			System.out.println("there is no second largest value in array");
		}else {
			System.out.println("Second largest value is : "+second_largest);
		}
		
		
		//second smallest value
		int smallest = Integer.MAX_VALUE;
		int second_smallest = Integer.MAX_VALUE;
		
		for(int i=0;i<a.length;i++) {
			if(a[i]<smallest) {
				second_smallest = smallest;
				smallest = a[i];
			}else if(a[i]<second_smallest && a[i]!=smallest) {
				second_smallest = a[i];
			}
		}
		
		if(second_largest==Integer.MIN_VALUE) {
			System.out.println("there is no second smallest value in array");
		}else {
			System.out.println("Second smallest value is : "+second_smallest);
		}
	}
}
