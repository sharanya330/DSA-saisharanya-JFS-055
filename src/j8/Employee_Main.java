package j8;
//FunctionInterface implementation
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;//FunctionInterface


public class Employee_Main {

	public static void main(String[] args) {
		ArrayList<Employee> al=new ArrayList();
		al.add(new Employee(11,"sai"));
		al.add(new Employee(21,"sai1"));
		al.add(new Employee(31,"sai2"));
		al.add(new Employee(41,"sai3"));
		al.add(new Employee(51,"sai4"));
		al.add(new Employee(61,"sai5"));
		System.out.println(al);
		Comparator<Employee> c=(e1,e2)->(e1.empid>e2.empid)?-1:(e1.empid<e2.empid)?1:0;
		Collections.sort(al,c);
		System.out.println("======After sorting==========");
		System.out.println(al);
		// TODO Auto-generated method stub

	}

}
