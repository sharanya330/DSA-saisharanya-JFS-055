package com.dsa.recursion;

public class Palindrome {//palindrome with binary serach
public static boolean pal(String str,int left,int right ) {
	if(left>=right)return true;
	if(str.charAt(left)!=str.charAt(right))return true;
	return pal(str,left+1,right-1);
}
	public static void main(String[] args) {
		String str="racecar";
		
		int left=0;
		int right=str.length()-1;
		System.out.println(Palindrome.pal(str,left,right));

	}

}
