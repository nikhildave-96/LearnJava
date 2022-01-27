package javaArrays;

public class AddArrayElements {

	public static void main(String[] args) {
		
		int[] a = {10,20,30,40,50};
		int sum=0;
		for(int i:a) {
			sum=sum+i;
		}
		System.out.println("The sum of array elements is: "+sum);
		
		System.out.println("The mean of array is "+(sum/a.length));
		
		int mul=1;
		for(int i:a) {
			mul=mul*i;
		}
		System.out.println("The multiplication of array elements is: "+mul);
	}

}
