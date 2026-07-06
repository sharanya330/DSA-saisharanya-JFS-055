package com.java.sorting;
//Find first even number in {23,89,47,15,38,19,24}
public class LinearDemo2 {
public static void main(String [] args) {
	int [] arr= {23,89,47,15,20,19,24};
	int firsteven=0;
	for(int i=0;i<arr.length;i++) {
		if(arr[i]%2==0) {
			firsteven=arr[i];
			System.out.println(firsteven);
			break;
		}
		else {
			continue;
		}
	}

}
}
