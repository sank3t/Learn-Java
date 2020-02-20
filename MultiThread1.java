class MyThread implements Runnable
{
	Thread t;
	public MyThread()
	{
		t=new Thread(this);
		t.start();
	}
	public void run()
	{
		System.out.println("start a child thread");
		for(int i=1;i<=10;i++)
		{
			System.out.println(i);
			try
			{
				Thread.sleep(2000);
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		}
		System.out.println("child thread finished");
	}
}
class MultiThread1
{
	public static void main(String args[])
	{
		System.out.println("main & child thread start");
		MyThread t=new MyThread();
		for(int i=10;i>=1;i--)
		{
			System.out.println(i);
			try
			{
				Thread.sleep(2000);
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		}
		System.out.println("main thread finished");
	}
}