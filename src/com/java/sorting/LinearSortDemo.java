package com.java.sorting;

public class LinearSortDemo {
public static void main(String [] args) {
	String [] str= {"abc","def","ghi","jkl"};
	String target="jkl";
	int index=-1;
	for(int i=0;i<str.length;i++){
		if(str[i].equals(target)) {
		index=i;
		break;
		}
	}
	System.out.println(index!=-1?"found at:"+index:"not found");
}
}
