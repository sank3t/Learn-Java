class A
{
	public void  parent()
	{
		System.out.println("hello world");
	}
}
class B extends A
{
	public void show()
	{
		System.out.println();
		parent();
	}
}
class test
{
	public static void main(String args[])
	{
		B ref=new B();
		ref.show();
		ref.parent();
	}
}
