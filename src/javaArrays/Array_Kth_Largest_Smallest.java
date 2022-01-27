package javaArrays;

public class Array_Kth_Largest_Smallest {
	/* For finding Kth smallest/largest element,
	 * array needs to be sorted in ascending/descending order.
	 * Kth largest would be element at k-1 index of the sorted array.
	 * Entire array need not be sorted for such programs. Sorting can be done
	 * only till required index and print K-1 index for Kth element.
	 */

	public static void main(String[] args) {
		int[] arr = {11,45,89,23,54,48,39,18,41,91,15,29};
		
		//find 3rd largest
		int temp;
		for(int i=0;i<3;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]<arr[j]) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.println("3rd largest element is "+arr[2]);
		
		int[] arr1 = {11,45,89,23,54,48,39,18,41,91,15,29};
		//find 3rd largest
		int temp1;
		for(int i=0;i<arr1.length;i++) {
			for(int j=i+1;j<arr1.length;j++) {
				if(arr1[i]<arr1[j]) {
					temp1=arr1[i];
					arr1[i]=arr1[j];
					arr1[j]=temp1;
				}
			}
			if(i==2) {
				System.out.println("3rd largest element is "+arr1[i]);
				break;
			}
		}
		
		
		int[] arr2 = {11,45,89,23,54,48,39,18,41,91,15,29};
		//find 5th smallest
		int k=5;
		int temp2;
		for(int i=0;i<arr2.length;i++) {
			for(int j=i+1;j<arr2.length;j++) {
				if(arr2[i]>arr2[j]) {
					temp2=arr2[i];
					arr2[i]=arr2[j];
					arr2[j]=temp2;
				}
			}
			if(i==k-1) {
				System.out.println("5th smallest element is "+arr2[i]);
				break;
			}
		}
		
	}
}
