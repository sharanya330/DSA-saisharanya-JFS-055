package com.java.day4;

import java.util.Arrays;
import java.util.HashMap;
import java.util.*;

public class GroupAnagram {

	public static void main(String[] args) {
		HashMap<String,List<String>> map=new HashMap<>();
		String [] s= {"tan","eat","ate","nat","bat","tea"};
		for(String s1:s) {
			char [] ch=s1.toCharArray();
			Arrays.sort(ch);
			
			String key=new String(ch);
			
			map.putIfAbsent(key,new ArrayList());
			
			map.get(key).add(s1);
		}
System.out.println(map.values());
	}

}
