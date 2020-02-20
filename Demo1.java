final class A
{
	public A()
	{
		System.out.println("Hello World");
	}
}
class B
{
	public B()
	{
		super();
		System.out.println("Hello World");
	}
}
class Demo1
{
	public static void main(String args[])
	{
		B ref=new B();
	}
}