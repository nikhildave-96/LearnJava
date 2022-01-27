package polymorphism;

public class PolyA {
	
	/*
	 * sendMessage method is overloaded as they have same method name
	 * but different set of parameters
	 */
	public int sendNumber(int num) {
		return num + 11;
	}
	
	void run(){
		System.out.println("running");
	}  
	
	public static void sendMessage() {
		System.out.println("This is Poly A class message");
	}
	
	public static void sendMessage(String msg) {
		System.out.println("This is Poly A class message : "+msg);
	}
	
	public static void main(String[] args) {
		/*
		 * sendMessage method is overloaded - method overloading
		 * different parameters defined for method sendMessage  - compile time polymorphism
		 */
		sendMessage();
		sendMessage("you are in class A");
	}
}
