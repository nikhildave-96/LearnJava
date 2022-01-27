package number_programs;

import java.util.ArrayList;
import java.util.Scanner;

public class NPrimeNumbers {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter number uptil which prime numbers are to be found out - ");
		int range = s.nextInt();
		s.close();
		ArrayList<Integer> arr = new ArrayList<Integer>();
		
		int count;
		for(int i=1;i<=range;i++) {		//loop traversing uptil range provided
			count = 0;
			for(int j=1;j<=i;j++) {		//loop for each number of the range  
				if(i%j==0) {		//finding the remainder using modulus operator
					count++;		// prime numbers will have count as 2 as they are 
									// divisible by 1 and by own only and will have 0 remainder
				}
			}
			if(count==2) {
				arr.add(i);		//adding prime numbers to arraylist
			}
		}
		
		for(int a:arr) {		//printing elements captured in arraylist
			System.out.print(a+" ");
		}
		
		
	}

}
