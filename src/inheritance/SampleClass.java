package inheritance;

import getterSetter.DemoLearn;

public class SampleClass extends DemoLearn{
	/*
	 * inheritance here is cross-package and hence we needed to import 
	 * DemoLearn class here to use its properties
	 */
	
	public static void main(String[] args) {
		SampleClass sc = new SampleClass();
		sc.setAge(18);
		System.out.println(sc.getAge());
	}
}
