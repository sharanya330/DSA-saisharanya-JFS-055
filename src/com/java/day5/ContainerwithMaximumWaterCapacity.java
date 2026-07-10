package com.java.day5;
//Container with maximum water Capacity
public class ContainerwithMaximumWaterCapacity {
	
	
public static int min(int a,int b) {
	if(a<b) {
		return a; 
	}
	else return b;
}

	public static void main(String[] args) {
		int [] a= {1,8,6,2,5,4,8,3,7};
		int maxArea=Integer.MIN_VALUE;
		int left=0;
		int right=a.length-1;
		while(left<right) {
			int area=(right-left)*min(a[right],a[left]);
			maxArea=Math.max(maxArea, area);
			if(a[left]<a[right]) {
				left++;
			}
			else right--;
		}
       System.out.println("Container with Maximum water Capacity is:"+maxArea);
	}

}
