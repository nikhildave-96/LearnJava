package javaArrays;

import java.util.Scanner;

public class Array_Linear_Search {

	public static void main(String[] args) {
		
		int[] a = {32,14,67,23,78,45,67,56};
		String[] str = {"nikhil","divya","neha","khushal","rajeshree","prakash"};
		
		Scanner s  = new Scanner(System.in);
		System.out.println("Enter a number to find if present in array or not - ");
		int n = s.nextInt();
		
		Scanner s1  = new Scanner(System.in);
		System.out.println("Enter the name to find if present in array or not - ");
		String name = s1.nextLine();
		s.close();
		s1.close();
		
		boolean foundNum=false;
		for(int i =0;i<a.length;i++){
			if(a[i]==n){
				System.out.println("number "+"'"+n+"'"+" is present at index : "+i);
				foundNum = true;
			}
		}
		
		if(foundNum==false) {
			System.out.println("number "+"'"+n+"'"+" is not present in the array");
		}
		
		
		boolean foundName=false;
		for(int i =0;i<str.length;i++){
			if(str[i].equalsIgnoreCase(name)){
				System.out.println("name "+"'"+name+"'"+" is present at index : "+i);
				foundName = true;
			}
		}
		
		if(foundName==false) {
			System.out.println("name "+"'"+name+"'"+" is not present in the array");
		}
	}
}
