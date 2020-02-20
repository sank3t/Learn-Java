import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
class GUI extends JFrame implements ActionListener
{
	JLabel l1,l2,l3;
	JTextField t1,t2,t3;
	JButton b1,b2,b3,b4;
	public GUI()
	{
		l1=new JLabel("No.1");
		l2=new JLabel("No.2");
		l3=new JLabel("Result");
		t1=new JTextField(10);
		t2=new JTextField(10);
		t3=new JTextField(10);
		b1=new JButton("+");
		b2=new JButton("-");
		b3=new JButton("*");
		b4=new JButton("/");
		setLayout(new FlowLayout());
		add(l1);add(t1);add(l2);add(t2);
		add(l3);add(t3);add(b1);add(b2);add(b3);add(b4);
		setVisible(true);
		setTitle("MyApp");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
	}
	public void actionPerformed(ActionEvent e)
	{
		try
		{
			int a=Integer.parseInt(t1.getText());
			int b=Integer.parseInt(t2.getText());
			int c=0;
			if(e.getSource()==b1)
				c=a+b;
			else if(e.getSource()==b2)
				c=a-b;
			else if(e.getSource()==b3)
				c=a*b;
			else
				c=a/b;
			t3.setText(String.valueOf(c));
		}
		catch(Exception e1)
		{
			t3.setText("InvalidValue");
		}
	}
	public static void main(String args[])
	{
		new GUI();
	}
}