package com.java.day3;

import java.util.Arrays;

//silent is an anagram of listen
public class Anagram {
static boolean anagram(String str,String str2) {
	if(str.length()!=str2.length()) {//check length
		return false;
	}
	else {
		//convert to char array
		char [] c1=str.toCharArray();
		char [] c2=str2.toCharArray();
		Arrays.sort(c1);
		Arrays.sort(c2);
		for(int i=0;i<c1.length;i++) {
			if(c1[i]!=c2[i]) {
				
				return false;
			}
			
		}
		return true;
		
	}
}
	public static void main(String[] args) {
	    String str=new String("silent");
	    String str2=new String("listen");
	    
	   System.out.println(anagram(str,str2));

	}

}
