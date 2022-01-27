package javaArrays;

public class ArraySecondLargest {
	/*
	 * sort the array in the ascending order
	 * second largest will be present at index :length-2
	 * length gives number of elements present in array
	 * index start with zero >> so always length = last index+1
	 */
	public static void main(String[] args) {
		int [] a = {4,11,15,27,-2,98,45}; 
		
		System.out.println("size is : "+a.length);
		//bubble sorting
		int temp;
		for(int i=0 ;i<a.length;i++){
			for(int j=i+1;j<a.length;j++) {
				if(a[i]>a[j]) {
					temp = a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		
		for(int arr:a) {
			System.out.print(arr+" ");
		}
		System.out.println();
		System.out.println("***************");
		
		System.out.println("Printing highest 3 values - ");
		System.out.println("The highest value of array is "+a[a.length-1]);
		System.out.println("The second highest value of array is "+a[a.length-2]);
		System.out.println("The third highest value of array is "+a[a.length-3]);
		
		System.out.println("**********************");
		
		System.out.println("Printing Lowest 3 values - ");
		System.out.println("The lowest value of array is "+a[0]);
		System.out.println("The second lowest value of array is "+a[1]);
		System.out.println("The third lowest value of array is "+a[2]);
	}
}
