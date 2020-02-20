import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
class LoginDemo extends JFrame implements ActionListener
{
	JLabel l1,l2;
	JTextField t1;
	JPasswordField t2;
	JButton b1;
	public LoginDemo()
	{
		super("My App");
		setLayout(null);
		l1=new JLabel("UserName");
		l2=new JLabel("Password");
		t1=new JTextField(10);
		t2=new JPasswordField(10);
		b1=new JButton("Login");
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		add(l1);add(l2);add(t1);add(t2);add(b1);
		l1.setBounds(20,20,60,20);
		t1.setBounds(100,20,200,20);
		l2.setBounds(20,50,60,20);
		t2.setBounds(100,50,200,20);
		b1.setBounds(100,90,80,20);
		b1.addActionListener(this);
	}
	public void actionPerformed(ActionEvent e)
	{
		String a=t1.getText();
		String b=t2.getText();
		if(a.equals("abc")&&b.equals("123"))
		{
			JOptionPane.showMessageDialog(this,"Successfully logged in");
			this.dispose();
		}
		else
			JOptionPane.showMessageDialog(this,"Either UserName or Password is incorrect!!");
	}
	public static void main(String args[])
	{
		new LoginDemo();
	}
}