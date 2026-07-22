package com.dsa.recursion;

public class Sum {
public static int sum(int n) {
	if(n<=0)return 0;//base condition
	return (n%10)+sum(n/10);
}
	public static void main(String[] args) {
		System.out.println(Sum.sum(123456));

	}

}
