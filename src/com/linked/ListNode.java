package com.linked;

public class ListNode {
int val;
ListNode next;
public ListNode(int x) {//create a constructor to insert value directly to create a new node
	this.val=x;
}
public static void main(String [] args) {
	
	
	//creating multiple nodes
	ListNode l1=new ListNode(20);
	ListNode l2=new ListNode(21);
	ListNode l3=new ListNode(22);
	ListNode l4=new ListNode(23);
	ListNode l5=new ListNode(24);
	ListNode l6=new ListNode(25);
	
	
	//linking the nodes
	l1.next=l2;
	l2.next=l3;
	l3.next=l4;
	l4.next=l5;
	l5.next=l6;
	l6.next=null;
	
	
	//basic traversing
	ListNode temp=l1;
	
	while(temp!=null) {
		System.out.print(temp.val+" ");
		temp=temp.next;
	}
}
}
