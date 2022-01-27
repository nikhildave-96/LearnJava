package testing3;


public class TestNew {

	public static void main(String[] args) {
//		int i =10;
//		System.out.println(i*2);
		System.out.println(8>>2);	// --> 8/2*2
		System.out.println(8>>3);	// --> 8/2*3
		int ni = 1;
		System.out.println(ni+=1);
		
		int[] a = {1,0,0,1,1,0};
		
		int temp=0;
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]>a[j]) {
					temp =a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		
		for(int arr:a) {
			System.out.print(arr);
		}
		
		
		for(int k=0;k<a.length;k++){
			if(a[k]==0) {
			}
			else{
				
			}
			
		}
		
		
		byte m = 11;
		byte n = 3;
		System.out.println(m+=n);
//		byte r = m+n;
//		System.out.println(r);
		
		
//		short a=10;  
//		short b=10;  
//		//a+=b;//a=a+b internally so fine  
//		a=a+b;//Compile time error because 10+10=20 now int  
//		System.out.println(a);  
		
		
	}
}