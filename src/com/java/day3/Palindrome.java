package com.java.day3;
//Check if palindrome ignore Alpha-Numerics

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         String str=new String("A man, A plan, a canal : Panama");
         String str1= str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
         System.out.println(str1);
         String pal=new StringBuilder(str1).reverse().toString();
         System.out.println(pal);
         if(pal.equals(str1)) {
        	 System.out.println("Palindrome");
        	 
         }
         else {
        	 System.out.println("Not a Palindrome");
         }
         
         
	}

}
