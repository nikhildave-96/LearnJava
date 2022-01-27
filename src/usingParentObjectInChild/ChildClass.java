package usingParentObjectInChild;

public class ChildClass {
	/* here parent class object is created under child class to access parent class properties
	 * inheritance is not implemented here
	 * import is not used as both classes are in same package
	 * import is only required while accessing classes across different packages
	 */
public static void main(String[] args) {
	ParentClass pc = new ParentClass();
	System.out.println(pc.str);
	System.out.println(pc.exp);
	for (String stringiterator : pc.skills) {
		System.out.println(" - " +stringiterator);
	}
}
}
