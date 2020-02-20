import java.util.*;
class anonymous
{
	public static void show(String[] a)
	{
		for(int i=0;i<a.length;i++)
		System.out.print(a[i]+" ");
	}
	public static void main(String args[])
	{
		show(new String[] {"apple","macbook"} );
	}
}