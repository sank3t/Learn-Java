import javax.swing.*;
class Login
{
	JTextField t1,t2,t3;
	JFrame f2;
	JButton b3;
	public Login()
	{
		f2.setSize(100,200);
		f2.setVisible(true);
		t1=new JTextField(10);
		t2=new JTextField(10);
		t3=new JTextField(10);
		b3=new JButton("Login");
		f2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//f2.setLayout(new FlowLayout());
		f2.add(b3);f2.add(t1);//add(t2);add(t3);
	}
}