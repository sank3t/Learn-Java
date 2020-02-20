class A
{
	int a,b;
	public A(int a,int b)
	{
		this.a=a;
		this.b=b;
		System.out.println("Arg invoked");
	}
	public void show()
	{
		display(this);
	}
	public void display(A ref)
	{
		System.out.println(ref.a+" "+b);
	}
}
class this2
{
	public static void main(String args[])
	{
		A ref=new A(3,4);
		ref.show();
	}
}