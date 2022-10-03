package com.example.arrays.objects;

public class ObjectArrayMain {
	
	public static void main(String[] args) {
		
		//Using Getters and setters to creates persons
		
		String s = "sample";
		
		Person p1 = new Person();
		p1.setName("James");
		p1.setAge(23);
		p1.setId("123455");
		
	//	System.out.println(p1.getName()+" "+p1.getAge()+" "+p1.getId());
		
		System.out.println(p1); //It will print the details when toString() is Overridden in Person class otherwise address of the p1 object will get printed
		System.out.println(s);
		
		
		Person p2 = new Person();
		p2.setName("Jacob");
		p2.setAge(23);
		p2.setId("123444");
		
		Person p3 = new Person();
		p3.setName("Maya");
		p3.setAge(23);
		p3.setId("123466");
		
		Person p4 = new Person();
		p4.setName("Kapil");
		p4.setAge(23);
		p4.setId("123477");
		
		
		//Object array:
		Integer[] array = new Integer[4];//Integer->  class -> and objects of a class can be null
		Person[] personsA = new Person[4]; //Person -> class, default value -> null
		Person[] personsB = {p1,p2,p3,p4};
		
	//	printArray(array);
	//	printArray(personsA);
	//	printArray(personsB);
		
		
		// Inserting values in object Array
		
		Person[] personsC = new Person[4];
		
		personsC[0] = new Person();
	//	printArray(personsC); //since we have not use setters to set values for Name, Age and Id while declaring new Person(), so default values for Name, age and id will get printed which are null, 0, null respectively
		
		personsC[0] = p4;
	//	printArray(personsC); //since the values for p4 have been already set using setters so the set values will get printed 
		
		
		for(int i=0;i<personsC.length;i++) {
			personsC[i] = personsB[i];
		}
		
		
		printArray(personsC);
		
		for(Person i:personsC) {
			System.out.println(i);
		}
		
	}
	
	
	private static void printArray(Person[] person) {
		
		for(int i=0;i<person.length;i++) {
			System.out.println(person[i]);
		}
		
	}

}
