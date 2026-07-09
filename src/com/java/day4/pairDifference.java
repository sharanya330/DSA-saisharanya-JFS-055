package com.java.day4;

import java.util.HashMap;
import java.util.Map;

public class pairDifference {

	public static void main(String[] args) {
		int target=2;
		int [] arr= {1,5,3,4,2};
		//int [] arr1= {1,3,6,5,7};
		//create empty map to store key and value pairs
		Map<Integer ,Integer > m=new <Integer ,Integer>HashMap();
		
		for(int i=0;i<arr.length;i++)
		{
			int complement=arr[i]-target;
			
			if(m.containsKey(complement)) 
			{
				System.out.println("index:"+m.get(complement)+" "+i);
				return;
			}
			m.put(arr[i],i);//store value, index in hashmap
		}
		//System.out.println(m);

	}

}
