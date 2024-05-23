package com.acc.lkm.JavaDay1;
import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number: ");
		int n = sc.nextInt();
		
		int f1 = 0, f2 = 1, c = 0;
		System.out.print(f1 + " ");
		System.out.print(f2 + " ");
		for(int i = 2; i<=n; i++)
		{
			c = f1 + f2;
			f1 = f2;
			f2 = c;
			System.out.print(c + " ");
		}
	}

}
