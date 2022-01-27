package javaArrays;

public class OddEvenNumberInArray {

	public static void main(String[] args) {
		int[] a = {5,2,8,5,14,68,23,78,14,15,49};
		
		for(int i=0;i<a.length;i++) {
			if(a[i]%2==0) {
				System.out.println("element "+a[i]+" present at index "+i+" of array is EVEN number");
			}else {
				System.out.println("element "+a[i]+" present at index "+i+" of array is ODD number");
			}
		}
		
	}

}
