import java.util.*;
class armstrong
{
	public static void main(String args[])
	{
		int i,temp,x,n;
		for(i=1;i<=1000;i++)
		{
			temp=i;
			x=0;
			while(temp>0)
			{
				n=temp%10;
				x=x+n*n*n;
				temp=temp/10;
			}
			if(x==i)
				System.out.println(i);
		}
		
	}
}