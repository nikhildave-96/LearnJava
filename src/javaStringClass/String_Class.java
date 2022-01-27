package javaStringClass;

public class String_Class {

	public static void main(String[] args) {
		
		String str = new String();
		
		str = "Hello 96 World";
		
		System.out.println(str.toLowerCase());
		
		System.out.println(str.toUpperCase());
		
		System.out.println(str.charAt(9));
		
		for (int i = 9 ; i<14; i++)
		{
			System.out.println(str.charAt(i));
		}
		
		System.out.println(str.indexOf("r"));
		
		System.out.println(str.indexOf("6"));
		
		System.out.println(str.substring(6, 8));
		
		System.out.println(str.substring(6));
		
		System.out.println(str.concat(" !! Welcome"));  //adds one string to other 
		
		System.out.println(str.concat(" !! Welcome").toUpperCase());
		
	}
}
