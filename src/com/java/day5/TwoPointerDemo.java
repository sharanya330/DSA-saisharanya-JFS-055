package com.java.day5;

import java.util.Arrays;

//Remove duplicates from array ={1,1,2,2,3,3,4}
public class TwoPointerDemo {

	public static void main(String[] args) {
		int [] a= {1,1,2,2,3,3,4};
		int s=0;
		
		for(int f=1;f<a.length;f++) {
//			if(a[f]==a[s]) {
//				f++;
//			}
			if(a[f]!=a[s]) {
				s++;
				a[s]=a[f];
				
			}
		}
		int var=s+1;
		System.out.println(Arrays.toString(Arrays.copyOf(a,var)));
	}

}
