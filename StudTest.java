import java.util.*;
class Stud
{
	private String name;
	private int rno,fees;
	public void get_data()
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter name:");
		name=sc.next();
		System.out.print("Enter RollNo.");
		rno=sc.nextInt();
		System.out.print("Enter Fees=");
		fees=sc.nextInt();
	}
	public void show_data()
	{
		System.out.print("Name:"+name+ "\tRollno="+rno+"\tFees="+fees);
	}
}
class StudTest
{
	public static void main(String args[])
	{
		Stud[] st=new Stud[2];
		int i;
		for(i=0;i<2;i++)
		{
			st[i]=new Stud();
			st[i].get_data();
		}
		for(i=0;i<2;i++)
		st[i].show_data();
	}
}