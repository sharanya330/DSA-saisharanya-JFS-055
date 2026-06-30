package com.java.array;
//delete element at position 3
import java.util.Arrays;

public class Arrayp2 {

	public static void main(String[] args) {
		int [] arr= {1,8,3,9,2,47};
		int pos=3;
		
		int []result=new int[arr.length-1];
		for(int i=0;i<result.length;i++) {
			/*if(i==position)continue;
		result[j]=arr[i];
		j++;*///we can do this also.
			if(i<pos) {
				result[i]=arr[i];
			}
			
			else if(i>=pos) {
				result[i]=arr[i+1];
			}
		}
		
		System.out.print(Arrays.toString(result));
		

	}

}
