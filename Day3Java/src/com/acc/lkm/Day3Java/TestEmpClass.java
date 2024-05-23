package com.acc.lkm.Day3Java;
import com.acc.lkm.Day3Java.Employee;
import java.util.*;

public class TestEmpClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		ArrayList<Employee> empList = new ArrayList<>();
		
		
		
		for(int i = 0; i<4; i++)
		{
			System.out.println("Enter the Employee Details: ");
			
			String empDetails = sc.nextLine();
			
			empList.add(new Employee(empDetails));
			
		}
		//System.out.println(empList);
		
		for(Employee e : empList)
		{
			System.out.println("Employee Name: " + e.empName);
			System.out.println("Employee Id: " + e.empId);
			System.out.println("Employee Location: " + e.loc);
		}
	}

}
