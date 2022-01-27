package accessModifersJava;

import getterSetter.DemoLearn;

public class A {
	String message ="Nikhil is programming now";
	
	int year = 1996;

	protected float exp = 2.6f;
	
	public static void main(String[] args) {
		DemoLearn dl = new DemoLearn();
		/*
		 * name is though a protected variable in DemoLearn class
		 * getter helps us read value of name
		 * Note : DemoLearn has to be imported here because A class & DemoLearn class
		 * are in different packages
		 */
		System.out.println(dl.getName());
	}
}
