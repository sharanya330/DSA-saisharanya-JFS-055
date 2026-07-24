package com.linked;

public class DeleteLL {
public static ListNode deleteAtBeg(ListNode head){
	head=head.next;
	return head;
}
public static ListNode deleteAtEnd(ListNode head){
	ListNode ptr=head;
	while((ptr.next).next!=null) {
		ptr=ptr.next;
	}
	ptr.next=null;
	return head;
	
}
public static ListNode deleteAtpos(ListNode head,int pos){
	ListNode ptr=head;
	for(int i=0;i<pos-1;i++) {
		ptr=ptr.next;
	}
	ptr.next=ptr.next.next;
	
	return head;
	
}
public void  traverse(ListNode head){
	ListNode ptr=head;
	while(ptr!=null) {
		System.out.print(ptr.val+" ");
		ptr=ptr.next;
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
		
		DeleteLL dl=new DeleteLL();
		ListNode head=l1;
		
		dl.traverse(dl.deleteAtBeg(head));
		System.out.println();
		dl.traverse(dl.deleteAtEnd(head));
		System.out.println();
		
		dl.deleteAtpos(head, 1);
		dl.traverse(head);
		
		
		
		

	}

}
