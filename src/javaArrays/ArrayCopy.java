package javaArrays;

public class ArrayCopy {

	public static void main(String[] args) {

	char[] ar1 = {'u','n','s','u','c','c','e','s','s','f','u','l','l'};	
	
	char[] ar2 = new char[7];
	char[] ar3 = new char[4];
	char[] ar4 = new char[ar1.length];
	//partial copy of array
	System.arraycopy(ar1, 2, ar2, 0, 7);
	System.arraycopy(ar1, 9, ar3, 0, 4);
	//full copy 
	System.arraycopy(ar1, 0, ar4, 0, ar1.length);
	
	
	for(char c:ar2) {
		System.out.print(c);
	}
	
	System.out.println();
	for(char c:ar3) {
		System.out.print(c);
	}
	System.out.println();
	for(char c:ar4) {
		System.out.print(c);
	}
	
	}
}
