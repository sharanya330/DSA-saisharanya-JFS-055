package j8;

import java.util.function.Function;
import java.util.function.Supplier;

class Customer{
	public Customer() {
		System.out.println("iam regular here....");
	}
	String name;
	Customer(String name)
{
	this.name=name;
}
}
public class ConstructorReferenecDemo {

	public static void main(String[] args) {
		Supplier <Customer> sup=Customer::new;//with default Constructor
		Customer c=sup.get();
		
		Function <String,Customer> fun=Customer::new;//with param Constructor
		Customer ct=fun.apply("sai");
		System.out.println(ct.name);

	}

}
