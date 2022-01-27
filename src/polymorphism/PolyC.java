package polymorphism;

public class PolyC {
	public static void main(String[] args) {
		PolyA a = new PolyA();
		a.sendMessage();
		
		PolyB b = new PolyB();
		b.sendMessage();
	}
}
