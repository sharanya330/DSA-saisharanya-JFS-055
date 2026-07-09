package com.java.day4;

import java.util.HashMap;

public class MajorityElement {

	public static void main(String[] args) {
		int [] a= {2,2,1,1,1,2,2,2,};
		int maj=a.length/2;
		HashMap<Integer,Integer> map=new HashMap<>();
		for(int i=0;i<a.length;i++)
		{
			map.put(a[i],map.getOrDefault(a[i], 0)+1);
		}
		for(int k:map.keySet()) {
			if(map.get(k)>maj) {
				System.out.println("Majority Element: "+k);
			}
		}

	}

}
