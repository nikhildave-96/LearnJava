package number_programs;

import java.util.Scanner;

public class SumOfDigits {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a positive number with 2 minimum digits to sum all its digits - ");
		int n = sc.nextInt();
		sc.close();
		
		int a,sum=0;
		while(n>0) {
			a = n%10;	//taking last digit by applying mod of 10
			sum = sum +a;	//adding last digit to sum
			n=n/10;	//ignoring last digit by dividing through 10
		}
		System.out.println(sum);
		
	}

}
