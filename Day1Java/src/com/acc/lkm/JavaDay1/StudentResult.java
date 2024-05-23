package com.acc.lkm.JavaDay1;
import java.util.Scanner;

public class StudentResult {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int marks[] = new int[4];
		
		System.out.print("Enter the marks: ");
		
		for(int i = 0; i<marks.length; i++)
		{
			marks[i] = sc.nextInt();
		}
		int total_marks = 0;
		for(int i = 0; i<marks.length; i++)
		{
			total_marks += marks[i];
		}
		
		float avg_marks = total_marks / 4;
		
		System.out.println("Total Marks: " + total_marks);
		System.out.println("Average Marks: " + avg_marks);
	}

}
