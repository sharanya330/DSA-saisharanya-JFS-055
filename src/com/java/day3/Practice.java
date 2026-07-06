package com.java.day3;

import java.util.Arrays;

public class Practice {

	public static void main(String[] args) {
		String str="Hello";
		String str1="Hello";
		String str2=new String("Hello");
		String str3=new String("Hello");
		//literal comparision
		if(str==str1) {
			System.out.println("values are equal");
		}
		else {
			System.out.println("values are not equal");
		}
		
		//proper comparision
		if(str2.equals(str3)) {
			System.out.println("References are Equal");
		}
		else {
			System.out.println("References are not equal");
		}
		
		//methods in Strings
         System.out.println(str.concat(str2));
         System.out.println(str.compareTo(str2));
         System.out.println(str.replace(str,"hi,yaar"));
         System.out.println(str.length());
         System.out.println(Arrays.toString(str.split("[^!,.*&@?]")));
         System.out.println(str.equalsIgnoreCase("hello"));
         
         
         //
         String a= new StringBuilder(str).reverse().toString(); 
         
         
	}

}
