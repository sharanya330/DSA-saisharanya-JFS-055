package com.linked;

public class ReverseLL {
public static ListNode reverse(ListNode head) {
	if(head==null)return null;
	ListNode preNode=null;
	ListNode currentNode=head;
	
	while(currentNode!=null) {
		
		ListNode nextNode=currentNode.next;
		currentNode.next=preNode;
		preNode=currentNode;
		currentNode=nextNode;
		
	}
	head=preNode;
	return head;
}
public void traverse(ListNode head) {
	ListNode temp=head;
	while(temp!=null) {
		System.out.print(temp.val+" ");
		temp=temp.next;
	}
}
	public static void main(String[] args) {
		ListNode l1=new ListNode(11);
		ListNode l2=new ListNode(22);
		ListNode l3=new ListNode(33);
		ListNode l4=new ListNode(44);
		
		//connections
		l1.next=l2;
		l2.next=l3;
		l3.next=l4;
		l4.next=null;
		ListNode head=l1;
		
		ReverseLL  rl=new ReverseLL ();
		head=rl.reverse(head);
		rl.traverse(head);
		

	}

}
