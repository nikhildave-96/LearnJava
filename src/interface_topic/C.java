package interface_topic;

public class C implements I{

	public static void main(String[] args) {
		
	C c = new C();
	c.name();
	c.age();
	c.state();
	c.number();
	c.pin();
	}
	/*
	 * All the methods of interface needs to be implemented mandatorily by the class
	 * which implements the interface
	 */
	/*
	 * @Override annotation is used to indicate that method declared under it
	 * is intended to override method declaration in a supertype
	 */
	
	@Override
	public void name() {
		System.out.println("nikhil");
	}

	@Override
	public void age() {
		System.out.println("22");
	}

	@Override
	public void state() {
		System.out.println("Maharashtra");
	}
	
	public void number()
	{
		System.out.println("9999991234");
	}

	public void pin()
	{
		System.out.println("411002");
	}
	
}
