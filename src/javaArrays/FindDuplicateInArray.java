package javaArrays;

import java.util.HashSet;
import java.util.Hashtable;
import java.util.Map;
import java.util.Set;

public class FindDuplicateInArray {

	
	public static void main(String[] args) {
	//array can store duplicate elements
	int a[] = {1,3,5,7,3,9,5,1,3};
	
	/*
	 * Brute Force Method - 
	 * Provides accurate results when element is repeated only once in the array
	 * Time consuming and inefficient method
	 */
	System.out.println("Duplicate elements of the array are :");
	for(int i=0;i<a.length-1;i++) {		//always use length-1 to avoid arrayIndexOutOfBoundException
		for(int j=i+1;j<a.length;j++) {
			if(a[i]==a[j] && i!=j) {
				System.out.print(a[j]+" ");
			}
		}
	}
	System.out.println();
	System.out.println("************");
	
	/*
	 * Set Interface Method - 
	 * Set only consists of unique elements
	 * Set .add method returns boolean return type 
	 * true when element gets added and false when element does not get added
	 * Provides accurate results when element is repeated only once in the array
	 */
	boolean b;
	Set<Integer> s = new HashSet<>();
	System.out.println("Duplicate elements of the array are :");
	for(int i:a) {
		b=s.add(i);
		if(b==false) {
			System.out.print(i+" ");
		}
	}
	System.out.println();
	System.out.println("************");
}
}
