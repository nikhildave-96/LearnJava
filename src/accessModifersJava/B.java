package accessModifersJava;

public class B {
public static void main(String[] args) {
	A a = new A();
	System.out.println(a.message);
	System.out.println(a.year);
	System.out.println(a.exp);
	
	/*
	 * name from DemoLearn cannot be used here as name is declared as 
	 * protected variable in DemoLearn class
	 */
}
}
