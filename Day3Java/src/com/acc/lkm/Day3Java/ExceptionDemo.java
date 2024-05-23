package com.acc.lkm.Day3Java;
import java.util.*;
import java.io.*;
import java.sql.*;

public class ExceptionDemo {
	static String empname = "Rohan";
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc  = new Scanner(System.in);
		
		try {
			try
			{
				System.out.print("Enter the num: ");
				Integer x = sc.nextInt();
				Integer y = x / 0;
				System.out.println(y);
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
			try
			{
				if(empname == null)
				{
					throw new IOException("Employee is invalid");
				}
				else
				{
					throw new SQLException("Employee Valid");
				}
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		}
		catch(Exception e)
		{
			System.out.println("Handled Successfully");
		}
		finally
		{
			System.out.println("Closed Connection");
		}

	}

}
