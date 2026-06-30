package com.dsa.inheritance;
class SuperDemo{
	int salary=55;
	public void getSalary(int salary) {
		System.out.println(salary);
	}
	
	
}
public class ThisDemo extends SuperDemo{

		public void getSalary(int salary) {
			salary=22;
			System.out.println(salary);
			System.out.println(this.salary);
			super.getSalary(33);
			System.out.println(super.salary);
			
		}
		public static void main(String [] args) {
			ThisDemo td=new ThisDemo();
			td.getSalary(44);

	}

}
