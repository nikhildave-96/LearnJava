package javaArrays;


public class Array_2D_Traversing {

	public static void main(String[] args) {

		int[][] a = {{10,20,30,40},{50,60,70,80}};
		
		//for loop
		for(int r=0;r<a.length;r++) {
			for(int c=0;c<a[r].length;c++) {
				System.out.print(a[r][c]+" ");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("***********");
		
		//foreach loop
		for(int[] r:a) {
			for(int c:r) {
				System.out.print(c+" ");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("***********");
		
		//while loop
		int x=0,y=0;
		while(x<a.length) {
			y=0;
			while(y<a[x].length) {
				System.out.print(a[x][y]+" ");
				y++;
			}
			System.out.println();
			x++;
		}
		System.out.println();
		System.out.println("***********");
		
		//do-while loop
		int m=0,n=0;
		do{
			n=0;
			while(n<a[m].length) {
				System.out.print(a[m][n]+" ");
				n++;
			}
			System.out.println();
			m++;
		}while(m<a.length);
	}
}
