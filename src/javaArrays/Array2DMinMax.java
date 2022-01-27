package javaArrays;

import java.util.Scanner;

public class Array2DMinMax {
	static Scanner scanner;
	static int size,r,c;
	static int [][] userArray;
	
	public static void main(String[] args) {
		String userinput;
		
		System.out.println("Do you want square 2D array for storing elements? Y/N");
		scanner = new Scanner(System.in);
		userinput = scanner.nextLine();
		if(userinput.equalsIgnoreCase("Y")) {
			System.out.println("Please enter 2D array size :");
			size = scanner.nextInt();
		}else if(userinput.equalsIgnoreCase("N")){
			System.out.println("Please enter no of rows : ");
			r = scanner.nextInt();
			System.out.println("Please enter no of columns : ");
			c = scanner.nextInt();
		}else {
			System.out.println("Please enter Y or N to construct the array");
		}
		
		Array2DMinMax arrMinMax = new Array2DMinMax();
		if(size!=0) {
		userArray = arrMinMax.squareArray(size);
		arrMinMax.getMinArray(userArray);
		arrMinMax.getMaxArray(userArray);
		}else if(r!=0 && c!=0) {
		userArray = arrMinMax.rectangularArray(r, c);
		arrMinMax.getMinArray(userArray);
		arrMinMax.getMaxArray(userArray);
		}else {
		System.out.println("Array not constructed");	
		}
		
		scanner.close();
	}

	
	public int[][] squareArray(int arraySize) {
		int arr1[][] = new int [arraySize][arraySize];
		for(int m=0;m<arraySize;m++) {
			for(int n=0;n<arraySize;n++) {
			System.out.println("Enter element "+"["+m+","+n+"]"+" of square array: ");	
			arr1[m][n] = scanner.nextInt();
			}
		}
		return arr1;
	}
	
	public int[][] rectangularArray(int r,int c) {
		int arr2[][] = new int [r][c];
		for(int a=0;a<r;a++) {
			for(int b=0;b<c;b++) {
			System.out.println("Enter element "+"["+a+","+b+"]"+" of square array: ");	
			arr2[a][b] = scanner.nextInt();
			}
		}
		return arr2;
	}
	
	public void getMinArray(int [][]array) {
		int minVal = array[0][0];
		for(int x=0;x<array.length;x++) {
			for(int y=0;y<array[x].length;y++) {
				if(array[x][y]<minVal) {
					minVal = array[x][y];
				}
			}
		}
		System.out.println("minimum value of the array is :"+minVal);
	}
	
	public void getMaxArray(int [][]array) {
		int maxVal = array[0][0];
		for(int x=0;x<array.length;x++) {
			for(int y=0;y<array[x].length;y++) {
				if(array[x][y]>maxVal) {
					maxVal = array[x][y];
				}
			}
		}
		System.out.println("maximum value of the array is :"+maxVal);
	}
}
