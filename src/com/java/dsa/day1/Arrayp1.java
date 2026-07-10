package com.java.dsa.day1;

import java.util.Arrays;

//insert element at position 3
public class Arrayp1 {

	public static void main(String[] args) {
		int [] arr= {1,8,3,9,2,47};
		int []result=new int[arr.length+1];
		for(int i=0;i<result.length;i++) {
			//insert values upto position
			if(i<3) {
				result[i]=arr[i];
			}
			//new value in the new position
			else if(i==3) {
				result[i]=88;
			}
			//copy further values in next positions
			else if(i>3) {
				result[i]=arr[i-1];
			}
		}
		
		System.out.print(Arrays.toString(result));
		
		

	}

}
