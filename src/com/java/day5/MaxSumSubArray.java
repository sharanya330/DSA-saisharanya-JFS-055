package com.java.day5;

public class MaxSumSubArray {

	public static void main(String[] args) {
		int [] a= {1,3,5,6,1,2,4};
		int k=3;
		int windowSum=0;
		int maxSum=0;
		for(int i=0;i<k;i++) {
			 windowSum=windowSum+a[i];
			  maxSum=windowSum;
		}
		for(int i=k;i<a.length;i++ ) {
			windowSum+=a[i]-a[i-k];
			maxSum=Math.max(windowSum,maxSum);
			
		}
System.out.println("Maximum Sum of SubArray is:"+maxSum);
	}

}
