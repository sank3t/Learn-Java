class A
{
	public void show()
	{
		System.out.println("show invoked from A");
	}
}
class B extends A
{
	public void show()
	{
		System.out.println("show invoked from b");
	}
}
class C extends A
{
	public void show()
	{
		System.out.println("show invoked from c");
	}
}
class Invoker
{
	public static void invoke(A ref)
	{
		ref.show();		
	}
}
class RTPM
{
	public static void main(String[] arr)
	{
		Invoker.invoke(new A());
		Invoker.invoke(new B());
		Invoker.invoke(new C());
	}
}