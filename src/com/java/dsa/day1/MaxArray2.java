package com.java.dsa.day1;

import java.util.Scanner;

public class MaxArray2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter target ");
		int target=sc.nextInt();
		int [] a=new int[5];
		int max=Integer.MIN_VALUE;
		System.out.println("Enter array elements");
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
			
		for(int i=0;i<a.length;i++) {
			if(a[i]>max) {
				max=a[i];
			}
			
		}
		System.out.println("Max:"+max);
		for(int i=0;i<a.length;i++) {
			if(a[i]==target) {
				System.out.println("Target found at position :"+i);	
			}
			
		}
		

		
		
		// TODO Auto-generated method stub

	}

}
