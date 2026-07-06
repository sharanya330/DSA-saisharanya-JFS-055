package com.java.day3;

public class RemoveDuplicates {

	public static void main(String[] args) {
		String s="programming";
		StringBuilder s1=new StringBuilder();
		boolean seen[]=new boolean[256];
		for(char c:s.toCharArray()) {
			if(!seen[c]) {
				seen[c]=true;
				s1.append(c);
			}
		}
		
		System.out.println(s1);

	}

}
