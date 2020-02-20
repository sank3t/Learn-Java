class StringDemo1
{
	public static void  main(String args[])
	{
		String s=new String("MACINTOSH");
		System.out.println(s.toLowerCase());
		char[] a=s.toCharArray();
		for(int i=0;i<a.length;i++)
		System.out.println(a[i]);
		byte[] b=s.getBytes();
		for(int i=0;i<b.length;i++)
		System.out.println(b[i]);
		System.out.println(s.concat(" PC 1989"));
		String s1="   Apple Computer";
		System.out.println(s1.trim());
	}
}