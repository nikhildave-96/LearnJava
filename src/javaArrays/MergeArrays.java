package javaArrays;

public class MergeArrays {

	public static void main(String[] args) {
		int []a = {2,4,6,8,10,12,14};
		int []b = {1,3,5,7,9};
		int []c = {11,13,15};
		int size = a.length+b.length+c.length;
		int d[] = new int [size];
		
		System.arraycopy(a, 0, d, 0, a.length);
		System.arraycopy(b, 0, d, a.length, b.length);
		System.arraycopy(c, 0, d, (a.length+b.length), c.length);
		for(int arr:d) {
			System.out.print(arr+" ");
		}
	}

}
