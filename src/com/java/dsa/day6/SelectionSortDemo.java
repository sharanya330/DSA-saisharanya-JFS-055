package com.java.dsa.day6;
import java.util.Arrays;
public class SelectionSortDemo {
     public static void main(String[] args) {
		int [] a= {1,2,3,4,5};
		int [] a1= {4,6,1,5,3,2};
		int n=a.length;
		boolean swapped=false;
		for(int i=0;i<n-1;i++) {
			int min=i;
			for(int j=min;j<n;j++) {
				if(a[min]>a[j]) {
					min=j;
					swapped=true;
				}
			}
			if(!swapped)break;
			int temp=a[i];
			a[i]=a[min];
			a[min]=temp;
		}
     System.out.println(Arrays.toString(a));
	}

}
