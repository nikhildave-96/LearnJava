package practice;

import javax.crypto.Cipher;
import javax.swing.text.html.CSS;

public class Constructors_1 {

	
	/*   - commenting below constructor while creating its object will throw error
		   as java compiler by default places a constructor unless we explicitly 
		   do not define one from our end
		 - We do not have to mandatorily define a constructor unless we need it to 
		   run some desired code when object creation occurs
	 */
	
	public Constructors_1 ()     
	{
		System.out.println("default const");
	}
	
	public Constructors_1 (int a,int b)
	{
		System.out.println("parameterized Integer const");
		int c = a+b;
		System.out.println(c);
	}
	
	public Constructors_1(String str) 
	{
		System.out.println("parameterized String const");
		System.out.println(str);
	}
	
	public void test()
	{
		System.out.println("Its a method");
	}
	
	
	public static void main(String[] args) {
		 
		Constructors_1 c1 = new Constructors_1();
		Constructors_1 c2 = new Constructors_1("hello world");
		Constructors_1 c3 = new Constructors_1(3,6)	;
		
		c2.test();
  }
}
