package pom_concept_java;

public class P {

	public void  hello()
	{
		System.out.println("HELLO");
	}
	
	public String text()
	{
		return "string return method";
	}
	
	public int number()
	{
		return 75 ;
	}
	
	public void test(String name, int age)
	{
		System.out.println(name+" is "+age+" years old");
		
	}
	
	static void message() 
	{
		System.out.println("This is a method with message");
	}
	
	static String sum (int a,int b)
	{
		int c = a+b;
		return "Adding "+a +" and "+b+" gives result: "+c;
	}
}
