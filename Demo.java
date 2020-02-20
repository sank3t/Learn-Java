class A
{
	public A()
	{
		super();
		System.out.println("From A");
	}
}
class B extends A
{
	public B()
	{
		super();
		System.out.println("From B");		
	}
}
class Demo
{
	public static void main(String args[])
	{
		B ref=new B();
	}
}