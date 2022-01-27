package polymorphism;


	//inheritance is mandatory for run-time polymorphism
public class PolyB extends PolyA {
	
	void run(){
		System.out.println("running safely with 60km");
	}  

	public static void main(String[] args) {
		/*
		 * upcasting --> reference variable of Parent class refers to the object of Child class
		 * snytax --> ParentClass parentclassobject = new ChildClass();
		 */
		PolyA a = new PolyB();
		
		/* runtime polymorphism ----
		 * calling the run method by the reference variable of Parent class
		 * reference variable of Parent class refers to the subclass object 
		 * and subclass method overrides the Parent class method, 
		 * the subclass method is invoked at runtime
		 */
		a.run();	// run method of ParentClass is overridden by run method of ChildClass
		System.out.println(a.sendNumber(12));
	}
}
