package com.example.maps.employee;

public enum EmployeeEnum {
	
	TeamLead("TL"), 
	SDE("SDE"), 
	HR("HR");
	
	public final String value;
	
	
	private EmployeeEnum(String value) {
		this.value=value;
	}


	public String getValue() {
		return value;
	}
	
	
}
