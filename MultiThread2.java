class MyThread extends Thread
{
	Thread t;
	String n;
	public MyThread(String a)
	{
		n=a;
		t=new Thread(this);
		t.start();
	}
	public void run()
	{
		System.out.println(n+" thread start");
		for(int i=1;i<=10;i++)
		{
			System.out.println(n+"="+i);
			try
			{
				Thread.sleep(2000);
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		}
		System.out.println(n+" thread finished");
	}
}
class MultiThread2
{
	public static void main(String args[])
	{
		System.out.println("main & child thread start");
		Thread t1=Thread.currentThread();
		t1.setName("Mac");
		MyThread t=new MyThread("OS X");
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
		System.out.println(t1.getName()+" thread finished");
	}
}