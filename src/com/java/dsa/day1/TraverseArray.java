package com.java.dsa.day1;
import java.util.Scanner;
public class TraverseArray {
	public static void main(String [] args) {
		Scanner sc=new Scanner(System.in);
		int sum=0;
		int avg=0;
		int [] a=new int [5];
		System.out.println("Enter elements of Array: ");
		for(int i=0;i<5;i++) {
			a[i]=sc.nextInt();
			
		}
		for(int i=0;i<5;i++) {
			System.out.println(a[i]);
			
		}
		System.out.println("The reverse of Array is:");
		for(int i=a.length-1;i>=0;i--) {
			System.out.println(a[i]);
		}
		System.out.println("The Sum of Array Elements is:");
		for(int i=a.length-1;i>=0;i--) {
			sum+=a[i];
			
		}
		System.out.println(sum);
		System.out.println("The Average of Array Elements is:");
		for(int i=a.length-1;i>=0;i--) {
			sum+=a[i];
			avg=sum/5;
			
		}
		System.out.println(avg);
	}

}
