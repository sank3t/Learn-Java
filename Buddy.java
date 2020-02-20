class Buddy
{
	public static void main(String args[])
	{
		int i,j,temp1,temp2,num1,num2;
		for(i=1;i<=1000;i++)
		{
			temp1=0;
			num1=i;
			for(j=1;j<=(i/2);j++)
			{
				if(num1%j==0)
				{
					temp1=temp1+j;
				}
			}
			for(j=1;j<=1000;j++)
			{
				temp2=0;
				num2=j;
				for(int k=1;k<=(j/2);k++)
				{
					if(num2%k==0)
					{
						temp2=temp2+k;
					}
				}
				if(temp1==num2&&temp2==num1)
				{
				System.out.println(num1+"\t"+num2);
				}
			}
		}
	}
}