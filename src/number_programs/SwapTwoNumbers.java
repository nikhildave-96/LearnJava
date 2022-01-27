package number_programs;

import java.util.Scanner;

public class SwapTwoNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter two numbers to be swapped");
		
		int a,b;
		a = sc.nextInt();
		b = sc.nextInt();
		sc.close();
		System.out.println("Entered numbers are a = "+a+" and b = "+b);
		
		int temp;
		temp = a;	//a is stored in temp variable
		a=b;	//a is assigned the value of b
		b=temp;		//b is assigned the value of a which holds the original value of a 
		
		System.out.println("After swapping numbers are a = "+a+" and b = "+b);
	}

}
