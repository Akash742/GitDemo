package com.acc.lkm.JavaDay1;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayDemo{
	public static void miniElement(int ar[])
	{
		Arrays.sort(ar);
		System.out.println("Minimum Element: " + ar[0]);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc  = new Scanner (System.in);
		System.out.print("Enter the length: ");
		int len  = sc.nextInt();
		int arr[] = new int[len];
		System.out.print("Enter the number: ");
		for(int i = 0; i<len; i++)
		{
			arr[i] = sc.nextInt();
		}
		
		miniElement(arr);
	}

}
