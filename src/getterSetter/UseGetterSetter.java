package getterSetter;

public class UseGetterSetter {

	public static void main(String[] args) {
		DemoLearn obj = new DemoLearn();
		System.out.println("Name : "+obj.name); 
		/*	name variable is protected so can be
		 *  accessed without any getter and also protected
		 *	means same package properties can be exchanged   
		 * 	Note : DemoLearn doesn't need to be imported here 
		 * 	because UseGetterSetter class & DemoLearn class
		 * 	are in same package
		 */
		
		// age is a private variable and hence we used getters and setters to access the same
		System.out.print("Age before editing was : "+obj.getAge());
		obj.setAge(26);
		System.out.print(" and after udating age was set to : "+obj.getAge());
		}

}
