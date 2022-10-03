package com.example.arrays.objects;

public class Person {
	
	private String name;
	private int age;
	private String id;
	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	

	
	@Override //nothing but overwriting-> changing the method behavior according to our needs
	public String toString() {
		return "Name: "+this.name+", Age: "+this.age+", Id: "+this.id;
	}
	

}
