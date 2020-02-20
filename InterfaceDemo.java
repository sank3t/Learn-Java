interface A
{
	public void show();
	public void display();
}
class B implements A
{
	public void show()
	{
		System.out.println("show invoked");
	}
	public void display()
	{
		System.out.println("display invoked");
	}
}
class InterfaceDemo
{
	public static void main(String args[])
	{
		B ref=new B();
		ref.show();
		//ref.display();
	}
} 