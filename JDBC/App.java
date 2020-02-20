import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
class UI implements ActionListener
{
	JButton b1,b2;
	JFrame f1=new JFrame("Student App");;
	public UI()
	{
		b1=new JButton("Sign In");
		b2=new JButton("Sign Out");
		f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f1.setLayout(new FlowLayout());
		f1.setVisible(true);
		f1.add(b1);//add(b2);
		b1.addActionListener(this);
		b2.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==b1)
		{
			new Login();
		}
		else
		{
			//setVisible(false);
		}
	}
	
}
class Login
{
	JTextField t1,t2,t3;
	JFrame f2;
	JButton b3;
	public Login()
	{
		
		f2.setVisible(true);
		t1=new JTextField(10);
		t2=new JTextField(10);
		t3=new JTextField(10);
		b3=new JButton("Login");
		f2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f2.setLayout(new FlowLayout());
		f2.add(b3);f2.add(t1);//add(t2);add(t3);
	}
}
class App
{
	public static void main(String args[])
	{
		new UI();
	}
}