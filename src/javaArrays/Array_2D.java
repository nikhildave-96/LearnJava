package javaArrays;

public class Array_2D {

	public static void main(String[] args) {
		
	//syntax 1  >>>>>> int a[][] = new int [no of rows][no of columns]
	//syntax 2 >>>>>> int h[][] = {{full row 1},{full row 2}}	
/*
 * row count = column count --> 2D square matrix array
 * row count != column count --> 2D matrix array
 * column count(row 1) != column count(row 2) --> 2D jagged array		
 */
	int d[][] = new int[2][2];  // declaring 2D array 'd' with 2 rows and 2 columns by allocating memory to it using 'new' keyword
	d[0][0] = 4;
	d[0][1] = 7;
	d[1][0] = 3;
	d[1][1] = 9;
	System.out.println(d[1][0]);
	
	int a [][] = {{1,4,7},{2,5,8},{3,6,9}}; 
	/* array a is 3*3 array having dynamic memory allocation   >>>> same as 1 4 7
															                2 5 8
																		    3 6 9
    */
	System.out.println(a[0][1]);
	System.out.println(a[2][1]);
	System.out.println("************");
	
	//Reading data from 2D array
	for (int r = 0; r<3;r++) //for loop for iterating through rows
	{
		for(int c = 0 ; c<3;c++)  //for loop for iterating through columns
		{
			System.out.print(a[r][c]+ " "); 
		}
		System.out.println();
	}

	
	int [][] b = {{4,2,8,5,1},{3,9,1,7,5},{2,4,3,8,9}};
	int rowCount = b.length;
	int colCount = b[rowCount-1].length;
	System.out.println("Array b has "+rowCount+" rows and "+colCount+" columns");
  }
}
