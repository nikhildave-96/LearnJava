package testing;

import testing2.SysOut;

public class TestingJava {
	String n = "nikhil";
	public static void main(String[] args) {
//		SysOut sys = new SysOut();
		System.out.println(SysOut.i);
		Parent p = new Child1();
		p.run();
		Child1 c = new Child1();
		c.run();
		Parent p1 = new Parent();
		p1.run();
	}

}
