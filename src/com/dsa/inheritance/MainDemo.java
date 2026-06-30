package com.dsa.inheritance;

class Employee {
	private int  empId  ;
	private String empName  ;
	private double salary;
	
		
		public  Employee(int empId,String empName,double salary) 
		{
			this.empId=empId;
			this.empName=empName;
			this.salary=salary;
		}
		public void setsalary() {
			if(salary>0) {
				this.salary=salary;
				
			}
			else {
				System.out.println("Invalid Salary");
			}
		}
			public int getempId() {
				return empId;
			}
			public String getempName() {
				return empName;
			}
			public double getsalary() {
				return salary;
			}
			public void displayDetails() {
				System.out.println("Employee Id:"+empId);
				System.out.println("Employee Name:"+empName);
				System.out.println("Employee Salary:"+salary);
			}

}
 class Developer extends Employee{
	public int projectBonus=0;
	
	public  Developer(int empId,String empName,double salary,int projectBonus) {
		super(empId, empName,salary);
		this.projectBonus=projectBonus;
		}
	public double calculateSalary() {
		return getsalary()+projectBonus;
	}
	public void displayDeveloper() {
		displayDetails();
		System.out.println("projectBonus is:"+projectBonus);
	     System.out.println("total salary is:"+calculateSalary());
	     }
}
 class Tester extends Employee{
	 public int bugBonus=0;
	 public Tester(int empId,String empName,double salary,int bugBonus){
		 super(empId,empName,salary);
		 this.bugBonus=bugBonus;
		 
	 }
	 public double calculateSalary() {
		 return getsalary()+bugBonus;
	 }
	 public void displayTester() {
		 displayDetails();
		 System.out.println("bugBonus is:"+bugBonus);
	     System.out.println("total salary is:"+calculateSalary());
	    
	 }
	 
 }
 public class MainDemo{
	 public static void main(String [] args) {
		 Developer d=new Developer(5,"SaiSharanya",5000,3000);
		 System.out.println("***********Developer*************");
		 d.displayDeveloper();
		 Tester t=new Tester(51,"Sharanya",8000,3000);
		 System.out.println("***********Tester*************");
		 t.displayTester();
	 }
 }
