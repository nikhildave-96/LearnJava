package inheritance;

public class GrandChildClass extends ChildClass{
	
	/* here GrandChildClass object is used to access properties of both the parent classes
	 * Multilevel inheritance is implemented here
	 * Multiple inheritance is not possible in java means :
	 * class C extends A,B --> illegal
	 * class C implements E,F --> E & F are interfaces here [implement is the important keyword to remember]
	 * interface G extends E,F --> possible and legal 
	 */

	public static void main(String[] args) {
		GrandChildClass gcc = new GrandChildClass();
		
		System.out.print(gcc.str + " since "+ gcc.exp+" years and has skills ");
		for (String string : gcc.skills) {
			System.out.print(string+", ");
		}
		System.out.println();
		System.out.println("He is strong in : "+gcc.expertise+" and firmly believes that "+gcc.additionalInfo );
	}
}
