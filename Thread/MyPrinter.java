class Printer 
{
	public synchronized void print(char ch)
	{
		for(int i=0;i<=30;i++)
		System.out.print(ch);
		try
		{
			Thread.sleep(2000);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		for(int i=0;i<=30;i++)
		System.out.print(ch);
	}
}
class StarPrinter extends Thread
{
	Printer p;
	public StarPrinter(Printer p)
	{
		this.p=p;
	}
	public void run()
	{
		synchronized(p)
		{
			System.out.println("star printer thread started");
			p.print('*');
		}
	}
}
class HashPrinter extends Thread
{
	Printer p;
	public HashPrinter(Printer p)
	{
		this.p=p;
	}
	public void run()
	{
		synchronized(p)
		{
			System.out.println("hash printer thread started");
			p.print('#');
		}
	}
}
class MyPrinter
{
	public static void main(String args[])
	{
		Printer a=new Printer();
		StarPrinter s=new StarPrinter(a);
		HashPrinter h=new HashPrinter(a);
		s.start();
		h.start();
	}
}