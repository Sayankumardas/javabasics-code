package com.example.maps;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class MapMain {
	
	public static void main(String[] args) {
		
		/*Maps Initialization*/
		
	//	Map<Integer, Integer> sample_map = new Map<>(); //because we cannot instantiate an interface
		
		Map<Integer, String> int_string_map = new HashMap<>();
		Map<String, List<Integer>> string_list_map = new HashMap<>();
		Map<Integer, Integer> int_int_map = new HashMap<>();
		
		/*Types of maps*/
		Map<Integer, String> hash_map = new HashMap<>();
		Map<Integer, String> linked_hash_map = new LinkedHashMap<>();
		Map<Integer, String> tree_map = new TreeMap<>();
		
		/*Inserting Values*/
		insertValuesInMaps(hash_map);
		insertValuesInMaps(linked_hash_map);
		insertValuesInMaps(tree_map);
		
		System.out.println(hash_map);
		System.out.println(linked_hash_map);
		System.out.println(tree_map);
		
		mapsMethodsExample();
		handlingDuplicates();
		handlingQueries();
		
		
	}
	
	
	private static void insertValuesInMaps(Map<Integer,String> map) {
		
		map.put(1, "James");
		map.put(4, "Kapil");
		map.put(3, "Maya");
		map.put(5, "Ritu");
		map.put(2, "Jacob");
		map.put(6, "Prateek");
		
	}
	
	private static void mapsMethodsExample() {
		
		System.out.println("---------mapsMethodsExample-------------");
		
		Map<Integer, String> map = new HashMap<>();
		insertValuesInMaps(map);
		
		
		System.out.println(map);
		
		/*Contains*/
		System.out.println(map.containsKey(1)+" "+map.containsKey(7));
		System.out.println(map.containsValue("James")+" "+map.containsValue("Maya"));
		
		
		/*Retrieving Value
		 * 
		 * We can retrieve values using the keys only, we cannot directly access the values
		 * 
		 * */
		
		System.out.println(map.get(1)+" "+map.get(5)+" "+map.get(7));
		
		/*Retrieving all the keys*/
		Set<Integer> set = map.keySet();
		System.out.println(set);
		
		/*Printing the map size*/
		System.out.println(map.size()); //print the number of keys
		
		/*Retrieving all the values*/
		String map_values = map.values().toString();
		System.out.println(map_values);
		
		
		/*converting map to set*/
		System.out.println(map);
		System.out.println(map.entrySet());
		
		
		/*Iterating the Maps*/
		
		//there is not index based access, but we have key-based access
		
		System.out.println("------------For Each Loop------------");
		
		for(Integer i:map.keySet()) {
			System.out.print(i+" "+map.get(i)+" ");
		}
		System.out.println();
		
		
	}
	
	private static void handlingDuplicates() {
		
		/*
		 * map: 1 -> {"james","jacob"}, 2-> {Maya, Kapil}
		 * 
		 * */
		
		Map<Integer, List<String>> map = new HashMap<>();
		map.put(1, Arrays.asList(new String[] {"James","Jacob"}));
		map.put(2, Arrays.asList(new String[] {"Maya","Kapil","Ritu"}));
		
		System.out.println(map);
		
		map.put(1, Arrays.asList(new String[] {"Prateek"})); // it will override the already exiting values in key=1
		
		System.out.println(map);
		
		
		
		
	}
	
	private static void handlingQueries() {
		
		System.out.println("-----handlingQueries----------");
		
		/*
		 * map: 1 -> {"james","jacob"}, 2-> {Maya, Kapil}
		 * 
		 * */
		
		Map<Integer, ArrayList<String>> map = new HashMap<>();
		ArrayList<String> list1 = new ArrayList<>();
		list1.add("James");
		list1.add("Jacob");
		map.put(1, list1);
		
		ArrayList<String> list2 = new ArrayList<>();
		list2.add("Maya");
		list2.add("Kapil");
		list2.add("Ritu");
		
		map.put(2, list2);
		
		
		System.out.println(map);
		/*
		 * I want to add Prateek in standard 1
		 * */
		
		ArrayList<String> student_list = map.get(1);
		
		student_list.add("Prateek");
		System.out.println(student_list);
		
		map.put(1, student_list);
		
		System.out.println(map);
		
		
	}

}
