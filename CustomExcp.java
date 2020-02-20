class MyExcp extends Exception
{
	String msg;
	public MyExcp()
	{
		msg="default invoked";
	}
	public MyExcp(String m)
	{
		msg=m;
	}
	public String toString()
	{
		return msg;
	}
}
class CustomExcp
{
	public static void main(String args[])
	{
		try
		{
			System.out.println("throwing custom exception");
			throw(new MyExcp("arg invoked"));
		}
		catch(Exception e)
		{
			System.out.println(e.toString());
		}
	}
}