class palindrome
{
	public static void main(String args[])
	{
		int i,temp,x;
		for(i=1;i<=100;i++)
		{	
			temp=i;
			x=0;
			while(temp>0)
			{	x=(x*10)+(temp%10);
				temp=temp/10;
			}
			if(x==i)
			System.out.println(i);	
		}
	}
}