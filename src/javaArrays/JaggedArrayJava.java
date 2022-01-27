package javaArrays;

public class JaggedArrayJava {

	public static void main(String[] args) {
	/*
	 * jagged array is an array with different no of columns
	 */
		
	int []a[] = new int [3][];
	a[0] = new int [3];
	a[1] = new int [4];
	a[2] = new int [5];
	
	int count =1;
	for(int i=0;i<a.length;i++) {
		for(int j=0;j<a[i].length;j++) {
			a[i][j] = count++;
		}
	}
	
	for(int i=0;i<a.length;i++) {
		for(int j=0;j<a[i].length;j++) {
			System.out.print(a[i][j]+" ");
		}
		System.out.println();
	}
	System.out.println("******************");
	
	//Jagged array can be declared,created & initialized in one single line
	int[][] b = {{10,20,30,40},{50,60},{70,80,90}};
	
	for(int i=0;i<b.length;i++) {
		for(int j=0;j<b[i].length;j++) {
			System.out.print(b[i][j]+" ");
		}
		System.out.println();
	}
	}
}
