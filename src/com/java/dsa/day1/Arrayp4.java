package com.java.dsa.day1;
//zeros to last
import java.util.Arrays;

public class Arrayp4 {

	public static void main(String[] args) {
		int [] arr= {1,0,3,0,12};
		int [] newarr=new int[arr.length];
		int [] vals=new int[8];
		int newarr2[]=new int[5];
		int j=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==0)continue;
			else vals[j]=arr[i];
			j++;
		}
		for(int i=0;i<arr.length;i++) {
			newarr[i]=vals[i];
		}
		int count=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==0) {
				
				continue;
			}
			else {
				vals[j]=arr[i];
			count++;
			j++;
			}
			for(int i1=count+1;i1<arr.length;i1++) {
				newarr2[i1]=vals[i1];
			}
		}
		for(int i=count;i<arr.length;i++) {
			newarr[i]=vals[i];
		}
System.out.println(Arrays.toString(newarr));
System.out.println(Arrays.toString(newarr2));
	}

}
