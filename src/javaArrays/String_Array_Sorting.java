package javaArrays;

public class String_Array_Sorting {
	/*
	 * The compareTo() method compares two strings lexicographically.
	   The comparison is based on the Unicode value of each character 
	   in the strings.
	   An int value: 0 if the string is equal to the other string.
					< 0 if the string is lexicographically less than the other string
					> 0 if the string is lexicographically greater than 
					the other string (more characters)
	 */

	public static void main(String[] args) {
		String[] a = {"nikhil","divya","khushal","nehal","rajeshree","prakash"};
		
		//bubble sorting [ascending]
		String temp;
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a.length-1-i;j++) {
				if(a[j].compareTo(a[j+1])>0) {	
					temp=a[j];
					a[j] = a[j+1];
					a[j+1]=temp;
				}
			}
		}
		for(String s:a) {
			System.out.print(s+" ");
		}
		System.out.println();
		System.out.println("************");
		
		
		//bubble sorting [descending]
		String temp1;
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a.length-1-i;j++) {
					if(a[j].compareTo(a[j+1])<0) {	
						temp1=a[j];
						a[j] = a[j+1];
						a[j+1]=temp1;
					}
			}
		}
		for(String s:a) {
			System.out.print(s+" ");
		}
		System.out.println();
		System.out.println("************");
		
		
		//selection sort [ascending]
		String temp2;
		int min;
		for(int i=0;i<a.length;i++) {
			min=i;
			for(int j=i+1;j<a.length;j++) {
				if(a[j].compareTo(a[min])<0) {
					min=j;
				}
			}
			temp2=a[i];
			a[i]=a[min];
			a[min]=temp2;
		}
		for(String s:a) {
			System.out.print(s+" ");
		}
		System.out.println();
		System.out.println("************");
		
		
		//selection sort [descending]
		String temp3;
		int min1;
		for(int i=0;i<a.length;i++) {
			min1=i;
			for(int j=i+1;j<a.length;j++) {
				if(a[j].compareTo(a[min1])>0) {
					min1=j;
				}
			}
			temp3=a[i];
			a[i]=a[min1];
			a[min1]=temp3;
		}
		for(String s:a) {
			System.out.print(s+" ");
		}
		
	}
}
