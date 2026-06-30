package j8;

public class MyRunnable {

	public static void main(String[] args) {
		Runnable r=()->{
			for(int i=0;i<5;i++) {
				System.out.println("rama thread");
			}
		};
		Thread t=new Thread(r);
		t.start();
		for(int i=0;i<5;i++) {
			System.out.println("seetha thread");
		}
		// TODO Auto-generated method stub

	}

}
