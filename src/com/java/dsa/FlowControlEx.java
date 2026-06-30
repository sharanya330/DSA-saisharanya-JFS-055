//using if else and scanner validate username and password
package com.java.dsa;
import java.util.Scanner;
public class FlowControlEx {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter user id and password:");
		
		String uid=sc.nextLine();
		
		String pwd=sc.nextLine();
		
		if(uid=="sai"&&pwd=="sai123") {
			System.out.println("passwors and userid are valid.");
		}
		else {
			System.out.println("login successful");
		}
		// TODO Auto-generated method stub

	}

}
