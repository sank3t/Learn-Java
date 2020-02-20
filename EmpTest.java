import java.util.*;
class Emp
{
	private String name,desig;
	private int emp_id,salary;
	public void get_data()
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter employee id=");
		emp_id=sc.nextInt();
		System.out.print("Enter name:");
		name=sc.next();
		System.out.print("Enter designation:");
		desig=sc.next();
		System.out.print("Enter Salary=");
		salary=sc.nextInt();
	}
	public void show_data()
	{
		System.out.println(emp_id+"\t"+name+"\t"+desig+"\t\t"+salary);
	}
}
class EmpTest
{
	public static void main(String args[])
	{
		Emp[] e=new Emp[5];
		int i;
		for(i=0;i<5;i++)
		{
			e[i]=new Emp();
			e[i].get_data();
		}
		System.out.println("Emp.ID\tName\tDesignation\tSalary");
		for(i=0;i<5;i++)
		e[i].show_data();
	}
}