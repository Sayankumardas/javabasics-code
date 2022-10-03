package com.example.arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ArrayListMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//List<Integer> l = new List<>();-> will throw error because we cannot instantiate interfaces
		List<Integer> l = new ArrayList<>(); // we can initialize a parent object through a child object -> polymorphism
		
		
		/*
		 * Initializing ArrayList:
		 * 
		 * */
		
		//ArrayList<int> l = new ArrayList<>(); -> the data type should be a class
		ArrayList<String> string_list = new ArrayList<>();
		ArrayList<Character> char_list = new ArrayList<>();
		ArrayList<Boolean> bool_list = new ArrayList<>();
		ArrayList<Double> double_list = new ArrayList<>();
		ArrayList<Float> float_list = new ArrayList<>();
		ArrayList<Long> long_list = new ArrayList<>();
		
		
		/*Different elements*/
		ArrayList diff_list = new ArrayList();
		diff_list.add(1);
		diff_list.add("Hello");
		diff_list.add(false);
		
		System.out.println(diff_list); //it will print the list elements and not the address
		
		
		
		/*Same Elements-> both the declarations are fine*/
		ArrayList<Integer> integer_list1 = new ArrayList<>();
		ArrayList<Integer> integer_list2 = new ArrayList<Integer>();
		
		//Print size of arrayList
		System.out.println(integer_list1.size()+" "+integer_list2.size());
		
		
		ArrayList<Integer> integer_list3 = new ArrayList<>(5); //5 is the initial capacity not the size
		System.out.println(integer_list3.size());
		
		for(int i=1;i<=6;i++)
			integer_list3.add(i);
		
		System.out.println(integer_list3);
		
		
		/*Initializing list directly from an array*/
		Integer[] a = {1,2,3,4};
		
		List<Integer> integer_list4 = Arrays.asList(a);
		System.out.println(integer_list4);
		
		
		/*ArrayList Methods*/
		arrayListMethods();
		
		/*removeAll method another example*/
		removeAllExample();
	}
	
	
	private static void arrayListMethods() {
		
		List<Integer> list = new ArrayList<>();
		
		
		
		//Adding values
		list.add(1);
		list.add(2);
		list.add(3);
		System.out.println(list); //1,2,3
		
		//Adding values at a particular index
		list.add(0,34);
		System.out.println(list); //34,1,2,3
		list.add(2,45);
		System.out.println(list); //34,1,45,2,3
		
		//Adding a list to another list
		List<Integer> sample_list = createSampleList();
		
		list.addAll(sample_list);
		System.out.println(list);
		
		//to check if a list contains a particular value
		System.out.println(list.contains(100)+" "+list.contains(99));
		
		
		//removing elements at particular index
		list.remove(2);
		System.out.println(list);
		
		//sorting the list
		System.out.println("Before sorting in asc: "+list);
	//	Collections.sort(list);-> by default ascending order
	//	Collections.sort(list, Collections.reverseOrder()); //sort -> desc
	//	System.out.println("After sorting in desc: "+list);
		
		//removing multiple elements
		List<Integer> values = new ArrayList<>();
		values.addAll(Arrays.asList(new Integer[] {23,3,100,245}));
		list.removeAll(values);
		System.out.println(list);
		
		//retrieving element at particular index
		System.out.println("Element at index 3 : "+list.get(3));
		
		
		/*
		 * Iterating list:
		 * 
		 * 1) Loops
		 * 2) Iterator
		 * 
		 * */
		
		
		System.out.println("---------LOOPS------------");
		
		for(int i=0;i<list.size();i++) {
			System.out.print(list.get(i)+" ");
		}
		
		System.out.println();
		
		System.out.println("----------Iterator-------------");
		
		Iterator<Integer> it = list.listIterator();
		
		while(it.hasNext()) {
			System.out.print(it.next()+" ");
		}
		
		
		System.out.println();
		
		System.out.println("--------For Each Loop----------");
		
		for(Integer i:list) {
			System.out.print(i+" ");
		}
		
		System.out.println();
		
	}
	
	private static List<Integer> createSampleList(){
		
		List<Integer> sample = new ArrayList<>();
		sample.add(100);
		sample.add(101);
		sample.add(102);
		
		
		System.out.println(sample.containsAll(Arrays.asList(new Integer[] {1,2,100})));
		
		return sample;
		
	}
	
	
	private static void removeAllExample() {
		
		List<Integer> list = new ArrayList<>();
		list.addAll(Arrays.asList(new Integer[] {100,121,345,245,100,212,111,100}));
		System.out.println("list: "+list);
		
		List<Integer> values = new ArrayList<>();
		values.add(100);
		
		list.removeAll(values); //all the occurrences will get deleted
		System.out.println("List after removal: "+list);
		
	}

}
