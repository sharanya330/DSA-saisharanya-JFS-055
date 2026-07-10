package com.java.dsa.day1;

import java.util.Arrays;

public class Arrayp3m2 {
	public static void updateArray(int []arr,int size,int pos,int val) {
		if(pos<0||pos>=arr.length) {//especially for usecases
			System.out.println("Invalid position");
		}
		else {//if ecerythings good update
	       arr[pos]=val;
		}
	}
	public static void main(String[] args) {
		int [] arr= {1,8,3,9,2,47};
		//calling static method with class name
		Arrayp3m2.updateArray(arr, 6, 4, 55);
		System.out.println(Arrays.toString(arr));
		

	}

}
