package javaArrays;

public class PrintPrimeNumberFromArray {

	public static void main(String[] args) {
		int[] a = {1,2,3,4,5,6,7,8,9};
		
		for(int i=0;i<a.length;i++) {	//loop for iterating through array
			int count=0;
			int temp = a[i];		//storing value at index i in temp variable
			for(int j=1;j<=temp;j++) {		//loop for each number of the range 
				if(temp%j==0) {		//finding if remainder of mod operation is zero
					count++;	// prime numbers will have 2 cases of zero remainder 
								// and if count is 2 then its a prime number
				}	
			}
			if(count==2) {
				System.out.println(a[i]+" is a prime number");
			}
		}
	}

}
