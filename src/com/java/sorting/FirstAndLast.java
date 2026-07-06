package com.java.sorting;

public class FirstAndLast {
 int [] result(int arr[],int target) {
	int first=findbound(arr,target,true);
	int last=findbound(arr,target,false);
	return new  int[] {first,last};
}
int findbound(int [] arr,int target,boolean isFirst) {
	int low=0;
	int high=arr.length-1;
	int index=-1;
	while(low<=high) {
		int mid=(low+high)/2;
		if(arr[mid]==target) {
			index=mid;
			if(isFirst) {
				high=mid-1;
			}
			else {
				low=mid+1;
			}
			
		}
		else if(arr[mid]<target) {
			low=mid+1;
		}
        else if(arr[mid]>target) {
			high=mid-1;
		}
	}
	return index;
}
	public static void main(String[] args) {
		int [] arr= {1,1,2,2,2,2,2,2,2,3,4};
		int target=2;
		FirstAndLast fl=new FirstAndLast();
		int  result [] =fl.result(arr, target);
		System.out.println("First Occurance of target is:"+result[0]);
		System.out.println("First Occurance of target is:"+result[1]);
		
		
	}

}
