import java.io.*;
class RecordSaver
{
	public static void main(String args[])
	{
		try
		{
			PrintWriter out=new PrintWriter(new FileOutputStream("rec.txt"));
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter name,sal,id of an employee separated by comma");
			while(true)
			{
				String data=br.readLine();
				if(data.equals("end"))
					break;
				out.println(data);
			}
			out.close(); 
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}