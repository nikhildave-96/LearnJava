package number_programs;

import java.util.ArrayList;
import java.util.Scanner;

public class DivisorsOfNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to find its perfect divisors - ");
		int n = sc.nextInt();
		sc.close();
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		for(int i=1;i<n;i++) {
			if(n%i==0 && i!=1) {	//perfect divisors will have 0 as remainder after modulus operation
				al.add(i);		//adding divisors to arraylist
			}
		}
	
		System.out.print("Perfect divisors of "+n+" excluding 1 & "+n+" are - ");
		for(int a:al) {
			System.out.print(a+", ");
		}
		
	}

}
