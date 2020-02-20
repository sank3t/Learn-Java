import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
class DialogDemo extends JFrame implements ActionListener
{
	JLabel l1;
	JButton b1,b2,b3;
	JTextField t1;
	public DialogDemo()
	{
		super("My App");
		l1=new JLabel("Msg");
		t1=new JTextField(10);
		b1=new JButton("Msg");
		b2=new JButton("Input");
		b3=new JButton("Confirm");
		setLayout(new FlowLayout());
		add(l1);add(t1);add(b1);
		add(b2);add(b3);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==b1)
		{
			JOptionPane.showMessageDialog(this,t1.getText());
		}
		else if(e.getSource()==b2)
		{
			String s=JOptionPane.showInputDialog(this,"Enter ur name");
			t1.setText("hello"+s);
		}
		else
		{
			int i=JOptionPane.showConfirmDialog(this,"MacBook is best");
			if(i==JOptionPane.YES_OPTION)
				t1.setText("right");
			else if(i==JOptionPane.NO_OPTION)
				t1.setText("wrong");
			else
				t1.setText("You are crap!!");
		}
	}
	public static void main(String args[])
	{
		new DialogDemo();
	}
}