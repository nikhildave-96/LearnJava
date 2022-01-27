package javaMath;
import java.util.Scanner;

public class AddTwoNumbers {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Number 1 is : ");		
		int a = scanner.nextInt();
		System.out.println("Number 2 is : ");	
		int b = scanner.nextInt();
		int c = a+b;
		System.out.println("addition is : "+c);
		
	}
}
