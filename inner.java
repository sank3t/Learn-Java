class A
{
	private int a;
	public A(int x)
	{
		a=x;
	}
	public int getA()
	{
		return a;
	}
}
class B
{
	int b;
	A ref;
	public B(int x)
	{
		b=x;
		ref=new A(1);
	}
	public void display()
	{
		System.out.println(ref.getA()+" "+b);
	}
}
class inner
{
	public static void main(String args[])
	{
		B ref=new B(4);
		ref.display();
	}
}