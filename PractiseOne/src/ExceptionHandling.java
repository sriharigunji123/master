
public class ExceptionHandling {
	public static void main(String args[]) {
		try {
			int data=100/0;
		
		}catch(ArithmeticException e) {
		System.out.println(e);
		}
	
	finally {
		System.out.println("finally block to be excecuted");
	}

}
}
