package javaArrays;

public class Array_1D {

	public static void main(String[] args) {
	//declaration,creation	
	int [] a = new int[4]; //declaring array and allocating memory to it using 'new' keyword
	
	//declaration,creation	& initialization in one single line
	int [] b = {4,9,3,7,2};  //dynamic memory allocation to array b is occurring
	
	System.out.println("size is : "+b.length);
	for (int i=0 ;i<b.length;i++){
		System.out.println(b[i]);
	}
	
	//Declaration
	int[] c;
	//Creation
	c= new int[3];
	//initialization
	c[0] = 10;
	c[1] = 20;
	c[2] = 30;
	
	System.out.println("size is : "+c.length);
	for (int i=0 ;i<c.length;i++){
		System.out.print(c[i]+" ");
	}
	System.out.println();
	
	//declaration,creation	& initialization in one single line
	int[] d = new int[] {11,21,31,41};
	for(int fe:d) {
		System.out.print(fe+",");
	}
}
}
