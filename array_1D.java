import java.util.*;
public class array_1D
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int[] a=new int[5];
		System.out.println("Enter array elements:");
		for(int i=0;i<5;i++)
		a[i]=sc.nextInt();
		for(int i=0;i<5;i++)
		System.out.println(a[i]+" ");
	}
}
