package com.example.arrays;

public class ArraysMain {

	public static void main(String[] args) {
		
		/*array declaration
		 * 
		 * 
		 * 1) <<data-type>>[] <<array-name>> =  new <<data-type>>[<<size>>];
		 * 2) <<data-type>>[] <<array-name>> = {<<val1>>,<<val2>>-----}
		 * 
		 * */
		
		//we can convert-> int to Integer and vice-versa but not int[] to Integer[] and viceversa 
		
		/*Ways to Initialize Arrays*/
		int[] a = new int[5]; //we have only initialized the array and not inserted any value in it -> default 0
		int[] b = {1,2,3,4,5,6};
		Integer[] c = new Integer[5]; //we have only initialized the array and not inserted any value in it -> default null
		
		System.out.println("Arrays Lengths: "+a.length+" "+b.length);
		
		
		System.out.println(a); //Address will get printed , therefore we need to write a separate method
		System.out.println(b[0]); //indexing in arrays start from 0, b[0] -> 1st element of the array
		
	//	printArray(a);
	//	printArray(b);
	//	printArray(c);
		
		
	// 	Inserting values in arrays
	    
		a[0] = 5;
	
		printArray(a);
		
		for(int i=0;i<a.length;i++) {
			a[i] = i+10;
		}
		
		printArray(a);
		
		
		for(int i:a) {
			System.out.print(i+" ");
		}

	}
	
	
	public static void printArray(int[] arr) {
		
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		
	}
	//Method-overloading -> same method name but different arguments
	private static void printArray(Integer[] arr) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	private static String printArray(String[] arr) {
		return "";
	}
	private static String printArray(int[] arr, String s) {
		return "";
	}

}
