package com.acc.lkm.Day3Java;
import java.util.*;

public class HashSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Integer> set = new HashSet<>();
		HashMap<Integer, Integer> map = new HashMap<>();
		
		int arr[] = {1, 8, 9, 9, 2, 1, 9};
		
		for(int i = 0; i<arr.length; i++)
		{
			set.add(arr[i]);
		}
		int arr1[] = {8, 9, 5 , 0};
		
		System.out.print("Does not contains: ");
		for(int i = 0; i<arr1.length; i++)
		{
			if(!set.contains(arr1[i]))
			{
				System.out.print(arr1[i] + " ");
			}
		}
		
		for(int i = 0; i<arr.length; i++)
		{
			map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
		}
		System.out.println();
		
		for(int n : map.keySet())
		{
			System.out.println(n + " : " + map.get(n));

		}
		System.out.println("Using Entry: ");
		
		for(Map.Entry<Integer, Integer> entryMap : map.entrySet())
		{
			System.out.println(entryMap.getKey() + " : " + entryMap.getValue());
		}
		
		System.out.println();
		System.out.println(set);
	}

}
