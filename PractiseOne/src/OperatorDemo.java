
public class OperatorDemo {
	
	/*
	 * 
	 * Arithmetic +,-,*,/,%
	 * Bitwise
	 * Relational
	 * Logical
	 */

	public static void main(String[] args)
	{
		/*
		int m=6; int n=4;
		int r1=m+n;
		int r2=m-n;
		int r3=m*n;
		double r4=(double)m/n;
		
		int r5=m%n;
		
		System.out.println(r1);
		System.out.println(r2);
		System.out.println(r3);
		System.out.println(r4);
		System.out.println(r5); */
		
		int m=4;
		int n=5;
		//++n; -->pre increment
		//n++; -->post increment
		//m=++n;  // first n value incremented later it assign to m
		m=n++; // first n value assigned to m later n increments 
				
		System.out.println(m);
		System.out.println(n);
		
		
		
	}

}
