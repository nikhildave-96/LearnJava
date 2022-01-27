package javaArrays;

public class Array_Bubble_Sorting {

	public static void main(String[] args) {
		/*
		 * highest value[considering asc sort] is put at last index position 
		 * in a round/iteration
		 * for round 1 - last position is highest number
		 * for round 2 - second highest number is second highest number 
		 * for round 3 - third highest number is third highest number
		 * 
		 * for round n --> last n-1 numbers can be neglected for
		 * comparison to improve efficiency
		 * 
		 * for array with length n --> n-1 rounds will be required for completely
		 * sorting the array
		 */
		
		int[] a = {20,25,18,7};
		//bubble sort - ascending
		for(int i=0;i<a.length;i++) {	//loop for traversing through array
			int temp=0;
			for(int j=0;j<a.length-1;j++) {		//loop for comparing adjacent values
				if(a[j]>a[j+1]) {		//comparison of adjacent values of array
					temp = a[j];	//swapping values for sorting
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		for(int arr:a) {
			System.out.print(arr+" ");
		}
		System.out.println();
		System.out.println("************");
		
		//bubble sort - descending
		for(int i=0;i<a.length;i++) {	//loop for traversing through array
			int temp=0;
			for(int j=0;j<a.length-1;j++) {		//loop for comparing adjacent values
					if(a[j]<a[j+1]) {		//comparison of adjacent values of array
							temp = a[j];	//swapping values for sorting
							a[j]=a[j+1];
							a[j+1]=temp;
					}
			}
		}
		for(int arr:a) {
			System.out.print(arr+" ");
		}
		System.out.println();
		System.out.println("************");
		
		
		//bubble sort - ascending --> enhanced for reduced time of execution
		int[] b = {14,25,79,35,10,56,4,19,12};
		for(int i=0;i<b.length;i++) {	//loop for traversing through array
			int temp=0;
			for(int j=0;j<b.length-1-i;j++) {		//loop for comparing adjacent values
				if(b[j]>b[j+1]) {		//comparison of adjacent values of array
					temp = b[j];	//swapping values for sorting
					b[j]=b[j+1];
					b[j+1]=temp;
				}
			}
		}
		for(int arr:b) {
			System.out.print(arr+" ");
		}
	}

}
