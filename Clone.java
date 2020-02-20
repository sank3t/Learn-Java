class Emp implements Cloneable
{
	int id,sal;
	String name;
	public Emp(int i,String n,int sal)
	{
		id=i;
		name=n;
		this.sal=sal;
	}
	public void show()
	{
		System.out.println(id+" "+name+" "+sal);
	}
	public Object clone() throws CloneNotSupportedException
	{
		return super.clone();
	}
}
class Clone
{
	public static void main(String args[])throws CloneNotSupportedException
	{
		Emp e=new Emp(007,"bond",10000);
		Emp f=new Emp(994,"san",100000);
		e.show();
		f.show();
		Emp p=(Emp)e.clone();
		Emp q=(Emp)f.clone();
		p.show();
		q.show();
	}
}