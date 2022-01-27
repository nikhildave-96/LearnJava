package practice;

import java.util.Scanner;

public class ASCII {

	/*	ASCII value is a unique value assigned to numbers and alphabets
	 	ASCII - American Standard Code for Information Interchange
	 */

	public static void main(String[] args) {
	
	/*	
		char [] s = {'A','E','G'};
		for(int i =0;i<s.length;i++)
		{
			System.out.println(s[i]+" : "+(int)s[i]);
		}
		System.out.println("-------------------------");
		
		
		int[] num = {66,71,75,81,84};
		for (int j = 0;j<num.length;j++)
		{
			System.out.println(num[j]+" : "+(char)num[j]);
		}
		System.out.println("-------------------------");
		
		
		int[] numb = {78,73,75,72,73,76};
		for (int j = 0;j<numb.length;j++)
		{
			System.out.println(numb[j]+" : "+(char)numb[j]);
		}
		System.out.println("-------------------------");
		
		
		String sur = "DAVE";
	//	System.out.println(sur.length());
		char [] dst = new char [sur.length()];
		sur.getChars(0, sur.length(), dst, 0);
		for (int k =0;k<sur.length();k++)
		{
			System.out.println(dst[k]+" : "+(int)dst[k]);
		}
		System.out.println("-------------------------");
		
	*/	
		Scanner sc = new Scanner (System.in);
		System.out.println(" Please enter a string --- ");
		String str = sc.next();
//		if(str!=null) 
//		{
//			System.out.println("Please press Enter to proceed ");
//		}
//		else
//		{
//			System.out.println("Please enter a string");
//		}
		System.out.println("Entered string is : "+"'"+str+"'");
		char [] dst = new char [str.length()];
		str.getChars(0, str.length(), dst, 0);
		for (int k =0;k<str.length();k++)
		{
			System.out.println(dst[k]+" : "+(int)dst[k]);
		}
		System.out.println("-------------------------");
		
		
		
		
		
	}
}
