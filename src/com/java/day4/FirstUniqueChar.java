package com.java.day4;
import java.util.*;
public class FirstUniqueChar {

	public static void main(String[] args) {
		String s="java";
		char[] c=s.toCharArray();
		
		HashMap<Character,Integer> m=new HashMap<>();//to find the frequency of each chaRACTER
		
		for(int i=0;i<c.length;i++) {
			m.put(c[i],m.getOrDefault(c[i],0)+1);
		}
		for(int i=0;i<c.length;i++) {
			if(m.get(c[i])==1) {
				System.out.println("Found at:"+i);
				return;
			}
		}
		

	}

}
