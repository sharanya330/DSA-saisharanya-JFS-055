package com.java.day4;
import java.util.*;
public class ComplementPatternDemo1 {

	public static void main(String[] args) {
		int target=9;
		int [] arr= {2,7,11,15,22};
		int [] arr1= {1,3,6,5,7};
		//create empty map to store key and value pairs
		Map<Integer ,Integer > m=new <Integer ,Integer>HashMap();
		
		for(int i=0;i<arr1.length;i++)
		{
			int complement=target-arr1[i];
			
			if(m.containsKey(complement)) 
			{
				System.out.println("index:"+m.get(complement)+" "+i);
				return;
			}
			m.put(arr1[i],i);//store value, index in hashmap
		}
		System.out.println(m);
		
	}

}
