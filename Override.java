class A
{
	public void show()
	{
		System.out.println("from A");
	}
}
class B extends A
{
	public void show()
	{
		super.show();
		System.out.println("from B");
	}
}
class Override
{
	public static void main(String args[])
	{
		B ref=new B();
		ref.show();
	}
}