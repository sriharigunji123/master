

class Calc
{
	int num1;
	int num2;
	int result;

	public Calc()

	{
		num1 = 5;
		num2 = 6;

		result = num1 + num2;

	}
	public Calc(int i)
	{
		num1=i;
		num2=i;
		result=num1+num2;
		
	}
	public Calc(double j,int i)
	{
		num1=(int)j;
		num2=i;
	}
}

public class ObjectDemo {

	public static void main(String[] args) 
	{
		Calc obj=new Calc(9.5,6);    //constructor
		
		System.out.println(obj.num1);
	}

}
