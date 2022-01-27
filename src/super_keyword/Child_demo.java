package super_keyword;

public class Child_demo extends Parent_demo{
	
	/*  preference is always given to local class variable, methods when 'super' keyword is not used
	 	But for calling parent class properties/elements (variables, methods) 
	 	'super' keyword has to be used with a proper syntax as shown below
	 */
	
	String str = "child string";
	int x = 25;
	
	public void test()
	{
		System.out.println("child test method");
	}

	public Child_demo()
	{
		//super();    // not required as javac will place this automatically unless super is
					  // used to call constructor of parent class with some arguments
		/* calling parent class constructor >>>>>>  
			This should be the very first line inside child class constructor  
			If we do not explicitly call parent class constructor then too 
			compiler will automatically do that (compiler will call no args constructor 
			from parent class)
		*/
		super("nikhil");	//super must be first st inside a constructor
		System.out.println("child class constructor");
		super.test();                    //   super.methodname();
		System.out.println(str);
		System.out.println(super.str);			// super.variablename
		System.out.println(x);
		System.out.println(super.x);	// super.variablename
	}
	
	
	public static void main(String[] args) {
	Child_demo cd = new Child_demo();	
	cd.test();
	}
}
