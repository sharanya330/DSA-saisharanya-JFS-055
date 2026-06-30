package j8;
interface Left{
	default void m1() {
		System.out.println("left default");
	}
	
}
interface Right{
	default void m1() {
		System.out.println("Right default");
	}
}
public class default_Static implements Right,Left{

	
	@Override
	public void m1() {
		System.out.println("overriden default");
		Left.super.m1();
		Right.super.m1();
	}


public static void main(String[] args) {
	default_Static a=new default_Static();
	a.m1();

}
}

