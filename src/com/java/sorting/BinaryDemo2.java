package com.java.sorting;

public class BinaryDemo2 {

	public static void main(String[] args) {
		String [] s= {"abc","def","ghi","jkl"};
		String target="jkl";
	    int low=0;
	    int high=s.length-1;
	    while(low<=high) {
	    	int mid=(low+(high-low)/2);
	    	int a=s[mid].compareTo(target);
	    	if(a==0) {
	    		System.out.println("found at:"+mid);
	    		return;
	    	}
	    	else if(a>0) {
	    		high=mid-1;
	    	}
	    	else if(a<0) {
	    		low=mid+1;
	    	}
	    }
	    

	}

}
