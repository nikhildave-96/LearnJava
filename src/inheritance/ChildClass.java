package inheritance;

public class ChildClass extends ParentClass {
	
	String expertise = "Software Testing";
	String additionalInfo = "Testing is an Art and not god-gifted";
	/* here ChildClass object is used to access parent class properties
	 * Simple inheritance is implemented here
	 * syntax for inheritance is : childclass extends parentclass
	 */
	public static void main(String[] args) {
		ChildClass cc = new ChildClass();
		
		System.out.print(cc.str + " since "+ cc.exp+" years and has skills ");
		for (String string : cc.skills) {
			System.out.print(string+", ");
		}
	}


}
