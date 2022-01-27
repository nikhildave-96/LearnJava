package javaArrays;

public class ArraySecondLargest2 {
	/*
	 * sort the array in the descending order
	 * second largest will be present at index :1
	 */
	public static void main(String[] args) {
		int [] a = {4,11,15,27,-2,98,45}; 
		
		int temp;
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]<a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
			
		}
		
		System.out.println("array sorted in descending order is -");
		for(int arr:a) {
			System.out.print(arr+" ");
		}
		
		System.out.println();
		System.out.println("second largest value of array is "+a[1]);
	}

}
