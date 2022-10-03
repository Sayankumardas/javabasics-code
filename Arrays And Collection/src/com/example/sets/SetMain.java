package com.example.sets;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import com.example.arrays.ArraysMain;

public class SetMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//Set<Integer> sample_set = new Set<>();-> cannot instantiate an interface
		
	//	Set<Integer> sample_set = new HashSet<>(); -> this is allowed
		
		
		
		HashSet<Integer> hash_set = new HashSet<>();
		LinkedHashSet<Integer> linked_hash_set = new LinkedHashSet<>();
		TreeSet<Integer> tree_set = new TreeSet<>();
		
		
		
		//Adding elements:
		hash_set.add(1);
		linked_hash_set.add(1);
		tree_set.add(1);
		System.out.println(hash_set); //toString() is already implemented internally, so directly values will get printed
		
		
		//Adding multiple elements:
		List<Integer> values = Arrays.asList(new Integer[] {17,2,34,12,67,89,123});
		
		/*
		 * set -> 1,17,2,34,12,67,89,123
		 * */
		
		hash_set.addAll(values);
		linked_hash_set.addAll(values);
		tree_set.addAll(values);
		
		System.out.println("HashSet: "+hash_set);
		System.out.println("Linked hash Set: "+linked_hash_set);
		System.out.println("Tree Set: "+tree_set);
		
		/*we cannot access sets based on index i.e. we cannot do hash_set.get(0) but we can do list.get(0)
		 * 
		 * 
		 * 
		 * List -> [1,2,3,4,5] -> List.get(0) -> 1
		 * Set -> [1,2,3,4,5] -> Set.get(0) -> error because there is no .get() method in sets
		 * 
		 * */
		
		
		/*Set Methods Example*/
		setMethodsExample();
		
		/*sets duplicate values*/
		setDuplicateValuesExample();
		
		/*sets Object Example*/
		setStudentObjectExample();
	}
	
	private static void setMethodsExample() {
		
		
		Set<Integer> set = new HashSet<>();
		set.addAll(Arrays.asList(new Integer[] {1,17,2,34,12,67,89,123}));
		
		//contains- check whether the value is present in the set or not
		System.out.println(set.contains(17)+" "+set.contains(66));
		
		//containsAll -> checking all the values -> it will return true when all the values in the list are there otherwise it will return false
		System.out.println(set.containsAll(Arrays.asList(new Integer[] {1,2,3,4,5})));
		System.out.println(set.containsAll(Arrays.asList(new Integer[] {1,2})));
		
		//size of the set
		System.out.println("Set size: "+set.size());
		
		//remove an element
		set.remove(67);
		System.out.println(set);
		
		//remove multiple elements
		List<Integer> values = new ArrayList<>();
		values.addAll(Arrays.asList(new Integer[] {1,2,3,4,5}));
		set.removeAll(values);
		System.out.println(set);
		
		//to check if set is empty:
		Set<String> empty_set = new HashSet<>();
		
		System.out.println((empty_set.size()==0));
		System.out.println(empty_set.isEmpty());
		
		//converting set to array
		Object[] obj = set.toArray(); // return Object[]
		int[] a = new int[obj.length];
		
		for(int i=0;i<a.length;i++) {
			a[i] = (int)obj[i];
		}
		ArraysMain.printArray(a);
		
		//Iterating the set
		
		//We cannot use for-loop -> we cannot access sets based on index 
		
		System.out.println("---------Iterator-------------");
		
		Iterator<Integer> it = set.iterator();
		
		while(it.hasNext()) {
			System.out.print(it.next()+" ");
		}
		System.out.println();
		
		System.out.println("----------For Each Loop----------");
		
		for(Integer i:set) {
			System.out.print(i+" ");
		}
		System.out.println();
		
		
		//removing all the data in the set
		set.clear();
		System.out.println(set.isEmpty()+" "+set);

		
		
	}
	
	private static void setDuplicateValuesExample() {
		
		
		Set<Integer> set = new HashSet<>();
		set.addAll(Arrays.asList(new Integer[] {1,1,1,1,1,3,4,5,6,7,8,1,9}));
		
		System.out.println("setDuplicateValuesExample "+set);
		
		
	}
	
	private static void setStudentObjectExample() {
		
		System.out.println("-----------Student Example---------");
		System.out.println();
		
		Set<Student> set = new LinkedHashSet<>();
		
		
		Student s1 = new Student();
		s1.setName("James");
		s1.setAge(15);
		s1.setSchool("DPS");
		
		Student s2 = new Student();
		s2.setName("Jacob");
		s2.setAge(15);
		s2.setSchool("DPS");
		
		Student s3 = new Student();
		s3.setName("Maya");
		s3.setAge(15);
		s3.setSchool("KV");
		
		Student s4 = new Student();
		s4.setName("Maya");
		s4.setAge(15);
		s4.setSchool("KV");
		
		Student s5 = s2;
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
		System.out.println(s5);
		
		set.addAll(Arrays.asList(new Student[] {s1,s2,s3,s4,s5})); //s5 will not get added
		
		System.out.println(set);
		
		
		
		
	}

}
