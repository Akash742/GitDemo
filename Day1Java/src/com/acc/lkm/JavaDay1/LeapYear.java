package com.acc.lkm.JavaDay1;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Enter the year: ");
		Scanner sc = new Scanner(System.in);
		
		int year = 0;
		
		year =  sc.nextInt();
		
		if((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))
		{
			System.out.println("Leap Year");
		}
		else
		{
			System.out.println("Not a Leap Year");
		}
	}

}
