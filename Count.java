import java.util.Scanner;
class Count
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String s;
		char temp;
		int i,j,c=0;
		System.out.print("Enter a string:");
		s=sc.next();
		char[] a=s.toCharArray();
		for(i=0;i<a.length;i++)
		{
			temp=a[i];
			for(j=1;j<a.length;j++)
			{
				
				if(temp!=a[j])
					c++;
				else
					c--;
			}
		}
	}
}