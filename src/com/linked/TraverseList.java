package com.linked;

public class TraverseList {
public void traverselist(ListNode head) {
	ListNode temp=head;
	while(temp!=null) {
		System.out.print(temp.val+" ");
		temp=temp.next;
	}
}
	public static void main(String[] args) {
		ListNode l1=new ListNode(23);
		ListNode l2=new ListNode(24);
		ListNode l3=new ListNode(25);
		
		//connections
		l1.next=l2;
		l2.next=l3;
		l3.next=null;
		
		//start with head
		ListNode head=l1;
		TraverseList t=new TraverseList();
		t.traverselist(head);

	}

}
