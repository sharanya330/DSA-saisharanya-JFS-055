package com.java.dsa.day1;
//Find majority element
public class Arrayp5 {

	public static void main(String[] args) {
		int [] arr= {2,2,3,3,2,2,1,2};
		int maj=arr.length/2;
		int count1=0;
		int count2=0;
		int count3=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==2)count1++;
			else if(arr[i]==3)count2++;
			else count3++;
			
		}
		if(count1>maj)System.out.println("the majority element is 2 ");
		else if(count2>maj)System.out.println("the majority element is 3 ");
		else System.out.println("the majority element is 1 ");

	}

}
