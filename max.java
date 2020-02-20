import java.util.Scanner;
class max
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int[] a=new int[5];
		int i,j,temp;
		System.out.println("Enter array elements:");
		for(i=0;i<5;i++)
		a[i]=sc.nextInt();
		for(i=0;i<5;i++)
		for(j=i+1;j<5;j++)
		{
			if(a[i]<a[j])
			{
				temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
		}
		System.out.println("Max="+a[0]);
		System.out.println("Second Max="+a[1]);
	}
}