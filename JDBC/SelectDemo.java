import java.sql.*;
class SelectDemo
{
	public static void main(String args[])
	{
		try
		{
			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			Connection con=DriverManager.getConnection("jdbc:odbc:mydb");
			Statement smt=con.createStatement();
			ResultSet rs=smt.executeQuery("select * from emp");
			while(rs.next())
			{
				System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getInt(3));
			}
			con.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}