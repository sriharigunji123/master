
public class MultithreadDemo {
	public static void main(String args[]) {
		
		for(int i=1; i<=4; i++) {
			MultiThreadThing myThing = new MultiThreadThing(i);
			Thread myThread= new Thread(myThing);
			myThread.start();
			
		}
	}

}
