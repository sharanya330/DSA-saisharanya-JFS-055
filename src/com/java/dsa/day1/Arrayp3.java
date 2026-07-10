package com.java.dsa.day1;
import java.util.*;

//update elements of array, index shouldnot cross bounds
public class Arrayp3 {

	public static void main(String[] args) {
		int [] arr= {1,8,3,9,2,47};
		Scanner sc=new Scanner(System.in);
		System.out.println("enter position:");
		int position=sc.nextInt();
		System.out.println("Enter element:");
		int element=sc.nextInt();
		while(position<arr.length&&position>=0) {
			
			arr[position]=element;
			break;
		}
		sc.close();
		System.out.println(Arrays.toString(arr));
	}

}
