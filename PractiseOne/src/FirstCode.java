
public class FirstCode 
{
	public static void main(String args [])
	
	{
		
		//variable--> byte,short,int,long,float,double,char,boolean;
		
		byte h=5; //1byte--> 8bits--> -2^8 to 2^8-1	
		short s=3; //2bytes-->16bits --> -2^16 to 2^16-1
		int i=5; // 4bytes-> 32bits
		long l=50000000000000l;// 8bytes--> 64bits
		
		float f=5.5f; //4bytes
		double d=5.5; //8bytes
	
		char c='A';
		c=66;// American standard code for information interchange
		System.out.println(c);
		
		double d1=5;
		System.out.println(d1);//Implicit conversion
		int k=(int)5.6;//type casting
		System.out.println(k);
	}
	
}
