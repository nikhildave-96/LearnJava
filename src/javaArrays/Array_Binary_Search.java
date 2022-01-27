package javaArrays;


public class Array_Binary_Search {
	/*
	 * array should be mandatorily sorted for performing binary search
	 */
	public static void main(String[] args) {
		int[] a = new int[] {4,7,1,9,3,8,2,6};
		
		//bubble sort - ascending
		int temp;
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]>a[j]){
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.println("New sorted array is ");
		for(int arr:a) {
			System.out.print(arr+" ");
		}
		System.out.println();
		System.out.println("*******************");
		
		//binary search
		int li=0,hi=a.length-1,mi=(li+hi)/2,item=5;
		while(li<=hi) {
		if(a[mi]==item) {
			System.out.println("element "+item+" is present at index "+mi);
			break;
		}else if(a[mi]>item) {
			hi=mi-1;
		}else {
			li=mi+1;
		}
		mi=(li+hi)/2;
		}
		
		if(li>hi) {
			System.out.println("Element not found in the array");
		}
	}
}
