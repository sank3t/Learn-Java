class freq
{
	public static void main(String args[])
	{
		int[] a=new int[]{1,2,3,4,5};
		int i,j,count=1,temp,x;
		for(i=0;i<1;i++)
		{
			temp=a[i];
			for(j=1;j<5;j++)
			{
				if(temp!=a[j])
				{
					count++;
				}
				else if(temp==a[j])
				{
					count--;
				}
			}
		}
		for(i=0;i<count;i++)
		{
			x=0;
			temp=a[i];
			for(j=0;j<5;j++)
			{
				if(temp==a[j])
				{
					x++;
				}
			}
			System.out.println("num="+a[i]+"freq="+x);
		}
	}
}