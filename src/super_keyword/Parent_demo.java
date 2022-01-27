package super_keyword;

public class Parent_demo {
	
	String str = "parent string";
	
	protected int x = 35;
	
	protected void test()
	{
		System.out.println("parent test method");
	}

	public Parent_demo()
	{
		System.out.println("parent class constructor");
	}
	
	public Parent_demo(String s)
	{
		System.out.println(s);
	}
	
	public Parent_demo(int i)
	{
		System.out.println(i);
	}

	public static void main(String[] args) {
		
		
	}
}
