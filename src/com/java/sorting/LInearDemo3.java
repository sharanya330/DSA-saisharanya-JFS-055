package com.java.sorting;
//find p in developer
public class LInearDemo3 {
public static void main(String [] args) {
	String s="developer";
	char target='p';
	int pos=-1;
	char [] c=s.toCharArray();
	for(int i=0;i<c.length;i++) {
		if(c[i]==target) {
			pos=i;
			System.out.println("found at:"+pos);
		}
	}
	if(pos==-1) {
		System.out.println("Not found");
	}
}
}
