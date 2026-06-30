package j8;

import java.util.*;


class PaymentUtil{
	static double payment_emi(double amount) {
		return amount*0.9;
	}
	void show(String msg) {
		System.out.println(msg);
	}
}
public class MethodRefDemo {

	public static void main(String[] args) {
		List<Integer> number=Arrays.asList(10,-10,20,-20,40);
        number.stream().map(Math::abs).forEach(System.out::println);
        
        List<Double> amounts=Arrays.asList(1000.76,4000.98);
        amounts.stream().map(PaymentUtil::payment_emi).forEach(System.out::println);
        
        PaymentUtil pt=new PaymentUtil();
        List<String> messages=Arrays.asList("hi","hello","hey");
        messages.forEach(pt::show);
	}

}
