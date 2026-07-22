package com.dsa.recursion;

public class Fibonocci {
public static int fibonocci(int n) {
	if(n<=1)return n;
	
	return fibonocci(n-1)+fibonocci(n-2);
}
	public static void main(String[] args) {
		System.out.println(Fibonocci.fibonocci(5));
	}

}
