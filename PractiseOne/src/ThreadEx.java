class A extends Thread {
	public void show() {
		for (int i = 0; i <= 20; i++) {
			System.out.println("HI");
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}
}

class B extends Thread {
	public void show() {
		for (int i = 0; i <= 20; i++) {
			System.out.println("HEllo");
			
		}
	}
}

public class ThreadEx {

	public static void main(String[] args) {

		A a = new A();
		B b = new B();
		b.setPriority(Thread.MAX_PRIORITY);
		
		a.start();
		b.start();

	}

}
