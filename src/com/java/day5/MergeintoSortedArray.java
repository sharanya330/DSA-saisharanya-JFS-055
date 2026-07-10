package com.java.day5;

import java.util.Arrays;

//merge a1={1,3,5},a2={2,4,6} into a3={1,2,3,4,5,6}
public class MergeintoSortedArray {

	public static void main(String[] args) {
		int [] a1= {1,3,5};
		int [] a2= {2,4,6};
		int[] a3=new int[a1.length+a2.length];
		int p1=0;
		int p2=0;
		int k=0;
		while(p1<a1.length&&p2<a2.length) {
			if(a1[p1]<a2[p2]) {
				a3[k++]=a1[p1++];
				
			}
			else {
				a3[k++]=a2[p2++];
				
			}
		}
		while(p1<a1.length) {
			a3[k++]=a1[p1++];
		}
		while(p2<a2.length) {
			a3[k++]=a2[p2++];
		}
System.out.println(Arrays.toString(a3));
	}

}
