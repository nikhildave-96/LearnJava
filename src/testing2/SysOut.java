package testing2;

public  class SysOut {

	public SysOut() {
		
	} 
	
	static int factorial(int n){      
          if (n == 1)      
            return 1;      
          else      
            return(n * factorial(n-1));      
    }
	public static boolean i;
	public static void main(String[] args) {
		System.out.println('g'+'i'+'t');
		System.out.println("g"+"i"+"t");
		System.out.println('g'+'i');
		System.out.println(i);
		double d = 5/2d;
		System.out.println(d);
		System.out.println("Factorial of 3 is: "+factorial(3));
	}
}
