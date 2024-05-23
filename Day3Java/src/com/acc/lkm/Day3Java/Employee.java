package com.acc.lkm.Day3Java;

public class Employee {
	String empName;
	int empId;
	String loc;
	
	public Employee(String empDetails)
	{
		String str[] = empDetails.split(" ");
		
		empId = Integer.parseInt(str[0]);
		empName = str[1];
		loc = str[2];
	}
}
