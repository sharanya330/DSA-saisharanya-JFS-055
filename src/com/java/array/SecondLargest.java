package com.java.array;
import java.util.Scanner;
public class SecondLargest {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int [][]a=new int [3][4];
		System.out.println("Enter array values:");
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				a[i][j]=sc.nextInt();
				
			}
		}
		System.out.println("The elements of 2D ARRAY are:");
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				System.out.print(a[i][j]+" ");
				
			}
			System.out.println();
		}
		// TODO Auto-generated method stub

	}

}
