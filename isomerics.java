import java.util.*;
class isomerics
{
	public static void main(String args[])
	{
		int i,temp,a,j;
		for(i=0;i<=1000;i++)
		{
			a=i;
			temp=0;
			for(j=1;j<=(a/2);j++)
			{
				if(a%j==0)
					temp=temp+j;
			}
			if(i==temp)
				System.out.println(i);
		}
	}
}