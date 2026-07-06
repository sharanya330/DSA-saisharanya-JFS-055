package com.java.day3;

import java.util.Arrays;

//First Non-repeating Character in "Swiss"
public class FirstNonRepeating {

	public static void main(String[] args) {
		String s="swiss";
//		
int [] freq=new int [26];
for(char c:s.toCharArray()) {
	freq[c-'a']++;
}
for(char c:s.toCharArray()) {
	if(freq[c-'a']==1) {
		System.out.println("character is:"+c);
		break;
	}
}

	}

}
