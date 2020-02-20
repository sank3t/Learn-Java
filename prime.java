class prime
{
	public static void main(String args[])
	{
		int a,i,count,j;
		for(i=1;i<=100;i++)
		{	
			a=i;
			count=0;
			for(j=1;j<=a;j++)
			{
				if(a%j==0)
				count++;
			}
			if(count==2)
			System.out.println(i);
		}
	}
}
