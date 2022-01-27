package pom_concept_java;

public class C  {

		public static void main(String[] args) {
		/*
		 * creating object of class P in class C
		 */
		P p = new P();
		
		/*
		 * accessing non-static properties of class P using class P object 
		   and dot operator
		 */
		p.hello();
		System.out.println(p.text());
		System.out.println(p.number());
		p.test("nikhil", 25);
		
		/*
		 * accessing static properties of class P using classname and dot operator
		 */
		P.message();
		System.out.println(P.sum(-12, 18));
	}
}
