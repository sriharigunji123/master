class Parent{
	void Display()
	{
	System.out.println("Parent");
	}
}
class Child extends Parent{
	void Display()
	{
		System.out.println("child");
	}
}
class override{
	public static void main(String[] args)
	{
		Child c = new Child();
		c.Display();
	}
}