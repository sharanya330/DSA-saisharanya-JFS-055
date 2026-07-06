package com.java.sorting;

public class BinaryDemo1 {
//	int found;
//	public int position( int[] a,int target,int low,int high,int mid) {
//		
//		if(a[mid]==target) {
//			found=mid;
//		}
//		else if(a[mid]>target) {
//			high=mid-1;
//			mid=low+high/2;
//			position(a,target,low,high,mid);
//		}
//		else if(a[mid]<target) {
//			low=mid+1;
//			mid=low+high/2;
//			position(a,target,low,high,mid);
//		}
//		return found;
//	}
	public static void main(String[] args) {
		int [] a= {10,20,30,40,50,60,70};
		int target=40;
		int found=0;
		BinaryDemo1  b=new BinaryDemo1 ();
		int low=0;
		int high=a.length-1;
		
		
		
		while(low<=high) {
			int mid=low+high/2;
		if(a[mid]==target) {
			System.out.println("found at:"+mid);
			return;
		}
		else if(target<a[mid]) {
			high=mid-1;
		}
		else {
			low=mid+1;
		}
		}
		
		System.out.println("found at:");
		}
	
	}


