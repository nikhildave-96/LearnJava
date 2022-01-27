package practice;

import java.util.Scanner;

public class Palindromes {

	public static void main(String[] args) {
		
	String rev = "";	
		
	Scanner s = new Scanner(System.in);
	
	System.out.println("please enter a string - ");
	String str = s.next();
	s.close();
	System.out.println("the length of entered string is - "+str.length());
	for (int i =str.length()-1;i>=0;i--)
	{
		rev = rev + str.charAt(i);      
	}
	
	if (rev.equals(str))
	{
		System.out.println("Entered string was : "+str);
		System.out.println("reversed string is : "+rev);
		System.out.println("Reversed string is same as Entered string. Hence its a Palindrome case");
	}
	else
	{
		System.out.println("Entered string was : "+str);
		System.out.println("reversed string is : "+rev);
		System.out.println("Reversed string is not same as Entered string. Hence this isn't a Palindrome case");
	}
	
  }
}
