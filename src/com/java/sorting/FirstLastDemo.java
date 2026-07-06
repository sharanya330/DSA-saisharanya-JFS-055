package com.java.sorting;
//find first and last occurance using binary search of a target {1,1,2,2,2,2,2,2,2,3,4}=>logn+logn=2logn
public class FirstLastDemo {

	public static void main(String[] args) {
		int [] a= {1,1,2,2,2,2,2,2,2,3};
		int target=2;
		int first=-1;
		int last=-1;
//		int present=-1;
//		int next=-1;
		int low=0;
		int high=a.length-1;
		while(low<=high) {
			int mid=low+high/2;
			if(a[mid]==target) {
				first=mid;
				high=mid-1;
			}
			else if(a[mid]<target) {
				low=mid+1;
				
			}
			 else if(a[mid]>target) {
				 high=mid-1;
			 }
		}
		 low=0;
		 high=a.length-1;
		while(low<=high) {
			int mid=(low+high)/2;
			if(a[mid]==target) {
				last=mid;
				low=mid+1;
			}
			else if(a[mid]<target) {
				high=mid-1;
				
			}
			 else if(a[mid]>target) {
				 low=mid+1;
			 }
//			 else {
//				 last=low;
//			 }
		}
		System.out.println("First Occurance:"+first);
		System.out.println("Last Occurance:"+last);

	}

}
