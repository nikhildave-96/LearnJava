package testing2;

import testing.Parent;

public class Child extends Parent{
	public  void message(){
		System.out.println("this is child message");
	}
	public static final void main(String[] args) {
		Child c= new Child();
		c.message();
		Parent  p =new Child();
		p.message();
		Parent p1 = new Parent();
		p1.message();
	}
}
