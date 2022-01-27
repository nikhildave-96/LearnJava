package javaArrays;

public class ArraySorting {

	public static void main(String[] args) {
		int [] a = {14,11,19,9,25,3}; 
		
		System.out.println("size is : "+a.length);
		
		int [] asc = ArraySorting.sortAsc(a);
		ArraySorting.printArray(asc);
		System.out.println();
		System.out.println("***************");
		int [] dsc = ArraySorting.sortDesc(a);
		ArraySorting.printArray(dsc);
	}

	//bubble sorting - Ascending
	public static int [] sortAsc(int []arr) {
		int temp;
		for(int i=0 ;i<arr.length;i++){
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					temp = arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		return arr;
	}
	
	//bubble sorting - Descending
	public static int [] sortDesc(int []arr) {
		int temp;
		for(int i=0 ;i<arr.length;i++){
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]<arr[j]) {
					temp = arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		return arr;
	}
	
	public static void printArray(int [] finalArr) {
		for (int i=0 ;i<finalArr.length;i++){
			System.out.print(finalArr[i]+" ");
		}
	}
}
