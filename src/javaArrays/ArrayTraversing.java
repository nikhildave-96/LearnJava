package javaArrays;

public class ArrayTraversing {

	public static void main(String[] args) {
		int[] arr = new int[] {10,20,30,40,50} ;
		
		//for loop
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		System.out.println("******************");
		
		//foreach loop
		for(int j : arr) {
			System.out.print(j+" ");
		}
		System.out.println();
		System.out.println("******************");
		
		//while loop
		int k=0;
		while(k<arr.length) {
			System.out.print(arr[k]+" ");
			k++;
		}
		System.out.println();
		System.out.println("******************");
		
		//do-while loop
		int p=0;
		do{
			System.out.print(arr[p]+" ");
			p++;
		}while(p<arr.length);
		
		
	}

}
