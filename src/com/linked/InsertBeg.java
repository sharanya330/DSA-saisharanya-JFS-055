package com.linked;

public class InsertBeg {
    public   ListNode  insertAtBeg(ListNode head,int valToInsert) {
    	
    	//create a new node 
    	ListNode newNode =new ListNode(valToInsert);
    	
    	//assign new node to head
    newNode.next=head;
    head=newNode;
    return head;
    }
    public ListNode insertAtpos(ListNode head,int valToInsert,int pos) {
    	ListNode newNode=new ListNode(valToInsert);
    	ListNode ptr=head;
    	for(int i=0;i<pos;i++) {
    		ptr=ptr.next;
    		
    	}
    	newNode.next=ptr.next;
    	ptr.next=newNode;
    	return head;
    }
    public ListNode insertAtEnd(ListNode head,int valToInsert) {
    	ListNode newNode=new ListNode(valToInsert);
    	ListNode ptr=head;
    	while(ptr.next!=null) {
    		ptr=ptr.next;
    	}
    	ptr.next=newNode;
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
		ListNode l1=new ListNode(23);
		ListNode l2=new ListNode(24);
		ListNode l3=new ListNode(25);
		
		//connections
		l1.next=l2;
		l2.next=l3;
		l3.next=null;
		
		//
		ListNode head=l1;
		System.out.println("Traversal before insertion:");
		InsertBeg ic=new InsertBeg();
		ic.traverse(head);
		
		System.out.println("Traversal after insertion in front:");
		
		ic.traverse(ic.insertAtBeg(head, 11));
		
		System.out.println("Traversal after insertion in a position:");
		ic.traverse(ic.insertAtpos(head, 11,1));
		
		System.out.println("Traversal after insertion in end:");
		
		ic.traverse(ic.insertAtEnd(head, 11));
	}

}
