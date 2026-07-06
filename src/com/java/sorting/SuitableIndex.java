package com.java.sorting;

public class SuitableIndex {

	public static void main(String[] args) {
		int [] arr= {1,3,4,5};
		int target=1;
		int index;
		int low=0;
		int high=arr.length-1;
		while(low<=high) {
			int mid=(low+high)/2;
			if(arr[mid]==target) {
				
				System.out.println("Found at:"+mid);
				return ;
			}
			else if(arr[mid]<target) {
				low=mid+1;
			}
			else {
				high=mid-1;
			}
		}
		System.out.println("Insert at: "+low);
	}

}
