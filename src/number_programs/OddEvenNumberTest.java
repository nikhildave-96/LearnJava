package number_programs;

import java.util.Scanner;

public class OddEvenNumberTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to test whether odd or even - ");
		int a = sc.nextInt();
		sc.close();
		
		if(a%2==0) {
			System.out.println(a+" is an even number");
		}else {
			System.out.println(a+" is an odd number");
		}
		
		
	}

}
