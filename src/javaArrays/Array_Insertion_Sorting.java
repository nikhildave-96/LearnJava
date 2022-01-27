package javaArrays;

public class Array_Insertion_Sorting {
	/*	In this algorithm, we insert each element onto its proper 
	 *  place in the sorted array.
	 *  To sort an array of size n in ascending order: 
		1: Iterate from arr[1] to arr[n] over the array. 
		2: Compare the current element (key) to its predecessor. 
		3: If the key element is smaller than its predecessor, 
		compare it to the elements before. 
		Move the greater elements one position up to make space 
		for the swapped element.
	 */
	public static void main(String[] args) {

		int[] a = {22,35,12,65,26,89,48,17,23};
		
		int temp,j;
		for(int i=1;i<a.length;i++) {
			temp = a[i];
			j=i;
			while(j>0 && a[j-1]>temp) {
				a[j]=a[j-1];
				j=j-1;
			}
			a[j]=temp;
		}
		
		for(int arr:a) {
			System.out.print(arr+" ");
		}
	}

}
