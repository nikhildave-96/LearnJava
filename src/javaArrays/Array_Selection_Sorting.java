package javaArrays;

public class Array_Selection_Sorting {

	public static void main(String[] args) {
		/*
		 * selection sort maintains sub-arrays
		 * left side is the sorted sub-array
		 * right side is the remaining un-sorted sub-array
		 * 
		 * selection sort compares the current value with entire right-side unsorted list
		 * to find element less than its own value [considering asc sort]
		 * 
		 * once that min value is found, index is captured 
		 * it again checks if there is any other lower value compared with min already found
		 * 
		 * if so then min is again updated with that index position and this goes on...
		 * 
		 * this is how min will hold the index position of least value compared to current value
		 * from right-side unsorted array
		 * 
		 * this min index position found is then used to swap current element with minimum value 
		 * element
		 */
		
		int[] a = {10,29,38,14,19,55,48,3,13};
		//selection sort - ascending
		int min, temp = 0;
		for(int i=0;i<a.length;i++) {		//loop for traversing through array
			min=i;
			for(int j=i+1;j<a.length;j++) {		//loop for comparing current with other values
				if (a[min]>a[j]) {		//comparison with other values of array
					min=j;		//capturing min value position/index
				}
			}
			temp = a[i];		//swapping values for sorting
			a[i] = a[min];
			a[min] = temp;
		}
		
		for(int ar:a) {
			System.out.print(ar+" ");
		}
		System.out.println();
		System.out.println("**************");
		
		
		//selection sort - descending
		int max;
		for(int i=0;i<a.length;i++) {
			max=i;
			for(int j=i+1;j<a.length;j++) {
				if (a[max]<a[j]) {
					max=j;
				}
			}
			temp = a[i];
			a[i] = a[max];
			a[max] = temp;
		}
				
		for(int ar:a) {
			System.out.print(ar+" ");
		}
		System.out.println();
		System.out.println("**************");
		
		
		
	}
}
