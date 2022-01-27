package javaArrays;
import java.util.Arrays;


public class FindDuplicationCountArray {

	public static void main(String[] args) {
		int a [] = {1,3,5,7,9,3,5,3};
		
		int size = a.length;
		System.out.println("array size is :"+size);
		boolean visited [] = new boolean[size];
		//Fills the array by value provided
		Arrays.fill(visited,false);
		
		System.out.println("boolean array element values before :");
		for(boolean b :visited) {
			System.out.println(b);
		}
		
		System.out.println("*****************");
		for(int i=0;i<size;i++) {
			if(visited[i]==true) {
				//continue to next iteration of outer for loop as the element is already visited
				continue; 
			}
			
			int count = 1;
			for (int j=i+1;j<size;j++) {
				if(a[i]==a[j]) {
					visited[j]=true;
					count++;
				}
			}
			if(count>1) {
				System.out.println("element "+a[i]+" occurs "+count+" times");
			}
		}
		
		System.out.println("*****************");
		System.out.println("boolean array element values after :");
		for(boolean b :visited) {
			System.out.println(b);
		}
	}
}
