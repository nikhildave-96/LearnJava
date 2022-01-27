package practice;

import java.util.Scanner;

public class Return_types {
	
	static Return_types rt;
	static Scanner s = new Scanner(System.in);
	
	public Return_types()
	{
		System.out.println("first constructor is  called as soon as an object is created");
	}

	public static void main(String[] args) {
		
		rt = new Return_types();	//here we create object of class and call methods using the syntax >>>   classobjectname.methodname
		System.out.println(rt.add(2, 7));
		System.out.println(rt.words());
		System.out.println(rt.multiply());
		s.close();
	}

	
	public int add(int a, int b)
	{
		int c = a+b;
		return c;
	}
	
	public String words()
	{
		System.out.println("please enter one number - ");
		int a = s.nextInt();
		System.out.println("please enter another number - ");
		int b = s.nextInt();
		
		if(a<b)
		{
			System.out.println(a+" is smaller than "+b);
		}
		else if(a>b)
		{
			System.out.println(b+" is smaller than "+a);
		}
		
		return ("number "+a+" and "+b+" were compared as above");				//return st for a method should be at very end of that method 
	}
	
	public int multiply()
	{
		System.out.println("please enter one number - ");
		int a = s.nextInt();
		System.out.println("please enter another number - ");
		int b = s.nextInt();
		
		int c = a*b;
		System.out.println("the result of multiplication of above entered numbers is : ");
		return c;
	}
	
}
