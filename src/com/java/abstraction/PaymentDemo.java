package com.java.abstraction;

interface Payment{
	public abstract void m1();
	       abstract void m2();
	                void m3();
	                public void pay(int amount);
	
}
class UPI implements Payment{

	@Override
	public void m1() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void m2() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void m3() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void pay(int amount) {
		System.out.println("Enter UPI Id");
		System.out.println("processing payment");
		System.out.println("Payment completed");
		// TODO Auto-generated method stub
		
	}
	
}
class CreditCard implements Payment{

	@Override
	public void m1() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void m2() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void m3() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void pay(int amount) {
		System.out.println("Enter credit card Id");
		System.out.println("processing payment");
		System.out.println("Payment completed");
		// TODO Auto-generated method stub
		
	}
	
}
public class PaymentDemo {

	public static void main(String[] args) {
		Payment p=new UPI();
		p.pay(1500);
		Payment p1=new CreditCard();
		p1.pay(11500);
		// TODO Auto-generated method stub

	}

}
