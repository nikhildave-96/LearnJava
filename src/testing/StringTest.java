package testing;

public class StringTest {
	
	static String s;
	
	public static void main(String[] args) {
		s = "nikhil";
		System.out.println(s);
		s = "dave";
		System.out.println(s);
		
		String s1 = "test";
		String s2 = "test";
		String s3= new String("test");
		String s4 = new String("test");
		System.out.println(s1.equals(s2));
		System.out.println(s1==s2);
		System.out.println(s1.equals(s3));
		System.out.println(s1==s3);
		System.out.println(s3.equals(s4));
		System.out.println(s3==s4);
		
		String s5 = "nikhil";
		String s6 = "dave";
		System.out.println(s6.compareTo(s5));
		System.out.println(s5.compareTo(s6));
		
		System.out.println(10+20+"nikhil"+10+20);
		System.out.println(10+20+"nikhil"+(10-20));
		System.out.println(10+20+"nikhil"+10*20);
		System.out.println(10+20+"nikhil"+20/10);
		
	}
}
