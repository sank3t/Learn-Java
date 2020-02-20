import java.util.Scanner;
class Buffer
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String s;
		int i,j=0;
		System.out.print("Enter a string:");
		s=sc.next();
		char[] a=s.toCharArray();
		char[] a1=new char[3];
		for(i=a.length;i>0;i--)
		{
			a1[j]=a[i];
			j++;
		}
		for(i=0;i<3;i++)
			System.out.println(a1[i]);
	}
}