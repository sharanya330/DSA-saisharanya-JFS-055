package j8;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class PredefinedFunctlInterfaces {

	public static void main(String[] args) {
		// predicate:conditional statements-test method
		Predicate<Integer> p=(i)->i%2==0;
		System.out.println(p.test(22));
		System.out.println(p.test(21));
		System.out.println(p.test(24));
		String [] name= {"abc","def","ghijkl"};
		for(String str:name) {
			Predicate <String > p1=s->s.length()>5;
			if(p1.test(str)) {
				System.out.println(str);
			}
		}
        //Function:takes input processes and produces output-apply()
		Function<Integer,Integer> s=(j)->j/2;
		System.out.println(s.apply(26));
		System.out.println(s.apply(36));
		Function<String,Integer> a=(str)->str.length();
		System.out.println(a.apply("varthika"));
		System.out.println(a.apply("abc"));
		//Consumer:printing statements only -accept()
		Consumer<Integer> c=l->System.out.println(l);
		c.accept(56);
		//Supplier:get the objects
		Supplier <String> st=()->{
			String otp="";
			for(int i=0;i<6;i++) {
				otp+=(int)(Math.random()*10);
			}
			return otp;
		};
		System.out.println(st.get());
	}

}
