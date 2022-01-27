package ClassesAndObjects;

public class DemoClass {
	
	/*
	 * static members of a class does not require class object reference for accessing them
	 * as below
	 */
	
	/*
	 * non static members of a class requires class object reference for accessing them
	 * as below
	 */
	int date = 9;
	static int month = 12;
	
	public void messageName() {
		System.out.println("printing a message");
	}
	
	public static void messageNewName() {
		System.out.println("printing a static message");
	}
	public static void main(String[] args) {
		DemoClass pa = new DemoClass();
		
		pa.messageName();
		messageNewName();
		
		System.out.println(month);
		System.out.println(pa.date);
	}
}
