package javaStringClass;

import java.util.Scanner;

public class String_reverse {

	public static void main(String[] args) {
		
		String rev = "";	
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("please enter a string - ");
		String str = s.next();
		s.close();
		System.out.println("the length of entered string is - "+str.length());
		for (int i =str.length()-1;i>=0;i--)  //index starts from '0'. Hence cannot take 'i' as str.length
		{
			rev = rev + str.charAt(i);   // 'i' if taken as str.length then it will fetch char at index 5 which is actually not present, thus throwing indexoutofboundexception
		}	
		System.out.println("Entered string was : "+str);
		System.out.println("reversed string is : "+rev);
		
	}

}
