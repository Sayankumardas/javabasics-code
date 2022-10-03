package com.example.maps.employee;

public class Employee {
	
	private int id;
	private String name;
	private String location;
	private String designation;
	
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	
	
	
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	
	
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", location=" + location + ", designation=" + designation
				+ "]";
	}
	
	
	
	
	
	
	
	

}
