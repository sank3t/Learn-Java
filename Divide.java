class Divide
{
	public static int divide(int x,int y) throws InterruptedException
	{
		try
		{
			return x/y;
		}
		catch(Exception e)
		{
			System.out.println("excp caught in divide rethrow it");
			throw(new InterruptedException());
		}
	}
	public static void main(String args[])
	{
		try
		{
			int a=Integer.parseInt(args[0]);
			int b=Integer.parseInt(args[1]);
			int c=a/b;
			System.out.println("result="+c);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}