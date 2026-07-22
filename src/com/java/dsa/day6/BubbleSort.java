package com.java.dsa.day6;

import java.util.Arrays;

public class BubbleSort {
public static void  sortedarray(int [] arr) {
	boolean swapped=false;
	for(int i=0;i<arr.length-1;i++) {
		
		for(int j=0;j<arr.length-i-1;j++) {
		if(arr[j]>arr[j+1]) {
			int temp=arr[j];
		    arr[j]=arr[j+1];
		    arr[j+1]=temp;
		    swapped=true;
		}
		
		}
		if(!swapped){
			break;
		}
		
	}
	
		
	}	
	

	public static void main(String[] args) {
		int[] arr= {5,6,9,4,8,2};
		sortedarray(arr);
		System.out.println(Arrays.toString(arr));

	}

}
