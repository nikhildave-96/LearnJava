package javaArrays;

public class AddTwoArrays {
	
	public static void main(String[] args) {

		int []a = {2,4,6,8};
		int []b = {1,3,5,7};
		int size = a.length;
		
		//adding elements of 2 arrays
		int []c = new int[size];
		for(int i=0;i<size;i++) {
			c[i] = a[i]+b[i];
		}
		//iterating through array using for-each loop
		for(int j:c) {
			System.out.println(j);
		}
		
		//subtracting elements of 2 arrays
		int []d = new int[size];
		for(int i=0;i<size;i++) {
			d[i] = b[i]-a[i];
		}
		System.out.println("*************");
		for(int j:d) {
			System.out.println(j);
		}
		
		//multiplying elements of 2 arrays
		int []m = new int[size];
		for(int i=0;i<size;i++) {
			m[i] = b[i]*a[i];
		}
		System.out.println("*************");
		for(int j:m) {
			System.out.println(j);
		}
	}

}
