package com.example.maps.employee;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class EmployeeMain {
	
	
	/*
	 * We Want to create an Employee Designation Map so that whenever we want to know the details of Employees
	 * at a particular designation we can get those details
	 * 
	 * Sample:
	 * 
	 * "SDE":[EMP1,EMP2,Emp3]
	 * "TL":[EMP4,EMP5]
	 * 
	 * when we want to print: How many employees are TL -> 2
	 * 
	 * */
	
	
	public static void main(String[] args) {
		
		ArrayList<Employee> employeeList = createEmployees();
		//System.out.println(employeeList);
		
		
		Map<String, ArrayList<Employee>> map = new HashMap<>();
		
		/*
		 * 
		 * map = {"SDE":[e1,e2,e3],"TL":[e4,e5],"HR":[e6]}
		 * 
		 * */
		
		for(Employee emp: employeeList) {
			
			if(map.containsKey(emp.getDesignation())) {
				
				ArrayList<Employee> already_emp_list = map.get(emp.getDesignation());
				already_emp_list.add(emp);
				map.put(emp.getDesignation(), already_emp_list);
			}
			else {
				ArrayList<Employee> new_emp_list = new ArrayList<>();
				new_emp_list.add(emp);
				map.put(emp.getDesignation(), new_emp_list);
			}
			
		}
		
		displayMap(map);
		
		
		/*
		 * Enums -> Enumeration in Java
		 * 
		 * */
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter Values: TeamLead, SDE, HR");
		String designation = input.next();
		
		if(designation.equals(EmployeeEnum.TeamLead.name())) {
			System.out.println(map.get(EmployeeEnum.TeamLead.getValue()));
		}
		else if(designation.equals(EmployeeEnum.SDE.name())) {
			System.out.println(map.get(EmployeeEnum.SDE.getValue()));
		}
		else {
			System.out.println(map.get(EmployeeEnum.HR.getValue()));
		}
		
		input.close();
		
		
		
	}
	
	private static ArrayList<Employee> createEmployees(){
		
		
		Employee e1 = new Employee();
		e1.setName("James");
		e1.setId(1);
		e1.setLocation("Mumbai");
		e1.setDesignation("SDE");
		
		Employee e2 = new Employee();
		e2.setName("Jacob");
		e2.setId(2);
		e2.setLocation("Mumbai");
		e2.setDesignation("SDE");
		
		Employee e3 = new Employee();
		e3.setName("Maya");
		e3.setId(3);
		e3.setLocation("Pune");
		e3.setDesignation("SDE");
		
		Employee e4 = new Employee();
		e4.setName("Kapil");
		e4.setId(4);
		e4.setLocation("Pune");
		e4.setDesignation("TL");
		
		Employee e5 = new Employee();
		e5.setName("Ritu");
		e5.setId(5);
		e5.setLocation("Bangalore");
		e5.setDesignation("TL");
		
		Employee e6 = new Employee();
		e6.setName("Prateek");
		e6.setId(6);
		e6.setLocation("Chennai");
		e6.setDesignation("HR");
		
		
		ArrayList<Employee> employeeList = new ArrayList<>();
		employeeList.add(e1);
		employeeList.add(e2);
		employeeList.add(e3);
		employeeList.add(e4);
		employeeList.add(e5);
		employeeList.add(e6);
		
		
		
		return employeeList;
		
		
	}
	
	private static void displayMap(Map<String, ArrayList<Employee>> map) {
		
		for(String key:map.keySet()) {
			System.out.println(key+" : "+map.get(key));
		}
		
		
	}

}
