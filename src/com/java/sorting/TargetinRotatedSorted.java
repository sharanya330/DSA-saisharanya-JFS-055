package com.java.sorting;

public class TargetinRotatedSorted {

	public static void main(String[] args) {
		int [] arr= {4,5,6,7,0,1,2};
		int target=0;
		int pivot=-1;
		int low=0;
		int high=arr.length-1;
		while(low<=high) {
			int mid=(high+low)/2;
			 mid=(mid+low)/2;
			if(arr[mid]==target) {
				pivot=mid;
				}
			else {
				low=mid+1;
				mid=(low+high)/2;
				if(arr[mid]==target) {
					pivot=mid;
				}
			}
		}
		System.out.println(pivot);
	}

}
