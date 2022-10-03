package com.example.linkedlist;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListMain {
	
	public static void main(String[] args) {
		
		LinkedList<Integer> list = new LinkedList<>();
		
		/*Add Values*/
		list.add(1);
		list.add(2);
		
		LinkedList<Integer> sample_list = new LinkedList<>();
		sample_list.add(3);
		sample_list.add(4);
		sample_list.add(5);
		
		list.addAll(sample_list);
		
		
		System.out.println(list);
		
		/*Size*/
		System.out.println(list.size());
		
		/*add to the start*/
		list.add(0, 6);
		System.out.println(list);
		list.addFirst(7);
		System.out.println(list);
		
		/*adding to the end*/
		list.addLast(10);
		System.out.println(list);
		
		
		/*Iterate*/
		
		System.out.println("-------FOR LOOP-------");
		
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
		
		
		System.out.println("--------List Iterator------");
		
		Iterator<Integer> it = list.listIterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		
		System.out.println("---------For Each Loop--------");
		
		for(Integer i:list) {
			System.out.println(i);
		}
		
		
		
		
	}

}
